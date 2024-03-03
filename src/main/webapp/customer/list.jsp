<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>JSP3 Customer List</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/listStyle.css" >
</head>
<body>
	<form style="display: flex; justify-content: space-around; align-items: center;">
		<div>
			<p>고객 ID</p>
			<input type="text" name="customerId" value="${id}">
		</div>
		<div>
			<p>이름</p>
			<input type="text" name="name" value="${name}">
		</div>
		<div>
			<p>나이</p>
			<input type="number" name="from" min="0" value="${from}"> ~ <input type="number" name="to" value="${to}">
		</div>
		<div>
			<button>검색</button>
			<button type="button" id="clear">초기화</button>
		</div>
	</form>
	<main>
		<ul>
			<li>고객 ID</li>
			<li>이름</li>
			<li>이메일</li>
			<li>나이</li>
			<li>등록 일시</li>
		</ul>
		<c:forEach items="${list}" var="dto" varStatus="status">
			<ul>
				<li><c:out value="${dto.custom_id}" /></li>
				<li><c:out value="${dto.name}" /></li>
				<li><c:out value="${dto.email}" /></li>
				<li><c:out value="${dto.age}" /></li>
				<li>
					<fmt:formatDate value="${dto.reg_date}" pattern="yyyy-MM-dd hh:mm:ss"/>
				</li>
			</ul>
		</c:forEach>
	</main>
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/listScript.js"></script>
</body>
</html>