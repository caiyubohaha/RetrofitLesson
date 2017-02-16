package cyb.bean;

/**
 * Created by user on 2017/2/16.
 */

public class Result<T> {

    /**
     * Code : 1
     * Message : Success
     * Data : {"sessionId":"v4w5c0pkqqitf5m4asvo4d3o","appkey":"NULL","apptoken":""}
     * IsSuccess : true
     */

    private int Code;
    private String Message;
    private boolean IsSuccess;
    private T Data;

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMessage() {
        return Message;
    }

    public void setMessage(String message) {
        Message = message;
    }

    public boolean isSuccess() {
        return IsSuccess;
    }

    public void setSuccess(boolean success) {
        IsSuccess = success;
    }

    public T getData() {
        return Data;
    }

    public void setData(T data) {
        Data = data;
    }
}
