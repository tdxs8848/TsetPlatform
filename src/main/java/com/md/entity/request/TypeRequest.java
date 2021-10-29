package com.md.entity.request;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;


@Data
@ApiModel("分类请求类")
public class TypeRequest {
    @ApiModelProperty("分类id")
    private Long id;
    @ApiModelProperty("分类名称")
    private String name;



}
