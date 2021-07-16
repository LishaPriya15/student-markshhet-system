<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ include file="menu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>update registration</h2>
	<form action="updateReg" method="post">
		Student Id<input type="text" name="id" value=<%= request.getAttribute("id") %> readonly> <br><br>
		Subject 1<input type="text" name="subject1" value=<%= request.getAttribute("subject1") %>><br><br> 
		Subject 2<input type="text" name="subject2" value=<%= request.getAttribute("subject2") %>><br><br> 
		Subject 3<input type="text" name="subject3" value=<%= request.getAttribute("subject3") %>><br><br> 
		Subject 4<input type="text" name="subject4" value=<%= request.getAttribute("subject4") %>><br><br> 
		Subject 5<input type="text" name="subject5" value=<%= request.getAttribute("subject5") %>><br><br> 
		<input type="submit" value="update" />
	</form>

</body>
</html>