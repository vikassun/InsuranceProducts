<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Bima Gold Policy</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet"
	href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script
	src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

<style type="text/css">
.table1 {
	border-collapse: separate;
	border-spacing: 50px 0;
	background-color: RoyalBlue;
}

td {
	padding: 2px 0;
	color: LightCyan;
}

body {
	background-image:
		url('http://www.renewmetoday.com/wp-content/uploads/2015/07/renew-background.jpeg');
}

hr {
	background-color: SteelBlue;
	height: 2px;
}

.vr {
	display: inline;
	height: 100%;
	width: 2px;
	border: 1px inset;
	margin: 5px;
	background-color: SteelBlue;
}
</style>
</head>

<body>

	<table width="100%">
		<tr>
			<td width="90%" style="text-align: justify;"><h2
					style="color: SteelBlue;">
					<b>Policy:: Bima Gold </b>
					</h1></td>
			<td width="10%" style="text-align: right;"><h3 align="center"
					style="color: blue;">
					<a href="home">Home </a>
				</h3></td>
		</tr>
	</table>

	<h3 style="color: SteelBlue;">
		<div style='text-align: center'>Key Benefits of Jeevan Rakshak Premium
			Back Cover</div>
	</h3>
	<!-- <div class="horizontal-line" style='align:center'></div> -->
	<hr align="center" width="80%">
	<h4 style="color: SteelBlue;" align="center">
		1
		<div class="vr" align="left" height="10%"></div>
		Covers 35 critical Illness&nbsp;&nbsp; 2
		<div class="vr" align="left" height="10%"></div>
		Return of premiums in case of no claim&nbsp;&nbsp; 3
		<div class="vr" align="left" height="10%"></div>
		Tax benefits&nbsp;&nbsp; 4
		<div class="vr" align="left" height="10%"></div>
		Exclusive online discount&nbsp;&nbsp;
	</h4>

	<h3>Overview</h3>

	PNB MetLife Jeevan Rakshak Premium Back Cover is a health insurance plan that
	provides coverage for 35 critical illnesses like heart attack, cancer
	and stroke and helps pay for the cost of treatment for these illnesses.
	The plan returns back to you all the premiums paid if no claims are
	made during the policy term.


	<table>
		<tr>
			<th><h3 align="center">Jeevan Rakshak Premium Covers</h3></th>
			<th></th>
			<th><h3 align="center">Product Benefits</h3></th>
		</tr>
		<tr>
			<td>
				<table class="table1">
					<tr>
						<ol>
							<td style="padding-bottom: 50px;padding-top: 55px;"><li>Provides health protection for 10 years</li>
								<li>Provide coverage for 35 critical illnesses&nbsp;</li>
								<li>Return all base premiums at maturity if no claims are
									made&nbsp;</li>
								<li>Tax benefits on premiums paid and benefits received*</li></td>
							<br>
						</ol>
					</tr>
				</table>
			</td>
			<td>.</td>
			<td rowspan="3">
				<table align="center" class="table1">
					<tr>
					</tr>
					<tr>
						<th><h3 align="center">Critical Illness Claim</h3></th>
						<th><h3 align="center">Maturity Benefit</h3></th>
					</tr>
					<tr>
						<td rowspan="2">35-year-old Mr Arvind bought MetLife Jeevan Rakshak
							Premium Back<br> Cover with the following sum assured and
							premium amount:<br> Sum Assured: Rs. 10 Lakhs Premium: Rs.
							13,875 to be paid <br> every year for 10 years (excluding
							taxes).If Mr Arvind is <br> diagnosed for any of the 35
							critical iIllnesses, PNB MetLife<br> pays him the sum
							assured of Rs 10 Lakhs. Following the claim, <br> the policy
							will be terminated
						</td>
						<td rowspan="2">If no claims were made during Mr Arvind’s
							policy term, <br> PNB MetLife will return of all base
							premiums paid (excluding<br> the extra premiums and Service
							Taxes paid by the Policyholder)<br> at the end of the policy
							term. Hence, Mr Arvind will receive<br> Rs. 1,38,750 (Rs.
							13,875 X 10) at the end of the 10th year
						</td>
					</tr>
				</table>
			</td>
		</tr>
		<tr>
			<td style="margin-top: 20"><div style="text-align: center;">
					<a href="premiumJeevanRakshan">Premium Info </a><br> <br>
				</div></td>
			<td></td>
		</tr>
	</table>
	<table width="90%">
		<tr>
			<td height="80">
				<c:if test="${not empty product}">
						<table align="center" class="table1">
							<tr>
								<th>Product Name</th>
								<th>Product Description</th>
								<th>Product Premium</th>
								<th>Product Status</th>
							</tr>
							<tr>
								<td>${product.product_name}</td>
								<td>${product.product_description}</td>
								<td>${product.premium}</td>
								<td>${product.status}</td>
							</tr>
						</table>

					</c:if>
				
			</td>
		</tr>
		<tr><td><div style="text-align: center;color: black;">*Tax benefits are as per the Income Tax Act, 1961, and are
		subject to amendments made there from time to time. Please consult
		your tax consultant for more details</div></td></tr>
	</table>



	<br>
	<br>
	
</body>

</html>
