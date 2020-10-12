package com.zhaolian.demo.web.util;

public class CommonResult<T>{
    //状态码
    // 200 成功  404 失败
    private int code;
    //提示消息
    private String message;
    //发送到前端的数据 Pageben、单个实体类对象
    private T data;

    public CommonResult() {

    }



    public CommonResult(int code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "BizResult{" +
                "code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
