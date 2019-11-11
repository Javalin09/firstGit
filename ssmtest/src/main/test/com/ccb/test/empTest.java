package com.ccb.test;

import com.ccb.entity.Emp;
import com.ccb.service.impl.EmpServiceImpl;
import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class empTest {
    Logger logger=Logger.getLogger(empTest.class);
    @Autowired
    EmpServiceImpl service;
    @Test
    public void getAll(){
        List<Emp> allEmp = service.getAllEmp();
        for (Emp emp:allEmp
             ) {
            logger.debug(emp+"");
        }
    }
    @Test
    public void addEmp(){
        Emp emp = new Emp(null, "胖虎250", "洗厕所", 7934, null, 8900.00, 500, 10);
        logger.debug("插入一个新用户"+emp);
        boolean b = service.addEmp(emp);
        if (b){
        logger.debug("插入成功");
        }else {
            logger.debug("插入失败");
        }
    }
    @Test
    public void deleEmp(){
        logger.debug("删除用户胖虎");
        boolean b = service.deleEmpByNo(8093);
        if (b) logger.debug("删除成功");
        else logger.debug("删除失败");
    }
    @Test
    public void update(){
        logger.debug("给胖虎涨工资1000");
        boolean b = service.updateSalByNo(8093, 1000.00);
        if (b) logger.debug("修改成功");
        else logger.debug("修改失败");
    }
    @Test
    public void selectEmp1(){
        logger.debug("倒叙查出胖虎");
        Emp emp = service.selectEmp1();
        logger.debug(emp+"");
    }
    @Test
    public void findByName(){
        logger.debug("模糊查询名字有A的");
        /*logger.debug("查找名字为A开头,或第二个字母为A的");*/
        List<Emp> emps = service.findNameLike("A");
        for (Emp emp:emps
             ) {
            logger.debug(""+emp);
        }
    }
    @Test
    public void findEmpByPage(){
        logger.debug("分页查询");
        List<Emp> empByPage = service.findEmpByPage(1, 5);
        for (Emp emp:empByPage
             ) {
            logger.debug(""+emp);
        }

    }


}
