package com.examplemybatis.demo.model;

public class Department {

    private int dept_id;
    private String dept_name;
    private String dept_leader;

    public int getDept_id() {
        return dept_id;
    }

    public void setDept_id(int dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public String getDept_leader() {
        return dept_leader;
    }

    public void setDept_leader(String dept_leader) {
        this.dept_leader = dept_leader;
    }

    @Override
    public String toString() {
        return "Department{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", dept_leader='" + dept_leader + '\'' +
                '}';
    }
}
