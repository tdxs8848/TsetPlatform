package com.md.entity;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "环境参数对象",description = "存放环境参数")
public class EnvParam {
    private static final long serialVersionUID = 1L;
    public EnvParam(){
    }

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value="环境名称")
    private String env;

    @ApiModelProperty(value="环境url")
    private String url;

}
