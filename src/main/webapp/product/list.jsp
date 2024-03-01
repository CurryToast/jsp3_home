<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>JSP3 Product</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/listStyle.css" >
</head>
<body>
	<main>
		<ul>
			<li>상품코드</li>
			<li>카테고리</li>
			<li>상품명</li>
			<li>가격</li>
		</ul>
		<c:forEach items="${list}" var="dto">
		<ul>
			<li><c:out value="${dto.pcode}" /></li>
			<li><c:out value="${dto.category}" /></li>
			<li><c:out value="${dto.pname}" /></li>
			<li><c:out value="${dto.price}" /></li>
		</ul>
		</c:forEach>
	</main>
</body>
</html>