<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>  
 <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>   
<!DOCTYPE html>
<html>
<head>
<script src="https://code.jquery.com/jquery-3.3.1.min.js" integrity="sha256-FgpCb/KJQlLNfOu91ta32o/NMZxltwRo8QtmkMRdAu8=" crossorigin="anonymous"></script>
<script src="js/home.js"></script>
<link rel="stylesheet" href="css/homepage.css" />
<meta charset="ISO-8859-1">
	<title>Welcome</title>
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
						 <th  class="spacing" ><a href="/home">Home</a></th> 
						<th class="spacing"><a href="/scheduling">Scheduling</a></th>
						<th class="spacing"><a href="/contact">Contact Us</a> </th>
						<th class="spacing"><a href="">Account</a></th>	
					</tr>	
				</thead>
			</table>
		</div>
		<div id="mainbody">
			<div id="box1">
				<p id="aboutcent">About Us</p>
				<p>Pool Service has been around for 6 years!
				From commercial pools to family pools, our Pool Service team is ready to make sure your pool is clean, clear, and ready 
				for the upcoming summer season!</p>
				<p></p>
				<p>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, 
				quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. 
				Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla 
				pariatur. Excepteur sint occaecat cupidatat non proident, sunt in 
				culpa qui officia deserunt mollit anim id est laborum.</p>
			</div>
			<div id="box2">
				 <img id="imgtag" src="../images/javaproject-photos/stockphoto1.jpg" alt="pool photo" />
			</div>
			<div id="box3" >
				<p id="offercent">What We Offer</p>
				<p><span class="offerlist">Pool Revival: </span>No matter how dirty or how gross, 
				we can bring it back to life! </p>
				<p><span class="offerlist">Basic Maintenance Check: </span>Before the season starts, let us 
				take a closer look to make sure you're ready to go for that first cannon ball!</p>
			</div>
			<div id=box4>
				<img id="imgtag2" src="../images/javaproject-photos/water-test.jpg" alt="another good photo" />
			</div>
			<div id="box5">
				<p><span id="promisecent">Our Promise</span></p>
				<p>With every visit we provide only the best service possible. We want you and your  
				family to feel confident in your pools cleanliness. Every pool inspection comes with 
				a free water test, and a refill of chlorine tablets.  </p>
			</div>
			<div id="box6">
				<img id="imgtag3" src="../images/javaproject-photos/teammember.jpg" alt="yet another" />
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