package com.ccb.controller;

import com.ccb.entity.Emp;
import com.ccb.service.impl.EmpServiceImpl;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author linjiachun
 * @date 2019年11月7日17:27:53
 */
@RestController
@RequestMapping("/empC")
public class EmpController {
    Logger logger=Logger.getLogger(this.getClass());
    @Autowired
    EmpServiceImpl empService;
    @RequestMapping(value = "/api/emp",method = RequestMethod.GET)
    public List<Emp> getAllEmp(){
        return empService.getAllEmp();
    }

    @RequestMapping(value = "/api/emp/{empNo}",method = RequestMethod.GET)
    public Emp getEmpByNo(@PathVariable("empNo")int empNo){

        Emp emp = empService.getEmpById(empNo);
        return emp;
    }

    @RequestMapping(value = "/api/emp",method = RequestMethod.POST,produces={"text/html;charset=UTF-8;","application/json;"})
    public String addEmp(Emp emp){
        boolean b = empService.addEmp(emp);
        if (b){
            return "添加用户成功";}
        else{
            return "添加用户失败";}
    }
}
