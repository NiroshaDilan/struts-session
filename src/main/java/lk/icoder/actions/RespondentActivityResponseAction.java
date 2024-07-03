package lk.icoder.actions;

import com.opensymphony.xwork2.ActionSupport;
import lk.icoder.model.WorkflowSession;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class RespondentActivityResponseAction extends ActionSupport implements SessionAware {

    private String cngSessionId;
    private String customMessage;
    private Map<String, Object> session;

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

    public Map<String, Object> getSession() {
        return session;
    }

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public String execute() {
        if (cngSessionId == null || cngSessionId.isEmpty()) {
            cngSessionId = (String) session.get("cngSessionId");
        }

        WorkflowSession workflowSession = new WorkflowSession(cngSessionId, customMessage);
        List<WorkflowSession> workflowSessions = (List<WorkflowSession>) session.get("workflowSessions");

        if (workflowSessions == null) {
            workflowSessions = new ArrayList();
        }

        boolean sessionExists = false;
        for (WorkflowSession ws : workflowSessions) {
            if (ws.getCngSessionId().equals(cngSessionId)) {
                ws.setCustomMessage(customMessage);
                sessionExists = true;
                break;
            }
        }

        if (!sessionExists) {
            workflowSessions.add(workflowSession);
        }

        session.put("workflowSessions", workflowSessions);

        return SUCCESS;
    }
}
