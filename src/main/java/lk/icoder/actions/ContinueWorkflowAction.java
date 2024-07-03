package lk.icoder.actions;

import com.opensymphony.xwork2.ActionSupport;
import lk.icoder.model.WorkflowSession;
import org.apache.struts2.interceptor.SessionAware;

import java.util.List;
import java.util.Map;

public class ContinueWorkflowAction extends ActionSupport implements SessionAware {
    private String cngSessionId;
    private String workflowName;
    private String workflowState;
    private Map<String, Object> session;

    public String getCngSessionId() {
        return cngSessionId;
    }

    public void setCngSessionId(String cngSessionId) {
        this.cngSessionId = cngSessionId;
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

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public String execute() {
        List<WorkflowSession> workflowSessions = (List<WorkflowSession>) session.get("workflowSessions");

        if (workflowSessions != null) {
            for (WorkflowSession ws : workflowSessions) {
                if (ws.getCngSessionId().equals(cngSessionId)) {
                    ws.setWorkflowName(workflowName);
                    ws.setWorkflowState(workflowState);
                    break;
                }
            }
        }

        return SUCCESS;
    }
}
