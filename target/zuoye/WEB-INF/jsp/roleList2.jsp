<%@ page language="java" import="java.util.*"  import="java.lang.*" import="com.zuoye.pojo.User" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE HTML>
<html lang="en" class="no-js">
<head>
    <title>用户管理</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <!-- CSS -->
    <link rel="stylesheet" href="<%=basePath%>nasa/css/reset.css">
    <link rel="stylesheet" href="<%=basePath%>nasa/css/supersized.css">
    <link rel="stylesheet" href="<%=basePath%>nasa/css/style.css">
</head>

<body>

<input id="basePath" type="hidden" value="<%=basePath%>" />

<div class="container">
    <!-- 标题 -->
    <div class="row">
        <div class="col-md-12">
            <h1>用户管理</h1>

        </div>



    </div>

    <!-- 表格  -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <tr>
                    <th>用户名</th>
                    <th>角色</th>



                </tr>
                <c:forEach items="${userRoleList}" var="userRole">
                    <tr>

                        <td >${userRole.userName}</td>
                        <c:forEach items="${userRole.roles}" var="Role">

                            <td >${Role.roleName}</td>
                            <td>
                                <li>
                                    <select  id="${Role.roleId}"  name="educa" >

                                        <option value="1" <c:if test="${educa=='1'}"></c:if>>管理员</option>
                                        <option value="2" <c:if test="${educa=='2'}"></c:if>>普通会员</option>
                                        <option value="3" <c:if test="${educa=='3'}"></c:if>>编辑角色</option>
                                        <option value="4" <c:if test="${educa=='4'}"></c:if>>删除角色</option>

                                    </select>
                                    <button onclick="add${Role.roleId}()">修改角色</button>


                                </li>
                            </td>
                        </c:forEach>



                    </tr>
                </c:forEach>
            </table>
        </div>
    </div>

</div>

<script src="<%=basePath%>nasa/js/jquery-1.8.2.min.js"></script>
<script src="<%=basePath%>nasa/js/supersized.3.2.7.min.js"></script>
<script src="<%=basePath%>nasa/js/supersized-init.js"></script>
<script src="<%=basePath%>nasa/js/scripts.js"></script>

</body>
</html>
