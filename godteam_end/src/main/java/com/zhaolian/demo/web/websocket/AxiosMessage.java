package com.zhaolian.demo.web.websocket;

public class AxiosMessage {
    String toName;//发给谁
    String formName;//谁发的
    String msg;//发的什么
    String date;//发送时间

    public AxiosMessage() {
        super();
    }
    public AxiosMessage(String toName, String formName, String msg, String date) {
        this.toName = toName;
        this.formName = formName;
        this.msg = msg;
        this.date = date;
    }
    public void setToName(String toName) {
        this.toName = toName;
    }

    public void setFormName(String formName) {
        this.formName = formName;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getToName() {
        return toName;
    }

    public String getFormName() {
        return formName;
    }

    public String getMsg() {
        return msg;
    }

    public String getDate() {
        return date;
    }

    @Override
    public String toString() {
        return "AxiosMessage{" +
                "toName='" + toName + '\'' +
                ", formName='" + formName + '\'' +
                ", msg='" + msg + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
