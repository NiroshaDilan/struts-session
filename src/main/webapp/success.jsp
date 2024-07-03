<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
  <title>Success</title>
</head>
<body>
<h1>Success!</h1>
<p>Session ID: <s:property value="#session.JSESSIONID"/></p>
<p>CNG Session ID: <s:property value="#session.cngSessionId"/></p>
<p>Custom Message: <s:property value="customMessage"/></p>
</body>
</html>
