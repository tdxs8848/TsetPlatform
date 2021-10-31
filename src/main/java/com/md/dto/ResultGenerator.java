package com.md.dto;

import com.md.emuns.ApiEnums;

import java.util.List;

public class ResultGenerator {

    //返回一个成功的结果
    public static ApiResult genSuccess(Object data){
        return new ApiResult(ApiEnums.SUCCESS,data);
    }

    public static ApiResult genSuccess(List data){
        return new ApiResult(ApiEnums.SUCCESS,data);
    }

    public static ApiResult genSuccess(){
        return new ApiResult(ApiEnums.SUCCESS);
    }

    //返回一个失败的结果
    public static ApiResult genFail(){
        return new ApiResult(ApiEnums.FAIL);
    }

    //返回一个自定义的结果
    public static ApiResult genResult(ApiEnums apiEnums){
        return new ApiResult(apiEnums);
    }

}
