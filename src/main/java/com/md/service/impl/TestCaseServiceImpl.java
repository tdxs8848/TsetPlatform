package com.md.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.md.emuns.ApiEnums;
import com.md.entity.TestCase;
import com.md.entity.request.TestCaseRequest;
import com.md.exception.GlobalException;
import com.md.mapper.TestCaseMapper;
import com.md.service.TestCaseService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestCaseServiceImpl  extends ServiceImpl<TestCaseMapper, TestCase> implements TestCaseService {

    @Resource
    TestCaseMapper testCaseMapper;

    @Override
    public TestCase addTestCase(TestCaseRequest testCaseRequest) {
        TestCase tc = new TestCase();
        BeanUtils.copyProperties(testCaseRequest,tc);
        return tc;
    }

    @Override
    public List<TestCase> searchTestCase(String description,String nodeid) {
        return testCaseMapper.searchTestCase("%"+description+"%","%"+nodeid+"%");
    }

    @Override
    public TestCase deleteTestCase(Long id) {
        TestCase testCase = testCaseMapper.selectById(id);
        if (testCase == null){
            throw new GlobalException(ApiEnums.ERROR_ID_TO_DELETE);
        }
        testCaseMapper.deleteById(id);
        return testCase;
    }

    @Override
    public TestCase updateTestCase(TestCaseRequest testCaseRequest) {
        TestCase testCase = testCaseMapper.selectById(testCaseRequest.getId());
        if (testCase == null){
            throw new GlobalException(ApiEnums.ERROR_ID_TO_UPDATE);
        }
        BeanUtils.copyProperties(testCaseRequest, testCase);
        testCaseMapper.updateById(testCase);
        return testCaseMapper.selectById(testCase.getId());
    }

}
