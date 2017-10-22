<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; UTF-8">
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
			<form:label path="homeClub"><spring:message code="home-club"/>:</form:label>
			<form:input path="homeClub"/>
			<form:errors path="homeClub" cssClass="error"/>
		
			<label><spring:message code="score"/>:</label>
			<form:input path="homeScore" size="2"/>
			<form:errors path="homeScore" cssClass="error"/>
			
			<label> - </label>
			<form:input path="awayScore" size="2"/>
			<form:errors path="awayScore" cssClass="error"/>
			
			<form:label path="awayClub"><spring:message code="away-club"/>:</form:label>
			<form:input path="awayClub"/>
			<form:errors path="awayClub" cssClass="error"/>
		</fieldset>
		<input type="submit" value="Add match">
	</form:form>
	<br/>
	<a href="home"><spring:message code="go-home"/></a>
</body>
</html>