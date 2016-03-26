package com.fb.exam.common.result;


import com.fb.exam.common.code.ResCode;

import java.util.Date;

/**
 * Created by T420 on 15-9-16.
 */
public class Result {
    /**
     * 操作结果约定码
     */
    protected Integer code;

    /**
     * 操作结果信息
     */
    protected String message;

    private Date currentTime;

    public Date getCurrentTime() {
        return new Date();
    }

    public void setCurrentTime(Date currentTime) {
        this.currentTime = currentTime;
    }

    public Result(){
        super();
    }

    public Result(ResCode resCode,String message){
        this.code=resCode.getCode();
        this.message=message;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(ResCode resCode){
        this.code=resCode.getCode();
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
