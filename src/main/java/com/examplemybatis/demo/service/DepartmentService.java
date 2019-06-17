package com.examplemybatis.demo.service;


import com.examplemybatis.demo.mapper.DepartmentMapper;
import com.examplemybatis.demo.model.Department;
import com.examplemybatis.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DepartmentService {

    @Autowired
    DepartmentMapper departmentMapper;

    public List<Department> findAll(){
        return departmentMapper.findAll();
    };
}
