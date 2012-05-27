<%@page language="java" contentType="text/html;charset=UTF-8" %>
<% request.setCharacterEncoding("UTF-8"); %>
<%@page import="${groupId}.App" %>
<% App a = new App(); %>
<!DOCTYPE html>
<html>
<head>
<title><%= a.getMessage() %></title>
<meta charset="UTF-8">
</head>
<body>
<p>こんにちはこんにちは!</p>
</body>
</html>

