package com.examplemybatis.demo.model;

public class User {

    public int emp_id;
    public String emp_name;
    public String emp_email;
    public String gender;
    public int department_id;

    @Override
    public String toString() {
        return "User{" +
                "emp_id=" + emp_id +
                ", emp_name='" + emp_name + '\'' +
                ", emp_email='" + emp_email + '\'' +
                ", gender='" + gender + '\'' +
                ", department_id=" + department_id +
                '}';
    }

    public int getEmp_id(String s) {
        return emp_id;
    }

    public void setEmp_id(int emp_id) {
        this.emp_id = emp_id;
    }

    public String getEmp_name(String 三狗子) {
        return emp_name;
    }

    public void setEmp_name(String emp_name) {
        this.emp_name = emp_name;
    }

    public String getEmp_email(String s) {
        return emp_email;
    }

    public void setEmp_email(String emp_email) {
        this.emp_email = emp_email;
    }

    public String getGender(String 女) {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getDepartment_id(String s) {
        return department_id;
    }

    public void setDepartment_id(int department_id) {
        this.department_id = department_id;
    }
}
