package com.md.entity.request;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("测试用例请求类")
public class TestCaseRequest {
    @ApiModelProperty("环境id")
    private Long id;

    @ApiModelProperty(value="用例唯一id")
    private String nodeid;

    @ApiModelProperty(value="用例描述")
    private String description;
}
