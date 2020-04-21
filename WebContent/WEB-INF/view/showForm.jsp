<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
table
{
width:30%;
border-spacing:10px;
}
</style>
</head>
<body>
<h2>Application Form</h2>
<form:form action="processForm" modelAttribute="student">
<table>
<tr>
<td>Name</td>
<td><form:input path="name"/></td>
</tr>
<tr>
<td>Department</td>
<td>
<form:select path="dept">
<form:options items="${student.departmentOptions }"/>
</form:select>
</td>
</tr>
<tr>
<td>Gender</td>
<td>
<form:radiobuttons path="gender" items="${student.genderOptions }"/>
</td>
</tr>
<tr>
<td>Skills</td>
<td>
<form:checkboxes path="skills" items="${student.skillOptions }"/>
</td>
</tr>
<tr>
<td><input type="submit" value="Submit">
</td>
</tr>
</table>
</form:form>
</body>
</html>