package com.example.powerx.entity;

import javax.persistence.*;
import javax.validation.Valid;

@Entity
@Table(name = "staff")
public class Staff {

    @Id
    @GeneratedValue
    private Integer user_id;
    @Column(name = "staff_name")
    private String staff_name;
    @Column(name = "telephone")
    private String telephone;
    @Column(name = "wechat")
    private String wechat;
    @Column(name = "job")
    private String job;

    /**
     * 配置员工到部门之间的多对一的关系
     *  使用注解形式配置多对一关系
     *      1.配置表关系
     *          ManyToOne:配置多对一关系
     *              targetEntity：对方的实体类字节码
     *      2.配置外键
     * @return
     */
    @ManyToOne
    @JoinColumn(name = "dept_s_id")
    private Dept dept;

    public Staff(String name) {
        this.staff_name=name;
    }
    public Staff(){}

    @Override
    public String toString() {
        return "Staff{" +
                "user_id=" + user_id +
                ", name='" + staff_name + '\'' +
                ", telephone='" + telephone + '\'' +
                ", wechat='" + wechat + '\'' +
                ", job='" + job + '\'' +
                '}';
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getStaff_name() {
        return staff_name;
    }

    public void setStaff_name(String staff_name) {
        this.staff_name = staff_name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getWechat() {
        return wechat;
    }

    public void setWechat(String wechat) {
        this.wechat = wechat;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
}
