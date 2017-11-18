<html>
<head>
<title>Insert title here</title>
</head>
<body>
	<#if matches??>
		<#list matches as match>
			<h1>${match.homeClub}   ${match.homeScore} - ${match.awayScore}   ${match.awayClub}</h1>
		</#list>
	</#if>
</body>
</html>