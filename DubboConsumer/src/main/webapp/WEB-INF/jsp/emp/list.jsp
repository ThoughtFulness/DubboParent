<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7
  Time: 16:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<style>
   td{border: 1px solid black;}
   input{width:220px;height:30px;border: 1px solid red}
   button{width:50px;height: 30px;}
   tr{text-align: center}
   table
   {
       border-collapse:collapse;
       width: 1912px;
       line-height: 60px;
       background-color: lightskyblue ;
   }
</style>
<html>
<head>
    <title>用户列表</title>
    <script src="/jq/jquery.min.js"></script>
</head>
<body>
    <center>
        <h3>用户列表</h3>
        <input type="text" name="sel" id="sel" value="${sel}">
        <input type="button" value="查询" onclick="queryEmp()" style="width: 50px;height: 30px;">
        <a href="ToAdd.do" style="padding-left: 1559px;">新增员工</a>
        <table>
            <tr>
                <td>员工编号</td>
                <td>员工姓名</td>
                <td>入职时间</td>
                <td>职位</td>
                <td>薪酬</td>
                <td>奖金</td>
                <td>部门编号</td>
                <td>操作</td>
            </tr>
            <c:forEach items="${empList}" var="emp">
                <tr>
                    <td>${emp.EMPNO}</td>
                    <td>${emp.ENAME}</td>
                    <td>${emp.HIREDATE}</td>
                    <td>${emp.JOB}</td>
                    <td>${emp.SAL}</td>
                    <td>${emp.COMM}</td>
                    <td>${emp.DEPTNO}</td>
                    <td>
                        <a href="/emp/getById.do?empNo=${emp.EMPNO}&pageNo=${pageNo}">修改</a>&nbsp;&nbsp;
                        <a href="/emp/deleteEmp.do?empNo=${emp.EMPNO}&pageNo=${pageNo}">删除</a>
                    </td>
                </tr>
            </c:forEach>
            <tr>
                <td colspan="8">${stringPage}</td>
            </tr>
        </table>
    </center>
    <script>
        function queryEmp() {
            var sel = $("#sel").val();
            window.location.href="/emp/list.do?sel="+sel;

        }
    </script>
</body>
</html>
