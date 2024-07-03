<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Hello Struts 2</title>
</head>
<body>
<h1>Hello, Struts 2!</h1>
<p>Click the button to start the workflow.</p>
<s:form action="enterWorkflow" method="post">
    <s:submit value="Start Workflow"/>
</s:form>
</body>
</html>
