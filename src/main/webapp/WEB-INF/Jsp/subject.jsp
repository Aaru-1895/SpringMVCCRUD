<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h3>Insert Subject </h3>

<div>
<form:form action="saveSubject" method="Post" modelAttribute="subject">
<table>
<tr>
	<td>Subject Name:</td>
	<td><form:input path="subjectname"/></td>
</tr>

<tr>
	<td>Description:</td>
	<td><form:input path="desciption"/></td>
</tr>

<tr>

	<td ><input type="submit" value="submit"/></td>
</tr>

</table>
</form:form>



</div>

</body>
</html>