package com.example.powerx.entity;

import net.bytebuddy.dynamic.loading.ClassReloadingStrategy;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "dept")
public class Dept {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer dept_id;
    @Column(name = "dept_name")
    private String dept_name;
    @Column(name = "parentId")
    private Integer parentId;//父部门ID
    @Column(name = "dept_order")
    private String orders;//等级


    //配置部门和员工之间的关系(一对多）
    /**
     * 使用注解的形式配置多表关系
     *  1.声明关系
     *      @OneToMany:配置一段多关系
     *          targetEntity，对方的对象的字码对象
     *  2.配置外键（中间表）
     *      JoinColumn:配置外键
     *          name：外键字段名称
     *          referencedColumnName：参照的主表的主键名称
     *  *在部门实体类上（一的一方）添加了外键配置，所以2对于客户而言也
     *  具备了外键的作用
     */
    //@OneToMany(targetEntity = Staff.class)
    @OneToMany(cascade = CascadeType.ALL,fetch =FetchType.EAGER)
    @JoinColumn(name = "dept_s_id",referencedColumnName = "dept_id")
    private Set<Staff> staff=new HashSet<>();

    @Override
    public String toString() {
        return "Dept{" +
                "dept_id=" + dept_id +
                ", dept_name='" + dept_name + '\'' +
                ", parentId=" + parentId +
                ", orders='" + orders + '\'' +
                '}';
    }

    public Integer getDept_id() {
        return dept_id;
    }

    public void setDept_id(Integer dept_id) {
        this.dept_id = dept_id;
    }

    public String getDept_name() {
        return dept_name;
    }

    public void setDept_name(String dept_name) {
        this.dept_name = dept_name;
    }

    public Integer getParentId() {
        return parentId;
    }

    public void setParentId(Integer parentId) {
        this.parentId = parentId;
    }

    public String getOrders() {
        return orders;
    }

    public void setOrders(String orders) {
        this.orders = orders;
    }

    public Set<Staff> getStaff() {
        return staff;
    }

    public void setStaff(Set<Staff> staff) {
        this.staff = staff;
    }
}
