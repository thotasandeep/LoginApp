<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<% String message = (String)request.getAttribute("message");%>	

<p style="font-size:14px; color:#538b01; font-weight:bold; font-style:italic;">
<% out.println(message); %>
</p>




<form action="LoginServlet" method="post">
	User Name : <input type="text" name="uname"><br>
	Password : <input type="password" name="password"><br>
	<input type="submit">
</form>


</body>
</html>