<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
<head>
    <title>Workflow Page 2</title>
</head>
<body>
<h1>Workflow Page 2</h1>
<p>Session ID: <s:property value="#session.JSESSIONID"/></p>
<p>CNG Session ID: <s:property value="#session.cngSessionId"/></p>

<s:iterator value="#session.workflowSessions" var="workflowSession">
    <s:if test="#workflowSession.cngSessionId == #parameters.cngSessionId[0]">
        <p>Workflow Name: <s:property value="#workflowSession.workflowName"/></p>
        <p>Workflow State: <s:property value="#workflowSession.workflowState"/></p>
    </s:if>
</s:iterator>

<s:form action="continueFromPage2">
    <s:hidden name="cngSessionId" value="%{#session.cngSessionId}"/>
    <s:textfield name="page2Title" label="Page 2 Title"/>
    <s:textfield name="page2Name" label="Page 2 Name"/>
    <s:submit value="Continue"/>
</s:form>
</body>
</html>
