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
<div align="center">
<form:form action="/Registration/edit" method="Post" modelAttribute="user">
<table border="1">
 <tr>
  <td>User Name:</td>
   <td><form:input path="name"/></td>
 </tr>
 
  <tr>
  <td>Email:</td>
   <td><form:input path="email"/></td>
 </tr>
 
  <tr>
  <td>Password:</td>
   <td><form:input path="password"/></td>
 </tr>
 
 <tr>
  <td>Subject:</td>
   <td><form:select path="subjects" items="${subjects}" multiple="true" itemLabel="subjectname"></form:select>
 </tr>
 
  <tr>
  
   <td colspan="2"><input type="submit" value="Edit"/></td>
 </tr>



</table>


</form:form>



</div>

</body>
</html>