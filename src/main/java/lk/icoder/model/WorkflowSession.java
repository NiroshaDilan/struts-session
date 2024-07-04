package lk.icoder.model;

import java.io.Serializable;

public class WorkflowSession implements Serializable {

    private static final long serialVersionUID = 1L;

    private String cngSessionId;
    private String customMessage;
    private String workflowName;
    private String workflowState;
    private String page2Title;
    private String page2Name;

    public WorkflowSession(String cngSessionId, String customMessage) {
        this.cngSessionId = cngSessionId;
        this.customMessage = customMessage;
    }

    public String getCngSessionId() {
        return cngSessionId;
    }

    public void setCngSessionId(String cngSessionId) {
        this.cngSessionId = cngSessionId;
    }

    public String getCustomMessage() {
        return customMessage;
    }

    public void setCustomMessage(String customMessage) {
        this.customMessage = customMessage;
    }

    public String getWorkflowName() {
        return workflowName;
    }

    public void setWorkflowName(String workflowName) {
        this.workflowName = workflowName;
    }

    public String getWorkflowState() {
        return workflowState;
    }

    public void setWorkflowState(String workflowState) {
        this.workflowState = workflowState;
    }

    public String getPage2Title() {
        return page2Title;
    }

    public void setPage2Title(String page2Title) {
        this.page2Title = page2Title;
    }

    public String getPage2Name() {
        return page2Name;
    }

    public void setPage2Name(String page2Name) {
        this.page2Name = page2Name;
    }
}
