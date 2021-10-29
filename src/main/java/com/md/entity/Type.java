package com.md.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "Type对象",description = "分类对象")
public class Type implements Serializable {
    private static final long serialVersionUID = 1L;
    public Type(){
    }

    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value="分类名称")
    private String name;

    @ApiModelProperty(value = "分类图片")
    private String pic;



}
