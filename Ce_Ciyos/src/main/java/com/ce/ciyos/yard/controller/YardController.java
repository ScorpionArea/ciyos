package com.ce.ciyos.yard.controller;

import com.ce.ciyos.gate.service.GateTruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("YardControl")
public class YardController {
  Sort.Direction DIRECTION = Sort.DEFAULT_DIRECTION;
  @Autowired GateTruckService gateTruckService;

  @RequestMapping(value = "/yard.htm")
  public String yard(Model model) {
    return "ciyos/yard/yard";
  }

  @RequestMapping(value = "/yardEdit.htm")
  public String yardEdit(Model model) {
    return "ciyos/yard/yardEdit";
  }
}
