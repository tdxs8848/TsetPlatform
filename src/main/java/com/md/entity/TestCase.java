package com.md.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = false)
@ApiModel(value = "测试用例对象",description = "测试用例管理")
public class TestCase {
    private static final long serialVersionUID = 1L;
    public TestCase(){
    }
    @TableId(type = IdType.ASSIGN_ID)
    private Long id;

    @ApiModelProperty(value="用例唯一id")
    private String nodeid;

    @ApiModelProperty(value="用例描述")
    private String description;

}
