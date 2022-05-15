<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Results</title>
<jsp:include page="/WEB-INF/bootstrapHead.jsp" />
</head>
<body>

	<c:if test="${addSpendingFlag}">
		<c:choose>
			<c:when test="${not empty spending}">
				<h3>Your expense was successfully added!</h3>
				<a class="btn btn-primary" href="getSpending.do?id=${spending.id}"
					role="button">See Expense</a>
			</c:when>
			<c:otherwise>
				<h3>Expense was not created!</h3>
			</c:otherwise>
		</c:choose>
	</c:if>

	<c:if test="${deleteSpendingFlag}">
		<c:choose>
			<c:when test="${containsFlag}">
				<h3>Expense was deleted!</h3>
			</c:when>
			<c:otherwise>
				<h3>Expense can't be deleted!</h3>
			</c:otherwise>
		</c:choose>
	</c:if>

	<c:if test="${updateSpendingFlag}">
		<c:choose>
			<c:when test="${not empty spending}">
				<h3>Expenses Updated!</h3>
				<a class="btn btn-primary" href="getSpending.do?id=${spending.id}"
					role="button">See Expense</a>
			</c:when>
			<c:otherwise>
				<h3>Can't update expenses!</h3>
			</c:otherwise>
		</c:choose>
	</c:if>
	<a class="btn btn-primary" href="home.do" role="button">Home</a>

	<jsp:include page="/WEB-INF/bootstrapFoot.jsp" />

</body>
</html>