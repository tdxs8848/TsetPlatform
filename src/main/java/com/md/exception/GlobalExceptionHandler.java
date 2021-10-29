package com.md.exception;

import com.md.dto.ApiResult;
import com.md.dto.ResultGenerator;
import com.md.emuns.ApiEnums;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
@ResponseBody
public class GlobalExceptionHandler {

    //拦截指定异常
    //出现了异常  有一个方法去处理异常
    @ExceptionHandler(value = ArithmeticException.class)
    public ApiResult exceptionHandler(ArithmeticException e){
        return ResultGenerator.genResult(ApiEnums.HAS_BY_ZERO_ERROR);
    }

    //拦截所有的异常
    @ExceptionHandler(value = Exception.class)
    public ApiResult exceptionHandler(Exception e){
        e.printStackTrace();
        return ResultGenerator.genFail();
    }

    //拦截自定义异常
    @ExceptionHandler(value = GlobalException.class)
    public ApiResult exceptionHandler( GlobalException e){
        return ResultGenerator.genResult(e.getApiEnums());
    }

}
