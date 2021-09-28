package com.sicau.common.Response;

import lombok.Data;
import lombok.Getter;

/**
 * @author he
 * @date 2021/9/27
 * @time 10:37
 * @message
 */
@Data
public class ResultBean<T> {
    private ResultBean(){}

    /*返回状态码，1：成功，0：失败*/


    @Getter
    //@ApiModelProperty(value = "访问成功或失败的状态,1成功，0，失败")
    private  int state;



    @Getter
    // @ApiModelProperty(value = "tip的值对应state,当state=1,tip的值就为SUCCESS，当state=0,tip的值就为FAIL")
    private String tip;


    @Getter
    // @ApiModelProperty(value = "返回的状态码，code对比state来说，更详细的代表某种状态，code会根据不同的情况，返回不同的code,客户端可以根据code，自定义提示框的内容")
    private int code;

    @Getter
    //  @ApiModelProperty(value = "message是对code的解释")
    private String message;

    //private ResultEnum resultEnum;

    @Getter
    // @ApiModelProperty(value = "当访问成功，data代表服务端返回给客户端的数据")
    private T data;

    @Getter
    private int count;

    public static  ResultBean pageInfo(){
        ResultBean result = new ResultBean();
        result.state = 1;
        result.code = 200;
        result.tip = "SUCCESS";
        return result;
    }
    public ResultBean<T> count(Integer count) {
        this.count = count;
        return this;
    }
    public static ResultBean success() {
        ResultBean result = new ResultBean();
        result.state = 1;
        result.code = 200;
        result.tip = "SUCCESS";
        return result;
    }

    public static ResultBean fail() {
        ResultBean result = new ResultBean();
        result.state = 0;
        result.code = 400;
        result.tip = "FAIL";
        return result;
    }


    public ResultBean<T> code(Integer code) {
        this.code = code;
        return this;
    }

    public ResultBean<T> msg(String message){
        this.message = message;
        return this;
    }



    public ResultBean<T> setResultEnum(ResultEnum resultEnum) {
        this.code = resultEnum.getCode();
        this.message = resultEnum.getMsg();
        return this;
    }


    public ResultBean<T> data(T data){
        this.data = data;
        return this;
    }

    public int getState() {
        return state;
    }
}
