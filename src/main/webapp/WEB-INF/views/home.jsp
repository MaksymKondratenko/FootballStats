<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<P><a href="new-match"><spring:message code="new-match"/></a></P>
	<br/>
	<a href="match-viewer"><spring:message code="match-viewer"/></a>
</body>
</html>
