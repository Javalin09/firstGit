package com.ccb.service.impl;

import com.ccb.dao.IEmpDao;
import com.ccb.entity.Emp;
import com.ccb.service.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
/**
 * @author linjiachun
 * @date 2019年11月7日17:27:53
 */
@Service
public class EmpServiceImpl implements IEmpService {
    @Autowired
    IEmpDao empDao;

    @Override
    public List<Emp> getAllEmp() {
        return empDao.findAllEmp();
    }

    @Override
    public boolean addEmp(Emp emp) {
        return empDao.addEmp(emp)>0;
    }

    @Override
    public boolean deleEmpByNo(Integer empNo) {
        return empDao.deleEmpByNo(empNo)>0;
    }

    @Override
    public boolean updateSalByNo(Integer empNo, double money) {
        return empDao.updateSalByNo(empNo, money)>0;
    }

    @Override
    public Emp selectEmp1() {
        return empDao.selectEmp1();
    }

    @Override
    public List<Emp> findNameLike(String name) {
        return empDao.findNameLike("%"+name+"%");
    }

    @Override
    public Emp getEmpById(int empNo) {
        return empDao.findEmpById(empNo);
    }

    @Override
    public List<Emp> findEmpByPage(int pageNo, int pageSize) {
        return empDao.findEmpByPage(pageNo, pageSize);
    }

}
