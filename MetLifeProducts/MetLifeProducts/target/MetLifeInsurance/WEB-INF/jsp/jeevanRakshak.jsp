<%@ page language="java" contentType="text/html; charset=UTF-8"  
    pageEncoding="UTF-8"%>  
	<%@ taglib prefix="c" 
           uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">  
<html>  
<head>  
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">  
<title>Jeevan Rakshak Policy</title> 
 <meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>

 <style type="text/css">
  table {
  border-collapse: separate;
  border-spacing: 50px 0;
  background-color:RoyalBlue;
	}
	
  td {
	  padding: 10px 0;
	  color: LightCyan;
	}
  body {
		background-image: url('http://www.renewmetoday.com/wp-content/uploads/2015/07/renew-background.jpeg');
	} 
	hr { background-color: SteelBlue; height: 2px;  }
	.vr
	{
	  display:inline;
	  height:100%;
	  width:2px;
	  border:1px inset;
	  margin:5px;
	  background-color: SteelBlue;
	}
</style>
</head> 

   <body> 
	<h1>  <div style='text-align:center'><h1 style="color:SteelBlue;"><b> Jeevan rakshak </b></h1><h3 align="right" style="color:blue;"><a href="home">Home Page </a></h3></div></h1>
	<h1 style="color:SteelBlue;"><div style='text-align:center'>Key Benefits of Jeevan rakshak Premium Back Cover</div></h1>
	<!-- <div class="horizontal-line" style='align:center'></div> -->
	<hr align="center" width="80%">
	<h3 style="color:SteelBlue;" align="center">
	1<div class="vr" align="left" height="10%"></div>Additional health cover&nbsp; 
	2<div class="vr" align="left" height="10%"></div>Flexibility to meet your needs&nbsp;
	3<div class="vr" align="left" height="10%"></div>Tax benefits&nbsp;
	4<div class="vr" align="left" height="10%"></div>Reasonable premium&nbsp;
	</h3> 

 <br><h3>Overview</h3>
 <br>
 <p>
 Every person has a different need and we at PNB MetLife recognize this. To give you the flexibility to customize and enhance your cover, we offer you Accidental Disability Benefit Rider - a rider which you may opt for along with your basic policy and shape your policy to suit your individual needs, for a nominal premium.
MetLife Jeevan rakshak ensures
</p>

	<table align="center" > <h3 align="center" >Jeevan rakshak Premium Covers</h3>
			<tr>
			<ol>
				<td ><li>Affordable premium at a nominal rate</li>
				<li>Additional protection against impairment due to accidents&nbsp;</li>
				<li>Flexibility to choose Sum Assured to meet varying needs&nbsp;</li>
				<li>Tax benefits on premiums paid and benefits received*</li>
				</td>
				<br>
			</ol>
			</tr>
	</table>
	<br><br>
	<!-- <table>
			<tr> --><div style="text-align: center;">
			<a href="premiumJeevanRakshan">Premium Info </a><br>
				<br>
				
				<c:if test="${not empty product}">
					<table align="center">
						<tr>	<th>Product Name</th><th>Product Description</th><th>Product Premium</th><th>Product Status</th>	</tr>
						<tr>	<td>${product.product_name}</td><td>${product.product_description}</td><td>${product.premium}</td><td>${product.status}</td>	</tr>
					</table>
					
				</c:if>
							
				
				</div> 
			<!-- </tr>
				
	</table> -->


 <br>
 <table align="center" > <!-- <h3 align="center">Product Benefits</h3> -->
			<tr><th><h3 align="center">Product Benefits</h3></th></tr>
			<tr>
				<td>The policy can be surrendered at any time if a minimum of three full years´
				 premiums have been paid. The Corporation may pay the Guaranteed Surrender value 
				 which is a percentage of total premiums paid excluding extra premiums, or the 
				 Special Surrender value which is the discounted value of Paid-up Sum assured,
				  whichever is higher.Rebate is given as 1.5% of Assured Sum above 1, 50,000 Rupees.
				   Premiums paid up to 1, 50,000 Rupees are deducted from the taxable income each 
				   year and the Maturity Proceeds are tax free depending on fulfillment of terms and conditions.
					 </td>
				
			
			</tr>
			</table>



 <br><br>
<p>*Tax benefits are as per the Income Tax Act, 1961, and are subject to amendments made there from time to time. Please consult your tax consultant for more details
			</p>
</body>  
  
</html>  