<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Claims History Form</title>
</head>
<body>
	<form:form name="submitForm" method="POST" action="claims">
		<div align="center">
			<table>
				<tr>
					<td>Enter Policy Number</td>
					<td><input type="text" name="policyNumber" /></td>
				</tr>
				<tr>
					<td></td>
					<td><input type="submit" value="Search" /></td>
				</tr>
			</table>
		</div>
		<c:if test="${not empty  error}">
			<div align="center" style="color: red">${error}</div>
		</c:if>

		<c:if test="${not empty claims}">
			<div align="center">

				<table BORDER="1">
					<TR>
						<TH>Policy Number</TH>
						<TH>Name</TH>
						<TH>Amount</TH>
						<TH>Date Of Birth</TH>
						<TH>Policy Expire Date</TH>
					</TR>
					<c:forEach var="calim" items="${claims}">
						<%-- 				<li>${calim.policyNumber}</li> --%>
						<TR>
							<TD>${calim.policyNumber}</td>
							<TD>${calim.name}</TD>
							<TD>${calim.amount}</TD>
							<TD>${calim.dateOfBirth}</TD>
							<TD>${calim.policyExpiryDate}</TD>
						</TR>
					</c:forEach>

				</table>
			</div>



		</c:if>
	</form:form>
</body>
</html>