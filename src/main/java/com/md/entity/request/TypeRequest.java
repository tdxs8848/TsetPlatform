package com.md.entity.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel("分类请求类")
public class TypeRequest {

    @ApiModelProperty("用户名")
    private String name;



}
