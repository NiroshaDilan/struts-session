<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
  <title>Workflow Page 3</title>
</head>
<body>
<h1>Workflow Page 3</h1>
<p>Session ID: <s:property value="#session.JSESSIONID"/></p>
<p>CNG Session ID: <s:property value="#session.cngSessionId"/></p>

<s:iterator value="#session.workflowSessions" var="workflowSession">
  <s:if test="#workflowSession.cngSessionId == #parameters.cngSessionId[0]">
    <p>Workflow Name: <s:property value="#workflowSession.workflowName"/></p>
    <p>Workflow State: <s:property value="#workflowSession.workflowState"/></p>
    <p>Page 2 Title: <s:property value="#workflowSession.page2Title"/></p>
    <p>Page 2 Name: <s:property value="#workflowSession.page2Name"/></p>
  </s:if>
</s:iterator>
</body>
</html>
