package com.md.exception;

import com.md.emuns.ApiEnums;
import lombok.Data;

@Data
public class GlobalException extends RuntimeException{

    private ApiEnums apiEnums;

    public GlobalException(ApiEnums apiEnums){
        super(apiEnums.getMessage());
        this.apiEnums = apiEnums;
    }

}
