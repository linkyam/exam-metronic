package com.fb.exam.common.myException;


import com.fb.exam.common.code.ResCode;

/**
 * Created by Administrator on 15-10-14.
 */
public class NotLoginException extends Exception{

    private ResCode resCode;
    private String resMsg;

    public ResCode getResCode() {
        return resCode;
    }

    public void setResCode(ResCode resCode) {
        this.resCode = resCode;
    }

    public String getResMsg() {
        return resMsg;
    }

    public void setResMsg(String resMsg) {
        this.resMsg = resMsg;
    }

    public NotLoginException(String msg){
        super(msg);
    }

    public NotLoginException(ResCode resCode,String resMsg){
        super(resMsg);
        this.resCode=resCode;
        this.resMsg=resMsg;
    }
}
