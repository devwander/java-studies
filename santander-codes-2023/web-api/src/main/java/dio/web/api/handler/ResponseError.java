package dio.web.api.handler;

import java.util.Date;

public class ResponseError {
    private Date timestaamp = new Date();
    private String status = "error";
    private int statusCode = 400;
    private String error;

    public Date getTimestaamp() {
        return timestaamp;
    }

    public void setTimestaamp(Date timestaamp) {
        this.timestaamp = timestaamp;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(int statusCode) {
        this.statusCode = statusCode;
    }

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }
}
