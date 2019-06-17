package com.examplemybatis.demo.mapper;

import com.examplemybatis.demo.model.Department;
import com.examplemybatis.demo.model.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DepartmentMapper {


    @Select("select * from tbl_dept where dept_id = #{id}")
    public User findById(@Param("id") int id);

    @Select("select * from tbl_dept")
    public List<Department> findAll();

}
