<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/11/7
  Time: 22:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>修改员工</title>
    <style>
        table{
            width:600px;
            height:300px;
            list-style: none;
            border-collapse: collapse;
            background-color: lightskyblue;
        }
        td{
            border:1px solid black;
            text-align: center;
        }
        input[type="text"]{
            width:220px;
            height:30px;
            float:left;
        }
        input[type="submit"]{
            width:100px;
            height:30px;
        }
    </style>
</head>
<body>
<center>
    <form action = "/emp/updateEmp.do?pageNo=${pageNo}" method="post">
        <table>
            <tr>
                <td><input type = "hidden" name ="empNo" value="${emp.EMPNO}"/></td>
            </tr>
            <tr>
                <td>员工姓名：</td>
                <td><input type = "text" name ="eName" value="${emp.ENAME}"/></td>
            </tr>
            <tr>
                <td>职位：</td>
                <td><input type = "text" name ="job" value="${emp.JOB}"/></td>
            </tr>
            <tr>
                <td>薪酬：</td>
                <td><input type = "text" name = "sal" value="${emp.SAL}"/></td>
            </tr>
            <tr>
                <td>奖金：</td>
                <td><input type = "text" name = "comm" value="${emp.COMM}"/></td>
            </tr>
            <tr>
                <td>部门编号：</td>
                <td><input type = "text" name = "deptNo" value="${emp.DEPTNO}"/></td>
            </tr>
            <tr>
                <td colspan="2" style ="text-align: center"><input type = "submit" value = "修改"/></td>
            </tr>

        </table>
    </form>
</center>
</body>
</html>
