
<%@include file="header.jsp"%>
<body>
	<div>
		<div>
			<h1>Spring Boot JSP Example</h1>
			<h2>Hello ${message}</h2>
			<form action="login" method="GET">
				First Name: <input type="text" name="first_name"> <br />
				Last Name: <input type="text" name="last_name" /> <input
					type="submit" value="Submit" />
			</form>
			Click on this <strong><a href="next">link</a></strong> to visit
			another page.
			
			<h1> Click to here to have a list </h1>
			<a href="list">Click Here</a>
		</div>
	</div>
</body>
</html>