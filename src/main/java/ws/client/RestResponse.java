package ws.client;

public class RestResponse {

    private String[] messages;
    private State[] result;

    public String[] getMessages() {
        return messages;
    }

    public void setMessages(String[] messages) {
        this.messages = messages;
    }

    public State[] getResult() {
        return result;
    }

    public void setResult(State[] result) {
        this.result = result;
    }
}
