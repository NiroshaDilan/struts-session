package lk.icoder.actions;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.interceptor.SessionAware;

import java.util.Map;
import java.util.UUID;

public class EnterWorkflowAction extends ActionSupport implements SessionAware {

    private Map<String, Object> session;
    private String cngSessionId;

    @Override
    public void setSession(Map<String, Object> session) {
        this.session = session;
    }

    @Override
    public String execute() throws Exception {
        cngSessionId = UUID.randomUUID().toString();
        session.put("cngSessionId", cngSessionId);

        // Redirect to respondentActivityResponse.action with cngSessionId as a parameter
        return "redirect";
    }

    public String getCngSessionId() {
        return cngSessionId;
    }
}
