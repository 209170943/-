package com.examplemybatis.demo.controller;

import com.examplemybatis.demo.model.Department;
import com.examplemybatis.demo.model.User;
import com.examplemybatis.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

//@RestController
@Controller
public class UserController {

    @Autowired
    UserService userService;
/*根据id查找（现在没用）*/
    @GetMapping("/user/{id}")
    public User findById(@PathVariable("id") int id){

        return userService.findById(id);
    }
/*跳转到部门信息*/
    @GetMapping(value = "/department")
    public String skipDepartment(){

        return "department";
    }
   /* @GetMapping("/emps")
    public String list(Model model){
        Collection<User> users = userService.findAll();
        model.addAttribute("emps",users);
        return "employeetest";
    }*/
/*显示数据库员工里面的信息*/
    @GetMapping("/emps")
    public String list(Model mod){
        Collection<User> users = userService.findAll();
        mod.addAttribute("emps",users);
        return "employee";
    }
/*来到添加页面*/
    @GetMapping("/addEmployee")
    public String addUser(){

        return "addEmployee";
    }
    /*添加一个新的员工*/
    @PostMapping("/emp")
    public String addEmployee(User user){
        System.out.println("员工信息："+user);
        userService.insertUser(user);
        return "redirect:/emps";
    }
    /*删除一个员工信息*/
    @GetMapping(value = "/emp/{id}")
    public String deleateEmp(@PathVariable("id")int id){
        userService.deleateEmp(id);
        return "redirect:/emps";
    }
    /*@GetMapping(value = "/emp/{id}")
    public String updateEmp(@PathVariable("id")int id){
       // userService.deleateEmp(id);
        return "updateEmployee";
    }*/
    /*来到修改页面*/
    @GetMapping(value = "/emps/{id}")
    public String updateEmp(@PathVariable("id")int id,Model model){
        // userService.deleateEmp(id);
        User user = userService.findById(id);
        model.addAttribute("empss",user);
       // System.out.println(id);
        return "updateEmployee";
    }
    /*修改员工信息*/
    @PostMapping(value = "/empss")
    public String updateEmps(User user){
      // User user = userService.findById(id);
        userService.updateById(user.emp_id,user);
        System.out.println( user);
        //System.out.println(user.emp_id);
        return "redirect:/emps";
    }


}
