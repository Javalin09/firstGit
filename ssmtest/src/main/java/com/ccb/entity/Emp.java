package com.ccb.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
/**
 * @author linjiachun
 * @date 2019年11月7日17:27:53
 */
public class Emp {
    private Integer empNo;//员工编号
    private String ename;//员工姓名
    private String job;//职位
    private Integer mgr;//经理编号
    private String hiredate;//入职时间
    private Double sal;//工资
    private Integer comm;//奖金
    private Integer deptNo;//部门编号
}
