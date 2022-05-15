<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Spending Tracker</title>
<jsp:include page="bootstrapHead.jsp"/>
</head>
<body>

	<h1>Welcome to Spendings Tracker</h1>

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
			<c:forEach var="spending" items="${spending}">
				<tr>
					<td>${spending.id}</td>
					<td>${spending.groceries}</td>
					<td>${spending.billsUtilities}</td>
					<td>${spending.shopping}</td>
					<td>${spending.gas}</td>
					<td>${spending.car}</td>
					<td>${spending.healthInsurance}</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

	<form action="getSpending.do" method="GET">
		<label for="id">Search By ID</label> <input type="number" name="id"
			value="" id="idField"><input class="btn btn-primary" type="submit" value="Submit">
	</form>

	<a class="btn btn-primary" href="getAllSpendings.do" role="button">Get all Expenses</a>

	<jsp:include page="bootstrapFoot.jsp"/>

</body>
</html>