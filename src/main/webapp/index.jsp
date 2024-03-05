<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta charset="UTF-8">
<title>JSP3 Home</title>
</head>
<body>
	<%@ include file="header.jsp" %>
	<main>
		<h3>JSP3 HOME</h3>
		<ul>
			<li><a href="customer/list">회원목록</a></li>
			<li><a href="customer/join">회원등록</a></li>
			<li><a href="product/list">상품목록</a></li>
			<li><a href="product/register">상품등록</a></li>
		</ul>
	</main>
</body>
</html>