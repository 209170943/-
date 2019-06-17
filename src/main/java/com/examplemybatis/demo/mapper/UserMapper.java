package com.examplemybatis.demo.mapper;

import com.examplemybatis.demo.model.User;
import org.apache.ibatis.annotations.*;

import java.util.List;

@Mapper
public interface UserMapper {


/*查询*/

    @Select("select * from tbl_emp where emp_id = #{id}")
     public User findById(@Param("id") int id);

    @Select("select * from tbl_emp")
     public List<User> findAll();

    @Insert("insert into tbl_emp values(#{emp_id},#{emp_name},#{emp_email},#{gender},#{department_id})")
    public int insertUser(User user);

    @Delete("delete from tbl_emp where emp_id=#{id}")
    public int deleateEmp(@Param("id") int id);

    @Update("update tbl_emp set emp_name=#{user.emp_name},emp_email=#{user.emp_email},gender=#{user.gender},department_id=#{user.department_id} where emp_id=#{id}")
    public int updateById( int id,User user);
}
