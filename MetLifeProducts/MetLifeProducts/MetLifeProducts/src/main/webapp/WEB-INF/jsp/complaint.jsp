<%@ page import="java.io.*" %>

<head>

<style type="text/css">
body {
	background-image:
		url('http://www.renewmetoday.com/wp-content/uploads/2015/07/renew-background.jpeg');
}
</style>

</head>

<font size="5" color="green">
<center><b>|	|	|	|	Investor Complaint Form	|	|	|	|</b></center>
</font>
<hr>
<body>

<font size="4" color="red">
<b>You may use this form to send your complaint to the SEC. 
Although we use secure socket layer encryption, do not hesitate 
to print this form and send it by mail or fax if you have any concerns 
about security. Please read our Privacy Act Notice to learn more about 
how we may use the information you send to us.<br><br>
phone icon 	Have questions about how to file a complaint? Call the OCC's 
Customer Assistance Group at 1-800-613-6743, Monday through Friday 
from 7:00am to 7:00pm CST to talk to a customer service representative in 
English or Spanish.  
TDD Number: 713-658-0340<br><br>

Please read our brochure, How We Handle Complaints, for information 
on what we will do with your complaint, your legal rights, and options 
for resolving your complaint.</b>
</font>
	
	<%-- <%
	String name = request.getParameter("name");
	String mail = request.getParameter("mailid");
	String complainType = request.getParameter("comptype");
	String complain = request.getParameter("herecomp");
	String file = application.getRealPath("/") + "test.txt";
	FileWriter filewriter = new FileWriter(file, true);
          filewriter.write("<B>Name : </B>" + name + "<BR>");
          filewriter.write("<B>Mail : </B>" + mail + "<BR>");
          filewriter.write("<B>Complain Type : </B>" + complainType + "<BR>");
          filewriter.write("<B>Complain : </B>" + complain + "<BR>");
          
          filewriter.close();
        %>
        <jsp:include page="ch15_04.txt" flush="true"/>
	 %>
 --%>	
</body>

<hr>
<br><br>
<font color="blue">
<b>TEXT SOME INFORMATION ABOUT YOU !</b><br><br>
</font>
<br><br>
<!-- <table>
	
		<tr>Name : </tr>
		<tr>City : </tr>
		<tr>Phone Number : </tr>
		<tr>Mail Id : </tr>
		<tr>Complaint Type : </tr>
		<tr>Write here your Complaint : </tr>
	
</table>
<table>
		<tr><input type="text" value="name"></tr>
		<tr><input type="text" value="city"></tr>
		<tr><input type="text" value="phoneno"></tr>
		<tr><input type="text" value="mail"></tr>
		<tr><input type="text" value="comptype"></tr>
		<ir><input type="text" value="herecomp"></tr>
	</th>
</table> -->

<div>
<form action="save" method="post">

<font color="yellow">
Provide your Id    : <input type="text" name="id"/><br><br>
Provide your Name    : <input type="text" name="name"/><br><br>
Provide your Mail    : <input type="text" name="mailid"/><br><br>
Your Complaint Type  : <input type="text" name="comptype"/><br><br>
About your Complaint : <input type="textarea" name="herecomp"/><br><br>
</font>

<input type="submit" name ="save" value="save"/>

</form>


</div>

<br><br><br><br>

<i><b>This collection of information has been reviewed by the Office of Management and Budget ("OMB") 
in accordance with the clearance requirements of 44 U.S.C. §3507. The applicable Privacy Act system 
of records (SORN) is SEC 65 and the routine uses of the records are set forth at 76 FR 30213 (May 24, 2011). 
This SORN is exempt from certain sections of the Privacy Act and the citation for the rule exempting the notice 
is 76 FR 57636 (September 16, 2011).</b></i>

<hr>
<center>
<b>
<font color="pink" size="8">
THANK YOU
</font>
</b>
</center>
<hr>