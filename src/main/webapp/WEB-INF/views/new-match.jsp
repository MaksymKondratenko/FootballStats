<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	.error {
	color: red;
	}
</style>
</head>
<body>
	
	<form:form method="POST" modelAttribute="match" action="new-match">
		<fieldset>
			<form:label path="homeClub">Home club:</form:label>
			<form:input path="homeClub"/>
			<form:errors path="homeClub" cssClass="error"/>
		
			<label>Score:</label>
			<form:input path="homeScore" size="2"/>
			<form:errors path="homeScore" cssClass="error"/>
			<label> - </label>
			<form:input path="awayScore" size="2"/>
			<form:errors path="awayScore" cssClass="error"/>
			
			<form:label path="awayClub">Away club:</form:label>
			<form:input path="awayClub"/>
			<form:errors path="awayClub" cssClass="error"/>
		</fieldset>
		<input type="submit" value="Add match">
	</form:form>
	<br/>
	<a href="home">Go to the start page</a>
</body>
</html>