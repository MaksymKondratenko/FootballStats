<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ page session="true" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
	<span style="float: right;">
		<a href="?lang=en">en</a>
		<a href="?lang=pl">pl</a>
		<a href="?lang=ru">ru</a>
		<a href="?lang=uk">ua</a>
	</span>
	<P><a href="new-match"><spring:message code="new-match"/></a></P>
	<br/>
	<a href="match-viewer"><spring:message code="match-viewer"/></a>
</body>
</html>
