package com.bill.common.exception;

public enum BizCodeEnume {
    UNKNOW_EXCEPTION(10000,"系统未知異常"),
    VAILD_EXCEPTION(10001,"参数格式校正失敗");

    private int code;
    private String msg;
    BizCodeEnume(int code,String msg){
        this.code = code;
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public String getMsg() {
        return msg;
    }
}
