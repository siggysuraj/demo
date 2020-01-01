
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Airline Reservation System</title>

</head>
<body>


 
		
		<div class="container  col-sm-5 col-right " style="width:40%">
			<br> <br> <br>
			<div class="panel panel-default">
				<div class="panel-heading">
					<h4 class="capital">Login</h4>
				</div>
				<div class="panel-body">
					<h3 class="red" id="msg2"></h3>
				
					<form:form method="POST" action="authenticateLogin"
						modelAttribute="command">

							<div class="form-group">
								<form:label path="userId"
									class="control-label col-sm-offset-1 col-sm-3 text-right fontstyle">User Id<span
										class="red">*</span>
								</form:label>
								<div class="col-sm-7">
									<form:input path="userId" class="form-control" required="true" title="User id must contain 4 to 15 characters"
									 pattern=".{4,15}" />
									<br>
									<form:errors path="userId" />
								</div>
								<br>
							</div>
							<div class="form-group">
								<form:label path="password"
									class="control-label col-sm-offset-1 col-sm-3 text-right fontstyle">Password<span
										class="red">*</span>
								</form:label>
								<div class="col-sm-7">
									<form:input type="password" path="password" required="true" title="Password must contain 8 to 15 characters"
										class="form-control" pattern=".{8,15}"/>
											<a href="forgotPassword" class="help-text pull-right">Forgot Password?</a>
									<br>
									<form:errors path="password" />
								</div>
								<br>
							</div>
							<br><br><br><br>
							<div class="form-group">
								<div class="col-sm-offset-4 col-sm-7">
									<a href="register">New User?</a> &nbsp; <button
										type="submit" class="btn btn-primary fontfamily" >Login</button>
								</div>

							</div>
							
							
					</form:form>
					
					<div class="col-md-12 text-center">
            <div class="text-center text-danger">${message}</div>  
            </div>
					
					</div>
					
				</div>
			</div>
	
	<!-- Login end -->

	
</body>


</html>
