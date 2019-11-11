package com.ccb.service;

import com.ccb.entity.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;
/**
 * @author linjiachun
 * @date 2019年11月7日17:27:53
 */
public interface IEmpService {
    /**
     * 查全部
     * @return
     */
    List<Emp> getAllEmp();

    /**
     * 分页查询
     * @param pageNo
     * @param pageSize
     * @return
     */
    List<Emp> findEmpByPage(@Param("pageNo") int pageNo, @Param("pageSize") int pageSize);

    /**
     * 添加一名员工
     * @param emp
     * @return
     */
    boolean addEmp(@Param("emp") Emp emp);

    /**
     * 根据编号删除员工
     * @param empNo
     * @return
     */
    boolean deleEmpByNo(@Param("empNo")Integer empNo);

    /**
     * 根据编号增加工资
     * @param empNo
     * @param money
     * @return
     */
    boolean updateSalByNo(@Param("empNo")Integer empNo,@Param("money")double money);

    /**
     * 只查一个员工
     * @return
     */
    Emp selectEmp1();

    /**
     * 模糊查询第一个字为"A"或第二个字母为"A"
     * @param name
     * @return
     */
    List<Emp> findNameLike(String name);
    /**
     * 根据id查员工
     * @param empNo
     * @return
     */
    Emp getEmpById(@Param("empNo")int empNo);
}
