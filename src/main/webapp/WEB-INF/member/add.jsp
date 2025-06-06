<%--
  Created by IntelliJ IDEA.
  User: student
  Date: 2025-06-11
  Time: 오후 2:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="/WEB-INF/header.jsp" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h1> 회원 추가 페이지 </h1>
  <form action="/member/add" method="POST">
    이름 : <input type="text" id="name" name="name" required/> <br>
    이메일 : <input type="text" id="email" name="email" required/> <br>
    <button type="submit"> 회원 추가 </button>
  </form>
</body>
</html>
