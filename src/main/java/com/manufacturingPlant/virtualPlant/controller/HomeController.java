package com.manufacturingPlant.virtualPlant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping(value = "/views/home.jsp")
    public String home(){
        return "home";
    }

    @RequestMapping(value = "/views/employees/employees.jsp")
    public String employees(){
        return "employees";
    }

    @RequestMapping(value = "/views/employees/workshopEmployees.jsp")
    public String workshopEmployees(){
        return "workshopEmployees";
    }

    @RequestMapping(value = "/views/employees/departmentEmployees.jsp")
    public String departmentEmployees(){
        return "departmentEmployees";
    }

}
