<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>



<style>
		#div li::after{
			content: "|";
			padding-left: 5px;
			padding-right: 5px;
			color:black;
		}
		ul{
			
		}
		li{

			display:inline;
		}
		.highlight{
			
		}
		ul a,{
			
		}
		#name{
			
		}
		.header ul{
			list-style-type: none;
   			float:right;
    		background-color:purple;
    		width:100%;
    		display: inline-block;
		}
	header	li .a, .dropbtn {
    display: inline-block;
    color:white;
    text-align: center;
    padding: 10px 10px;
	text-decoration: none;
}
a{
	text-decoration: none;
}
a:hover, .dropdown:hover .dropbtn {
   
}
li.dropdown {
    display: inline-block;
}
.dropdown-content {
    display: none;
    position: absolute;
    background-color: #f9f9f9;
    min-width: 160px;
    box-shadow: 0px 8px 16px 0px rgba(0,0,0,0.2);
    z-index:auto;
}
.dropdown-content a {
    color: black;
    padding: 14px 16px;
    text-decoration: none;
    display: block;
    text-align: left;
}
.dropdown-content a:hover {background-color:#82a4f2}

.dropdown:hover .dropdown-content {
    display: block;
}
#font{
	font-size:25px;
}
.color{
	color:black;
}
.a{
	color:white;
}
#top{

	margin-top:-10px;
}
ul.topnav li a.a {

	display: inline-block;
    color: white;
    padding: 14px 16px;
    text-decoration: none;
}
ul.topnav li a.dropbtn {

	display: inline-block;
    color: white;
    padding: 14px 16px;
    text-decoration: none;
}

	</style>

</head>
<body>

		<div style="margin:0px;padding-bottom:0px;" id="div">
			<ul>
				<li id="name"><font class="color"><b>Welcome To online Shopping</font></li>
				<li><a href="#" class="color">Login</a><span class="highlight"></span></li>
				
				
			</ul>
		</div>
		<div class="header" align="left" id="top">
			<ul class="topnav">
				
				<li><a href="#" class="a" id="font">Home</a></li>
				
				
				<li class="dropdown">
					<a href="#" class="dropbtn" id="font">Search By Category</a>
				<div class="dropdown-content">
					<a href="#">Electronics</a>
      				<a href="#">Fashion</a>
     				<a href="#">Home and furniture</a>
					<a href="#">Beauty and personal care</a>
					<a href="#">Stationaries</a>
					
					</div>
				</li>
				
				
				
				<li><a href="#" class="a" id="font">My Account</a></li>
				<li><a href="#" class="a" id="font">My order</a></li>
				
				
				<li><a href="searchproduct" class="a" id="font" >Search Product : <input type="text" name="regno" required="required"/>
		<input type="submit" value="search">
		&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</a></li>
				
				
				
				
				</ul>
		
</body>
</html>