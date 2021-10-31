package com.md.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.md.entity.TestCase;
import com.md.entity.request.TestCaseRequest;

import java.util.List;


public interface TestCaseService extends IService<TestCase> {
    TestCase addTestCase(TestCaseRequest testCaseRequest);
    List<TestCase> searchTestCase(String description,String nodeid);
    TestCase deleteTestCase(Long id);
    TestCase updateTestCase(TestCaseRequest testCaseRequest);
}
