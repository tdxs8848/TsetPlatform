package com.md.entity.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("环境变量请求类")
public class EnvParamRequest {
    @ApiModelProperty("环境id")
    private Long id;
    @ApiModelProperty("环境名称")
    private String env;
    @ApiModelProperty("环境url")
    private  String url;
}
