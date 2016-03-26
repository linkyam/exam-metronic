package com.fb.exam.common.code;

/**
 * Created by Administrator on 15-10-14.
 */
public enum ResCode {
    LOGIN_ERR(9),
    SUCCESS(200),//成功
    FAILE(-1),//失败
    ERR(500),//错误
    EXAM_NOT_START(2000),//考试没开始
    EXAM_IS_FINIST(3000),//考试已经结束
    NOT_JURISDICTION(400),//无权限
    NOT_LOGIN(302);//未登录

    private final int code;

    private ResCode(int code){
        this.code=code;
    }
    public int getCode(){
        return code;
    }
}
