<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%
    String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
            + path + "/";
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>消息详情</title>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="<%=basePath%>nasa/css/reset.css">
    <link rel="stylesheet" href="<%=basePath%>nasa/css/supersized.css">
    <link rel="stylesheet" href="<%=basePath%>nasa/css/style.css">
    <script type="text/javascript">
        function diag() {
            alert("删除成功")
        }
    </script>
    <script src="https://cdn.bootcss.com/jquery/3.3.1/jquery.js"></script>
    <script type="text/javascript">
        function getData(){
            $.ajax({
                url:"<%=basePath%>/article/insertComment",
                type:"post",
                datatype:"json",
                data:JSON.stringify({
                    "commentContent": $('#comment').val(),
                     "userId"   : ${sessionScope.user.userId},
                    "articleId": $('#articleId').val(),
                    "commentDate": new Date()
                }),
                contentType: 'application/json',
                success:function(){
                    alert("已提交！");
                    window.location.href="<%=basePath%>/article/queryArticleById?articleId=${article.articleId}";

                }
            })
        }


    </script>

</head>
<body>
<input id="basePath" type="hidden" value="<%=basePath%>" />
<h1>消息详情</h1>


<div z>
    <div class="input_info">
        <input type="hidden" id="articleId" name="articleId" value="${article.articleId}"><br/>
        标题：<input type="text" readonly="true" id="title" name="title" value="${article.title}" /><br/>
        发表日期：<input type="text"  readonly="true" id="publishDate" name="publishDate" value="<fmt:formatDate value="${article.publishDate}" pattern="yyyy-MM-dd" />" /><br/>
        <input type="text"  readonly="true" id="articleContent" name="articleContent"
               style="width: 400px; height: 200px;" value="${article.articleContent}" /><br/>

    </div>



    <!--操作按钮-->

</div>

<div>
    <c:forEach items="${commentList}" var="comment">
        <table>
            <tr>
                <td>${comment.commentContent}</td>
                <td>&nbsp;&nbsp;评论人：${comment.userId}</td>
                <td>&nbsp;&nbsp;评论日期：<fmt:formatDate value="${comment.commentDate}"
                                    pattern="yyyy-MM-dd" /></td>
            </tr>
        </table>
    </c:forEach>

</div>
<input type="text" id="comment" name="comment" value="请输入评论" />
<input type="submit" value="提交" onclick="getData()">
<!-- Javascript -->
<script src="<%=basePath%>nasa/js/jquery-1.8.2.min.js"></script>
<script src="<%=basePath%>nasa/js/supersized.3.2.7.min.js"></script>
<script src="<%=basePath%>nasa/js/supersized-init.js"></script>
<script src="<%=basePath%>nasa/js/scripts.js"></script>
</body>
</html>