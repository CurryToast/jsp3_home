<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP3 Product Register</title>
</head>
<body>
	<%@ include file="../header.jsp" %>
	<main>
		<form action="" method="post">
			<div>
				<p>상품코드</p>
				<input type="text" name="pcode" placeholder="상품코드" />
			</div>
			<div>
				<p>카테고리</p>
				<select name="category">
					<c:forEach items="${categoryList}" var="dto">
						<option value="${dto.code}">
							<c:out value="${dto.name}" />
						</option>
					</c:forEach>
				</select>
			</div>
			<div>
				<p>상품명</p>
				<input type="text" name="pname" placeholder="상품명" />
			</div>
			<div>
				<p>가격</p>
				<input type="number" name="price" min="0"/>
			</div>
			<button>상품 등록</button>
		</form>
	</main>
</body>
</html>