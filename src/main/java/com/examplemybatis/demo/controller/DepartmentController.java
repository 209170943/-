package com.examplemybatis.demo.controller;

import com.examplemybatis.demo.model.Department;
import com.examplemybatis.demo.model.User;
import com.examplemybatis.demo.service.DepartmentService;
import com.sun.media.sound.MidiOutDeviceProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;
import java.util.List;

@Controller
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @GetMapping(value = "/depts")
    public String skipEmployee(Model model){
        Collection<Department> departments = departmentService.findAll();
        model.addAttribute("dept",departments);
        System.out.println(departments);

        return "/department";
    }
    @GetMapping(value = "/employee")
    public String skipEmp(){

        return "/employee";
    }
    /*@GetMapping("/getlist")
    public String list(Model model){
        Collection <Department> departments = departmentService.findAll();
        model.addAllAttributes("getlist",departments);
        return "/department";
    }*/

}
