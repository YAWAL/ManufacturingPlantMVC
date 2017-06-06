package com.manufacturingPlant.virtualPlant.controller;

import com.manufacturingPlant.virtualPlant.service.api.DepartmentEmployeeService;
import com.manufacturingPlant.virtualPlant.service.api.EmployeeService;
import com.manufacturingPlant.virtualPlant.service.api.WorkshopEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

    private final DepartmentEmployeeService departmentEmployeeService;
    private final EmployeeService employeeService;
    private final WorkshopEmployeeService workshopEmployeeService;

    @Autowired
    public HomeController(DepartmentEmployeeService departmentEmployeeService, EmployeeService employeeService,
                          WorkshopEmployeeService workshopEmployeeService) {
        this.departmentEmployeeService = departmentEmployeeService;
        this.employeeService = employeeService;
        this.workshopEmployeeService = workshopEmployeeService;
    }

    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
    public String home(){
        return "home";
    }

//    @RequestMapping(value = {"/", "/home"}, method = RequestMethod.GET)
//    public String home(HttpSession httpSession, Principal principal){
//        httpSession.setAttribute("user", userService.getUserById(Integer.valueOf(principal.getName())));
//        return "home";
//    }


    @RequestMapping(value = "/views/employees/employees.jsp")
    public String employees(){
        return "/employees/employees";
    }

    @RequestMapping(value = "/views/employees/workshopEmployees.jsp")
    public String workshopEmployees(){
        return "employees/workshopEmployees";
    }

    @RequestMapping(value = "/views/employees/departmentEmployees.jsp")
    public String departmentEmployees(){
        return "/employees/departmentEmployees";
    }

}
