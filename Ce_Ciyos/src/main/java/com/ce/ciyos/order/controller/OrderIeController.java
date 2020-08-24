package com.ce.ciyos.order.controller;

import com.ce.ciyos.order.entiy.OrderIe;
import com.ce.ciyos.order.service.OrderIeService;
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
import org.springframework.ui.Model;
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
@RequestMapping("OrderIeControl")
public class OrderIeController {
  Sort.Direction DIRECTION = Sort.DEFAULT_DIRECTION;
  @Autowired OrderIeService orderIeService;

  @RequestMapping(value = "/orderIe.htm")
  public String orderIe(Model model) {
    return "ciyos/order/orderIe";
  }

  // @RequiresPermissions("sysUser:find")
  @RequestMapping(value = "/find", method = RequestMethod.POST)
  @ResponseBody
  public EzuiGridData find(Integer page, Integer rows, String sort, String order) {
    EzuiGridData ezuiGridData = new EzuiGridData();
    if (("desc").equals(order)) {
      DIRECTION = Sort.Direction.DESC;
    } else {
      DIRECTION = Sort.Direction.ASC;
    }
    Specification specification =
        new Specification<OrderIe>() {
          @Override
          public Predicate toPredicate(
              Root<OrderIe> root, CriteriaQuery<?> criteriaQuery, CriteriaBuilder criteriaBuilder) {
            List<Predicate> predicates = new ArrayList<Predicate>();
            //            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            //                if (!StringUtils.isEmpty(userInvalid)) {
            //                  predicates.add(criteriaBuilder.equal(root.get("userInvalid"),
            // userInvalid));
            //                }
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
      List<OrderIe> orderIes = orderIeService.findAll(specification, new Sort(DIRECTION, sort));
      ezuiGridData.setRows(orderIes);
    } else {
      Pageable pageable = new PageRequest(page - 1, rows, DIRECTION, sort);
      Page<OrderIe> orderIes = orderIeService.findAll(specification, pageable);
      ezuiGridData.setRows(orderIes.getContent());
      ezuiGridData.setTotal(orderIes.getTotalElements());
    }
    return ezuiGridData;
  }

  // @RequiresPermissions("sysUser:save")
  @RequestMapping(value = "/save", method = RequestMethod.POST)
  @ResponseBody
  public void save(@RequestBody DateGrid<OrderIe> dateGrid) {
    SysUser sUser = (SysUser) SecurityUtils.getSubject().getPrincipal();
    Date date = new Date();
    List<OrderIe> inserted = dateGrid.getInserted();
    List<OrderIe> deleted = dateGrid.getDeleted();
    List<OrderIe> updated = dateGrid.getUpdated();
    if (!inserted.isEmpty()) {
      for (OrderIe orderIe : inserted) {
        orderIe.setCreator(sUser.getUserCode());
        orderIe.setCreatedTim(new Timestamp(date.getTime()));
        orderIe.setChanger(sUser.getUserCode());
        orderIe.setChangedTim(new Timestamp(date.getTime()));
        orderIeService.save(orderIe);
      }
    }
    if (!deleted.isEmpty()) {
      for (OrderIe orderIe : deleted) {
        orderIeService.deleteById(orderIe.getOrderNo());
      }
    }
    if (!updated.isEmpty()) {
      for (OrderIe orderIe : updated) {
        orderIe.setChanger(sUser.getUserCode());
        orderIe.setChangedTim(new Timestamp(date.getTime()));
        orderIeService.save(orderIe);
      }
    }
  }
}
