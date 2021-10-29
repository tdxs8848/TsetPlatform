package com.md.emuns;


import lombok.Getter;

//枚举的使用 类名 点的形式 去调用
@Getter
public enum ApiEnums {

    SUCCESS(200,"成功"),
    FAIL(500,"失败"),

    HAS_BY_ZERO_ERROR(10001,"/by zero  任何数字不能除0"),
    USERNAME_OR_PASSWORD_ERROR(10002,"用户名或密码错误"),
    VERITY_ERROR(10003,"验证码错误"),
    ERROR_ID_TO_UPDATE(10004,"错误的id导致无法更新")
    ;

    private int code;

    private String message;

    ApiEnums(int code,String message){
        this.code = code;
        this.message = message;
    }

}
