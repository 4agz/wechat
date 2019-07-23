package com.example.powerx;

import com.example.powerx.Dao.DeptDao;
import com.example.powerx.Dao.StfDao;
import com.example.powerx.entity.Dept;
import com.example.powerx.entity.Staff;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

import java.awt.print.Book;
import java.util.HashSet;
import java.util.Set;

@RunWith(SpringRunner.class)
@SpringBootTest
public class PowerxApplicationTests {

    @Test
    public void contextLoads() {
    }
    @Autowired
    private DeptDao deptDao;

    @Autowired
    private StfDao stfDao;

    @Test
    @Transactional
    @Rollback()
    public void init() {
        Staff staff1=new Staff("spring");
        Staff staff2=new Staff("spring");
        Staff staff3=new Staff("spring");

        Dept dept1=new Dept();

        Set<Staff> set=new HashSet<Staff>();

        set.add(staff1);
        set.add(staff2);
        set.add(staff3);
        dept1.setStaff(set);
        deptDao.save(dept1);


    }

    @After
    public void clear() {
        deptDao.deleteAll();
    }

//    @Test
//    public void find() {
//        Dept dept = deptDao.findByName("zhonghua");
//        System.out.println(dept);
//    }

}
