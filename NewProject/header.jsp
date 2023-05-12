<%@page import="com.model.SignupModel"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<!-- basic -->
<meta charset="utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<!-- mobile metas -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta name="viewport" content="initial-scale=1, maximum-scale=1">
<!-- site metas -->
<title>Brass Product Management System</title>
<meta name="keywords" content="">
<meta name="description" content="">
<meta name="author" content="">
<!-- bootstrap css -->
<link rel="stylesheet" href="css/bootstrap.min.css">
<!-- style css -->
<link rel="stylesheet" href="css/style.css">
<!-- Responsive-->
<link rel="stylesheet" href="css/responsive.css">
<link rel="stylesheet" href="css/owl.carousel.min.css">
<!-- fevicon -->

<!-- Scrollbar Custom CSS -->
<link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
<!-- Tweaks for older IEs-->
<link rel="stylesheet"
	href="https://netdna.bootstrapcdn.com/font-awesome/4.0.3/css/font-awesome.css">
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/fancybox/2.1.5/jquery.fancybox.min.css"
	media="screen">
<!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script><![endif]-->

<!-- ------------------------chnage in template------------------------------- -->

<meta name="viewport" content="width=device-width, initial-scale=1">
<!--===============================================================================================-->

<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/bootstrap/css/bootstrap.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="fonts/font-awesome-4.7.0/css/font-awesome.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="vendor/animate/animate.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/css-hamburgers/hamburgers.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css"
	href="vendor/select2/select2.min.css">
<!--===============================================================================================-->
<link rel="stylesheet" type="text/css" href="css/util.css">
<link rel="stylesheet" type="text/css" href="css/main.css">
<!--===============================================================================================-->

<style type="text/css">
.swd-button {
	background: #f2db18;
	border: 1px solid white;
	border-radius: 5px;
	color: white;
	display: inline-block;
	font: bold 12px Arial, Helvetica, sans-serif;
	padding: 10px 15px;
	text-decoration: none;
	text-transform: uppercase;
	margin-top: 15px;
}


</style>


</head>
<!-- body -->

<body class="main-layout">
	<!-- loader  -->
	<div class="loader_bg">
		<div class="loader">
			<img src="images/loading.gif" alt="#" />
		</div>
	</div>
	<!-- end loader -->
	<!-- header -->
	<header>
		<!-- header inner -->
		<div class="header">
			<div class="header_to d_none">
				<div class="container">
					<div class="row">

						<div style="margin-left: 60%;" class="col-md-6 col-sm-6 ">
							<ul class="social_icon1">

							
								

								<%
								if (session.getAttribute("webwing") != null) {
								%>
								<div>
									<div>

										<a href="profile.jsp"><img src="images/profile.png"
											width="40px" height="40px " alt="errorprofile"></a>


										<div>

											<label style="color: white;"> <%
 out.print("welcome : your email is :-" + session.getAttribute("myemail"));
 out.print("<br>");
 out.print("Your Name is:-" + session.getAttribute("myname"));
 %>


											</label>




										</div>


									</div>
								</div>
								<%
								}
								%>

							
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div
				style="display: flex; align-items: center; justify-content: center; height: 70px; text-align: center; margin-left: 25%;">
				<div class="container">
					<div class="row d_flex">
						<div class="col-md-4 col-sm-4 d_none">
							<ul class="conta_icon">
								<li><a href="#"><i class="fa fa-phone"
										aria-hidden="true"></i> Call Us : +91 9724004242</a></li>
							</ul>
						</div>
						<!-- <div class="col-md-4 col-sm-4 ">
                     <a class="logo" href="#"><img src="images/logo.png" alt="#" /></a>
                  </div> -->
						<div class="col-md-4 col-sm-4 d_none" style="margin-rigth: 130%">
							<ul class="conta_icon ">
								<li><a href="#"><i class="fa fa-envelope"
										aria-hidden="true"></i> submitdata123@gmail.com</a></li>
							</ul>
							
							
							
							
							
							
							</div>
					</div>
				</div>
			</div>
			<div class="header_bo" style="height: 70px;">
				<div class="container">
					<div class="row">
						<div class="col-md-9 col-sm-7">
							<nav class="navigation navbar navbar-expand-md navbar-dark ">
								<button class="navbar-toggler" type="button"
									data-toggle="collapse" data-target="#navbarsExample04"
									aria-controls="navbarsExample04" aria-expanded="false"
									aria-label="Toggle navigation">
									<span class="navbar-toggler-icon"></span>
								</button>
								<div class="collapse navbar-collapse" id="navbarsExample04">
									<ul class="navbar-nav mr-auto">
									
									  <li class="nav-item"> <a class="nav-link" href="index.jsp"> Home </a> </li>
                              			
									<%
									
										if(session.getAttribute("webwing")!=null)
										{
											
										
									
									%>
									
									
								<li class="nav-item">
                                 	<a class="nav-link" href="product.jsp">Products</a>
                              	</li>
                              <li class="nav-item">
                                 <a class="nav-link" href="newwishlist.jsp">Wishlist </a>
                              </li>
                              <li class="nav-item">
                                 <a class="nav-link" href="cart.jsp">Cart</a>
                              </li>
									
									
									<%
										
										}
										else
										{
											
											
									
										%>
										
									<%
										}
									%>
									
									<li class="nav-item"> <a class="nav-link" href="about.jsp">about</a></li>
										  <li class="nav-item"> <a class="nav-link" href="contact.jsp"> contact us </a></li>
							</li>
                           </ul>
                        </div>
                     </nav>
                  </div>		
              <div class="col-md-3 col-sm-5 d_none">
              
              	
              				<%
								if (session.getAttribute("webwing") == null) {
							%>

							<a href="mylogin.jsp"><input class="swd-button" type="submit" value="Sign In"></a>



							<%
							} 
								else 
							{
							%>

							<a href="mylogout.jsp"><input class="swd-button" type="submit" value="Logout"></a>
							<%
							}
							%>
							
							<a href="signup.jsp"><button type="button" class="swd-button">Sign
									Up</button></a>
									
						    <a href="adminlogin.jsp"><button type="button" class="swd-button">Admin</button></a>
						</div>
					</div>
				</div>
			</div>
		</div>
	</header>
              </div>    
                  		
									
									
									
									
									
									
									
									
									

			