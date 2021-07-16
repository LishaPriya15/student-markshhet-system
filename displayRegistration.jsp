<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.sql.ResultSet" %>
<%@ include file="menu.jsp"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>All students data</h2>

<form>
<table border="1">
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th>Subject 1</th>
<th>Subject 2</th>
<th>Subject 3</th>
<th>Subject 4</th>
<th>Subject 5</th>
<th>delete</th>
<th>update</th>
</tr>

<% ResultSet result=(ResultSet)request.getAttribute("result"); 
	while(result.next()){
%>
<tr>
<td><%= result.getString(1) %></td>
<td><%= result.getString(2) %></td>
<td><%= result.getString(3) %></td>
<td><%= result.getString(4) %></td>
<td><%= result.getString(5) %></td>
<td><%= result.getString(6) %></td>
<td><%= result.getString(7) %></td>
<td><a href="deleteReg?id=<%=result.getString(1) %>">delete</a></td>
<td><a href="updateReg?id=<%= result.getString(1)%>&subject1?=<%=result.getString(3)%>&subject2?=<%=result.getString(4)%>&subject3?=<%=result.getString(5)%>&subject4?=<%=result.getString(6)%>&subject5?=<%=result.getString(7)%>">update</a></td>

</tr>
<% }%>
</table>
</form>

</body>
</html>