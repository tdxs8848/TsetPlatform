package com.md.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.md.entity.TestCase;

import java.util.List;

public interface TestCaseMapper extends BaseMapper<TestCase> {
    List<TestCase> searchTestCase(String description ,String nodeid);
}
