<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Student Enquiry form</h2>
<p><font color='green'>${msg}</font></p>
<form:form action="save" modelAttribute="student" method="POST">
<table>
<tr>
<td>Name:</td>
<td><form:input path="name"/>
</tr>
<tr>
<td>Email</td>
<td><form:input path="email"/>
</tr>
<tr>
<td>Gender</td>
<td><form:radiobutton path="gender" value="M"/>Male
<td><form:radiobutton path="gender" value="F"/>Female
</tr>
<tr>
<td>course</td>
<td><form:select path="course">
<form:option value="">-select-</form:option>
<form:options items="${courses}"/>
</form:select>
</td>
</tr>
<tr>
<td>Timings</td>
<td><form:checkboxes items="${timings}" path="timings"/>
</td>
</tr>
<tr>
<td></td>
<td><input type="submit" value="Save"/></td>
</tr>

</table>






</form:form>
</body>
</html>