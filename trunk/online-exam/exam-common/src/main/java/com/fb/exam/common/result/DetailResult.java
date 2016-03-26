package com.fb.exam.common.result;


import com.fb.exam.common.code.ResCode;

/**
 * Created by T420 on 15-9-16.
 */
public class DetailResult<T> extends Result{

    /**
     * 定义返回值类型
     */
    private T data;

    public DetailResult(){
        super();
    }
    public DetailResult(ResCode code, String message) {
        super(code, message);
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
