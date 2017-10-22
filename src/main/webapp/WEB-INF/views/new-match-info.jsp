<%@ page language="java" contentType="text/html; UTF-8" pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; UTF-8">
	<title>Insert title here</title>
</head>
<body>
	<h2><spring:message code="info-about-new-match"/>:</h2>
	<h1>${match.homeClub}   ${match.homeScore} - ${match.awayScore}   ${match.awayClub}</h1>
</body>
</html>