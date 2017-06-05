package com.manufacturingPlant.virtualPlant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class HomeController {



    @RequestMapping("/views/home.jsp")
    public @ResponseBody String home(){
        return "home";
    }

    @RequestMapping("/views/employees/employees.jsp")
    public @ResponseBody String employees(){
        return "employees";
    }

    @RequestMapping("/views/employees/workshopEmployees.jsp")
    public @ResponseBody String workshopEmployees(){
        return "workshopEmployees";
    }

    @RequestMapping("/views/employees/departmentEmployees.jsp")
    public @ResponseBody String departmentEmployees(){
        return "departmentEmployees";
    }

}
