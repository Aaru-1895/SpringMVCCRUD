<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> All User Data </h2>
<table border="2" width="70%" cellpadding="2">
<tr>
<th>userName</th><th>Email</th><th>Password</th><th>Subjects</th><th>Edit</th><th>Delete</th>
</tr>

<c:forEach items="${userList}" var="user">
<tr>
<td>${user.name}</td><td>${user.email}</td><td>${user.password}</td>
<td>
    <c:forEach items="${user.subjects}" var="subject">
        ${subject.subjectname}<br/>
    </c:forEach>
</td>
<td><a href="editInfo/${user.id}">Edit</a></td>
<td><a href="deleteInfo/${user.id}">Delete</a></td>
</tr>

</c:forEach>



</table>

</body>
</html>