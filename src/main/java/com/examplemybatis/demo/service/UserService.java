package com.examplemybatis.demo.service;


import com.examplemybatis.demo.mapper.UserMapper;
import com.examplemybatis.demo.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserMapper userMapper;

    public User findById(int id){
        return userMapper.findById(id);
    }


    public List<User> findAll(){
        return  userMapper.findAll();
    }

    public int insertUser(User user){
        return userMapper.insertUser(user);
    }

    public int deleateEmp(int id){ return userMapper.deleateEmp(id); }

    public int updateById( int id,User user){ return userMapper.updateById( id, user); }

}
