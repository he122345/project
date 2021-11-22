package com.he.log;

import lombok.Data;

/**
 * @author he
 * @date 2021/8/1
 * @time 11:02
 * @message
 */
@Data
public class ResultData {
    private int code=200;
    private String msg;
    private Object data;
    public static ResultData success(){
        ResultData resultData=new ResultData();
        resultData.code=200;
        return resultData;
    }
}
