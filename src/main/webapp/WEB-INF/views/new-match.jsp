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
/* 	table, tr {
		border: 1px solid black;
	} */
	/* td {
		border: 1px dashed grey;
	} */
</style>
</head>
<body>
	<table>
	<tr>
	<td>
	<form:form method="POST" modelAttribute="match" action="new-match-info">
		<table>
			<tr>
				<td>
					<form:label path="homeClub"><spring:message code="home-club"/>:</form:label>
					<form:input path="homeClub"/>
				</td>
			</tr>
			<tr>
				<td>
					<label><spring:message code="score"/>:</label>
					<form:input path="homeScore" size="2"/>
					<label> - </label>
					<form:input path="awayScore" size="2"/>
				</td>	
			</tr>
			<tr>
				<td>	
					<form:label path="awayClub"><spring:message code="away-club"/>:</form:label>
					<form:input path="awayClub"/>
				</td>
			</tr>
		</table>
		<input type="submit" value="Add match">
	</form:form>
	</td>
	<td>
		<table>
				<c:choose>
					<c:when test="${not empty  errors}">
    					<div class="error">
    						<c:forEach items="${errors}" var="err">
        						<tr>${err.defaultMessage}</tr>
        						<br/>
    						</c:forEach>
    					</div>
					</c:when>
				</c:choose>
		</table>
	</td>
	</tr>
	</table>
	<br/>
	<a href="home"><spring:message code="go-home"/></a>
	<span style="float: right;">
		<a href="new-match?lang=en">en</a>
		<a href="new-match?lang=pl">pl</a>
		<a href="new-match?lang=ru">ru</a>
		<a href="new-match?lang=uk">ua</a>
	</span>
</body>
</html>