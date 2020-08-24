package com.ce.ciyos.order.controller;

import com.ce.ciyos.order.entiy.OrderIeCntr;
import com.ce.ciyos.order.entiy.OrderIeCntrPK;
import com.ce.ciyos.order.service.OrderIeCntrService;
import com.ce.pojo.DateGrid;
import com.ce.pojo.EzuiGridData;
import com.ce.sys.entiy.SysUser;
import org.apache.shiro.SecurityUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Controller;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("OrderIeCntrControl")
public class OrderIeCntrController {
  Sort.Direction DIRECTION = Sort.DEFAULT_DIRECTION;
  @Autowired OrderIeCntrService orderIeCntrService;

  //  @RequestMapping(value = "/orderCntr.htm")
  //  public String orderCntr(Model model) {
  //    return "ciyos/order/orderCntr";
  //  }

  // @RequiresPermissions("sysUser:find")
  @RequestMapping(value = "/find", method = RequestMethod.POST)
  @ResponseBody
  public EzuiGridData find(
      Integer page, Integer rows, String sort, String order, String orderCntrId) {
    EzuiGridData ezuiGridData = new EzuiGridData();
    if (("desc").equals(order)) {
      DIRECTION = Sort.Direction.DESC;
    } else {
      DIRECTION = Sort.Direction.ASC;
    }
    Specification specification =
        new Specification<OrderIeCntr>() {
          @Override
          public Predicate toPredicate(
              Root<OrderIeCntr> root,
              CriteriaQuery<?> criteriaQuery,
              CriteriaBuilder criteriaBuilder) {
            List<Predicate> predicates = new ArrayList<Predicate>();
            //            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            if (!StringUtils.isEmpty(orderCntrId)) {
              predicates.add(criteriaBuilder.equal(root.get("orderCntrId"), orderCntrId));
            }
            //            if (!StringUtils.isEmpty(endDate)) {
            //              try {
            //                predicates.add(
            //                    criteriaBuilder.lessThanOrEqualTo(
            //                        root.get("tideDate").as(Date.class), sdf.parse(endDate)));
            //              } catch (ParseException e) {
            //                e.printStackTrace();
            //              }
            //            }
            return criteriaBuilder.and(predicates.toArray(new Predicate[predicates.size()]));
          }
        };
    if (StringUtils.isEmpty(page) && StringUtils.isEmpty(rows)) {
      List<OrderIeCntr> orderIeCntrs =
          orderIeCntrService.findAll(specification, new Sort(DIRECTION, order));
      ezuiGridData.setRows(orderIeCntrs);
    } else {
      Pageable pageable = new PageRequest(page - 1, rows, DIRECTION, sort);
      Page<OrderIeCntr> orderIeCntrs = orderIeCntrService.findAll(specification, pageable);
      ezuiGridData.setRows(orderIeCntrs.getContent());
      ezuiGridData.setTotal(orderIeCntrs.getTotalElements());
    }
    return ezuiGridData;
  }

  // @RequiresPermissions("sysUser:save")
  @RequestMapping(value = "/save", method = RequestMethod.POST)
  @ResponseBody
  public void save(@RequestBody DateGrid<OrderIeCntr> dateGrid) {
    SysUser sUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
    Date date = new Date();
    List<OrderIeCntr> inserted = dateGrid.getInserted();
    List<OrderIeCntr> deleted = dateGrid.getDeleted();
    List<OrderIeCntr> updated = dateGrid.getUpdated();
    if (!inserted.isEmpty()) {
      for (OrderIeCntr orderIeCntr : inserted) {
        orderIeCntr.setCreator(sUser.getUserCode());
        orderIeCntr.setCreatedTim(new Timestamp(date.getTime()));
        orderIeCntr.setChanger(sUser.getUserCode());
        orderIeCntr.setChangedTim(new Timestamp(date.getTime()));
        orderIeCntrService.save(orderIeCntr);
      }
    }
    if (!deleted.isEmpty()) {
      for (OrderIeCntr orderIeCntr : deleted) {
        OrderIeCntrPK orderIeCntrPK = new OrderIeCntrPK();
        orderIeCntrPK.setOrderNo(orderIeCntr.getOrderNo());
        orderIeCntrPK.setSeqNo(orderIeCntr.getSeqNo());
        orderIeCntrService.deleteById(orderIeCntrPK);
      }
    }
    if (!updated.isEmpty()) {
      for (OrderIeCntr orderIeCntr : updated) {
        orderIeCntr.setChanger(sUser.getUserCode());
        orderIeCntr.setChangedTim(new Timestamp(date.getTime()));
        orderIeCntrService.save(orderIeCntr);
      }
    }
  }
}
