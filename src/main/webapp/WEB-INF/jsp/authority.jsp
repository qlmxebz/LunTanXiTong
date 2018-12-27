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
    <title>用户详情</title>
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
            <h1>用户详情</h1>

        </div>



    </div>

    <!-- 表格  -->
    <div class="row">
        <div class="col-md-12">
            <table class="table table-hover">
                <input id="roleId" readonly="true" hidden="true" type="text" value="${role.roleId}" ></br>
                <input id="authorityName" readonly="true" type="text" value="${role.authorityName}" ></br>

                <div>
                    <li>
                        <select  id="educa"  name="educa" class="table table-hover" >

                            <option value="1" <c:if test="${educa=='1'}"></c:if>>编辑权限</option>
                            <option value="2" <c:if test="${educa=='2'}"></c:if>>删除权限</option>
                            <option value="3" <c:if test="${educa=='3'}"></c:if>>管理员权限</option>


                        </select>
                        <button onclick="add()">修改权限</button>
                        <script type="text/javascript">
                            function add(){
                                $.ajax({
                                    url:"<%=basePath%>/userRole/updateRole",
                                    type:"post",
                                    datatype:"json",
                                    data:JSON.stringify({
                                        "roleId": $('#educa').val(),

                                        "userId": ${user.userId}
                                    }),
                                    contentType: 'application/json',
                                    success:function(){
                                        alert("已修改！");
                                        window.location.href="<%=basePath%>/user/queryRoles";
                                    }
                                })
                            }
                        </script>
                    </li>
                </div>
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
