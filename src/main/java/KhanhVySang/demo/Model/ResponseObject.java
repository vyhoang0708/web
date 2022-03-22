package KhanhVySang.demo.Model;

public class ResponseObject {
    private String state;
    private String message;
    private Object data;

    public ResponseObject() {}

    public ResponseObject(String state, String message, Object data) {
        this.state = state;
        this.message = message;
        this.data = data;
    }

    public String getState() {
        return this.state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getMessage() {
        return this.message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return this.data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
