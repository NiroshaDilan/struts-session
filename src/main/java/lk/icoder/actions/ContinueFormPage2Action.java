package lk.icoder.actions;

import com.opensymphony.xwork2.ActionSupport;
import lk.icoder.model.WorkflowSession;
import org.apache.struts2.interceptor.SessionAware;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ContinueFormPage2Action extends ActionSupport implements SessionAware {

    private String cngSessionId;
    private String page2Title;
    private String page2Name;
    private Map<String, Object> session;

    public String getCngSessionId() {
        return cngSessionId;
    }

    public void setCngSessionId(String cngSessionId) {
        this.cngSessionId = cngSessionId;
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

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public String execute() {
        List<WorkflowSession> workflowSessions = (List<WorkflowSession>) session.get("workflowSessions");

        if (workflowSessions == null) {
            workflowSessions = new ArrayList();
            session.put("workflowSessions", workflowSessions);
        }

        for (WorkflowSession ws : workflowSessions) {
            if (ws.getCngSessionId().equals(cngSessionId)) {
                ws.setPage2Title(page2Title);
                ws.setPage2Name(page2Name);
                break;
            }
        }

        return SUCCESS;
    }
}
