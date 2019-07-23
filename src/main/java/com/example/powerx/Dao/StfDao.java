package com.example.powerx.Dao;

import com.example.powerx.entity.Staff;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface StfDao extends JpaRepository<Staff,Integer>, JpaSpecificationExecutor<Staff> {
}
