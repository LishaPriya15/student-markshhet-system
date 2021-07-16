<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Reg</title>
</head>
<body>
<h2>Enter Student Details here</h2>
	<form action="newReg" method="post">
		StudentID<input type="text" name="id" /> <br><br>
		Student Name<input type="text" name="name" /> <br><br>
		Subject 1<input type="text" name="subject1" /> <br><br>
		Subject 2<input type="text" name="subject2" /> <br><br>
		Subject 3<input type="text" name="subject3" /> <br><br>
		Subject 4<input type="text" name="subject4" /> <br><br>
		Subject 5<input type="text" name="subject5" /> <br><br>
		<input type="submit" value="save" />
	</form>
	
	<% if(request.getAttribute("msg")!=null){
	out.println(request.getAttribute("msg"));	
	}%>
	

</body>
</html>