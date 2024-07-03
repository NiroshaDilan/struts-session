<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
  <title>Workflow Page 1</title>
</head>
<body>
<h1>Workflow Page 1</h1>
<p>Session ID: <s:property value="#session.JSESSIONID"/></p>
<p>CNG Session ID: <s:property value="#session.cngSessionId"/></p>

<s:form action="continueWorkflow">
  <s:hidden name="cngSessionId" value="%{#session.cngSessionId}"/>
  <s:textfield name="workflowName" label="Workflow Name"/>
  <s:textfield name="workflowState" label="Workflow State"/>
  <s:submit value="Continue Workflow"/>
</s:form>
</body>
</html>
