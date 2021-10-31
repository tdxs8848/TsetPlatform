package com.md.dto;

import com.md.emuns.ApiEnums;
import lombok.Data;

import java.util.List;

@Data
public class ApiResult<T> {

    //状态码
    private int code;

    //消息
    private String message;

    //返回的数据
    private T data;


    private int tolal;

    public ApiResult(){

    }

    public ApiResult(int code ,String message){
        this.code = code;
        this.message = message;
    }

    public ApiResult(ApiEnums apiEnums,T data){
        this.code = apiEnums.getCode();
        this.message = apiEnums.getMessage();
        this.data = data;
    }
    public ApiResult(ApiEnums apiEnums){
        this.code = apiEnums.getCode();
        this.message = apiEnums.getMessage();
    }

    public ApiResult(ApiEnums apiEnums, List data){
        this.code = apiEnums.getCode();
        this.message = apiEnums.getMessage();
        this.tolal = data.size();
        this.data = (T)data;
    }

    public ApiResult(int code ,String message,T data){
        this.code = code;
        this.message = message;
        this.data = data;
    }

}
