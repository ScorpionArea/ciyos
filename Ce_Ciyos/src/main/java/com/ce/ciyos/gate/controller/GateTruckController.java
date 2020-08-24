package com.ce.ciyos.gate.controller;

import com.ce.ciyos.gate.service.GateTruckService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("GateTruckControl")
public class GateTruckController {
  Sort.Direction DIRECTION = Sort.DEFAULT_DIRECTION;
  @Autowired GateTruckService gateTruckService;

  @RequestMapping(value = "/gateTruck.htm")
  public String gateTruck(Model model) {
    return "ciyos/gate/gateTruck";
  }
}
