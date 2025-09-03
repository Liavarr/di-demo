package guru.springframework.examplebeans;

public class FakeJmsBroker {
    private String jmsUser;
    private String jmsPassword;
    private String jmsUrl;

    public String getUser() {
        return jmsUser;
    }

    public void setUser(String jmsUser) {
        this.jmsUser = jmsUser;
    }

    public String getPassword() {
        return jmsPassword;
    }

    public void setPassword(String jmsPassword) {
        this.jmsPassword = jmsPassword;
    }

    public String getUrl() {
        return jmsUrl;
    }

    public void setUrl(String jmsUrl) {
        this.jmsUrl = jmsUrl;
    }
}
