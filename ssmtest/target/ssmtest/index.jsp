<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>
<script type="text/javascript" src="${pageContext.request.contextPath}/style/js/jquery-3.4.1.min.js"></script>
<script type="text/javascript">
function getEmpById() {
    var empNo = $("#empNo").val();
    $.ajax({
        type:"GET",
        url:"${pageContext.request.contextPath}/empC/api/emp/"+empNo,
        success:function (emp) {
            /*alert("获得一个对象:"+emp);*/
            alert(emp.ename+"");
            $("#eName").val(emp.ename);
            $("#job").val(emp.job);
            $("#mgr").val(emp.mgr);
            $("#sal").val(emp.sal);
            $("#comm").val(emp.comm);
            $("#deptNo").val(emp.deptNo);
        }
    })
}
</script>
<h2>Hello World!</h2>
<input type="text" name="empNo" id="empNo" placeholder="输入编号以查询"><br>
<button onclick="getEmpById()">查询</button>
<hr>
<form action="${pageContext.request.contextPath}/empC/api/emp" method="post">
    用户名:<input type="text" name="eName" id="eName"><br>
    职位:<input type="text" name="job" id="job"><br>
    经理编号 <input type="text" name="mgr" id="mgr"><br>
    工资 <input type="text" name="sal" id="sal"><br>
    奖金<input type="text" name="comm" id="comm"><br>
    部门编号<input type="text" name="deptNo" id="deptNo"><br>
    <input type="submit" value="添加">
</form>
<hr>
<button>修改</button>
<button>删除</button>
</body>
</html>
