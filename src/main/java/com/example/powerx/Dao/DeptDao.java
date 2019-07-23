package com.example.powerx.Dao;

import com.example.powerx.entity.Dept;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

import java.util.List;

public interface DeptDao extends JpaRepository<Dept,Integer>, JpaSpecificationExecutor<Dept> {

    //Dept findByName(String zhonghua);\
   // List<Dept> findByName(String zhonghua);
}
