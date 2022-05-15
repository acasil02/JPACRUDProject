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

	<h1>Welcome to Spendings Tracker</h1>


	<c:choose>
		<c:when test="${not empty spendings[0]}">
			<table class="table table-striped table-hover">
				<thead class="table-dark">
					<tr>
						<th>ID</th>
						<th>Groceries</th>
						<th>Bills-Utilities</th>
						<th>Shopping</th>
						<th>Gas</th>
						<th>Car</th>
						<th>Health Insurance</th>
					</tr>
				</thead>

				<tbody>
					<c:forEach var="s" items="${spendings}">
						<tr>
							<td>${s.id}</td>
							<td>${s.groceries}</td>
							<td>${s.billsUtilities}</td>
							<td>${s.shopping}</td>
							<td>${s.gas}</td>
							<td>${s.car}</td>
							<td>${s.healthInsurance}</td>

							<td>

								<form action="deleteSpending.do" method="POST">
									<input class="btn btn-primary" type="submit" value="Delete">
									<input type="hidden" name="id" value="${s.id}">
								</form>


								<form action="updateSpending.do" method="POST">
									<input class="btn btn-primary" type="submit" value="Update">
									<input type="hidden" name="id" value="${s.id}">
								</form>

							</td>

						</tr>
					</c:forEach>
				</tbody>
			</table>
			<a class="btn btn-primary" href="home.do" role="button">Home</a>
			<a class="btn btn-primary" href="addSpending.do" role="button">Add
				Expenses</a>

		</c:when>
		<c:otherwise>
			<h4>Your search did not generate any results</h4>
			<a class="btn btn-primary" href="home.do" role="button">Home</a>
			<button class="btn btn-primary" name="Add Expenses">Add
				Expenses</button>
		</c:otherwise>
	</c:choose>

	<jsp:include page="/WEB-INF/bootstrapFoot.jsp" />

</body>
</html>