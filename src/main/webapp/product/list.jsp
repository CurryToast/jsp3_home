<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<html>
<head>
<meta charset="UTF-8">
<title>JSP3 Product</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/assets/css/listStyle.css" >
</head>
<body>
	<form style="display: flex; justify-content: space-around; align-items: center;">
		<div>
			<p>상품코드</p>
			<input type="text" name="pcode" value="${pcode}">
		</div>
		<div>
			<p>카테고리</p>
			<select name="category">
				<option value="">카테고리 선택</option>
				<c:forEach items="${categoryList}" var="categoryDto">
					<c:choose>
						<c:when test="${categoryDto.code == category}">
							<option value="${categoryDto.code}" selected>
								<c:out value="${categoryDto.name}" />
							</option>
						</c:when>
						<c:otherwise>
							<option value="${categoryDto.code}">
								<c:out value="${categoryDto.name}" />
							</option>
						</c:otherwise>
					</c:choose>
				</c:forEach>
			</select>
		</div>
		<div>
			<p>상품명</p>
			<input type="text" name="pname" value="${pname}">
		</div>
		<div>
			<p>가격</p>
			<input type="number" name="from" min="0" value="${from}"> ~ <input type="number" name="to" value="${to}">
		</div>
		<div>
			<button>검색</button>
			<button type="button" id="clear">초기화</button>
		</div>
	</form>
	<main>
		<ul class="list-header">
			<li class="pcode">상품코드</li>
			<li class="category">카테고리</li>
			<li class="pname">상품명</li>
			<li class="price">가격</li>
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
	<script type="text/javascript" src="${pageContext.request.contextPath}/assets/js/listScript.js"></script>
</body>
</html>