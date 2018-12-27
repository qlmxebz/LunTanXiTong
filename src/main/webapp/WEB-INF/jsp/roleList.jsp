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

                        <td ><a href="<%=basePath%>/user/userDetail?userId=${userRole.userId}">${userRole.userName}</a></td>
                        <c:forEach items="${userRole.roles}" var="Role">

                            <td ><a href="<%=basePath%>/userRole/queryAuthority?roleId=${Role.roleId}">${Role.roleName}</a></td>
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
