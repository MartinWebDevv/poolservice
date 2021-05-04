<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="css/schedule.css" />
<meta charset="ISO-8859-1">
<title>Schedule an Appointment</title>
</head>
<body>
	<div id="container">
	<div id="header">
			<h1 id="leftalign">
				<span id="poolcolor">Pool</span> <span id="servicecolor" >Services</span>
				<img id="logo" src="../images/javaproject-photos/logo.png" alt="logo" />
			</h1>
			<table id="rightalign">
				<thead>
					<tr>
						<th class="spacing" ><a href="/home">Home</a></th> 
						<th class="spacing"><a href="/scheduling">Scheduling</a></th>
						<th class="spacing"><a href="/contact">Contact Us</a> </th>
						<th class="spacing"><a href="">Account</a></th>	
					</tr>	
				</thead>
			</table>
		</div>
		<div id="mainbody">
		<div id="form">
			<h1 id="center">Schedule your appointment Today!</h1>
			<div id="subform">
				<form:form method="POST" action="/newschedule" modelAttribute="schedule">
					<p class="formlables">
						<form:label  path="email">Email:</form:label>
						<form:input id="emailform" type="email" path="email"/>
					</p>
					<p class="formlables">
						<form:label path="firstName">First Name:</form:label>
						<form:input id="firstname" type="text" path="firstName"/>
					</p>
					<p class="formlables">
						<form:label path="lastName">Last Name:</form:label>
						<form:input id="lastname" type="text" path="lastName"/>
					</p>
					<p class="formlables">
						<form:label path="reason">Service Needed:</form:label>	
						<form:select path="reason">
							<form:option value="Pool Cleaning"/>
							<form:option value="Pool Maintinence"/>
							<form:option value="Water Test"/>
							<form:option value="Filter Inspection"/>
							<form:option value="All the Above"/>
						</form:select>
					</p>
					<p class="formlables">
						<form:label path="desc">(Optional) Give a small description of the problem</form:label>
						<br />
						<form:input id="descsize" type="text" path="desc"/>
					</p>
					<c:if test = "${user }">
					<p>
						<form:label path="user"></form:label>
						<form:input type="hidden" path="user" value="${user.id }"/>
					</p>
					</c:if>
				</form:form>
			</div>
			</div>
		</div>
		<footer id="footercolor">
			<table>
				<thead>
					<tr>
						<th  class="spacing" ><a href="/home">Home</a></th> 
						<th class="spacing"><a href="/scheduling">Scheduling</a></th>
						<th class="spacing"><a href="/contact">Contact Us</a> </th>
						<th class="spacing"><a href="">Account</a></th>	
					</tr>	
				</thead>
			</table>
		</footer>
	</div>
</body>
</html>