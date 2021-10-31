package com.md.controller;

import com.md.dto.ApiResult;
import com.md.dto.ResultGenerator;
import com.md.entity.TestCase;
import com.md.entity.request.TestCaseRequest;
import com.md.service.TestCaseService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/TestCase")
public class TestCaseController {
    @Resource
    private TestCaseService testCaseService;
    @PostMapping("/addTestcase")
    @CrossOrigin
    public ApiResult addTestcase(@RequestBody TestCaseRequest testCaseRequest)  {
        TestCase testCase = testCaseService.addTestCase(testCaseRequest);
        testCaseService.save(testCase);
        return ResultGenerator.genSuccess();
    }

    @PostMapping("/searchTestCase")
    @CrossOrigin
    public ApiResult searchTestCase(@RequestBody String searchTest){
        String description = searchTest.trim();
        String nodeid = searchTest.trim();
        List<TestCase> list = testCaseService.searchTestCase(description,nodeid);
        return ResultGenerator.genSuccess(list);
    }

    @GetMapping("/TestCaseList")
    @CrossOrigin
    public ApiResult getTestCastList(){
        List<TestCase> list = testCaseService.list();
        return ResultGenerator.genSuccess(list);
    }
    @GetMapping("/deleteTestCase")
    @CrossOrigin
    public ApiResult deleteTestCase(Long id){
        TestCase testCase = testCaseService.deleteTestCase(id);
        return ResultGenerator.genSuccess(testCase);
    }

    @PostMapping("/updateTestCase")
    @CrossOrigin
    public ApiResult updateTestCase(@RequestBody TestCaseRequest testCaseRequest){
        TestCase testCase = testCaseService.updateTestCase(testCaseRequest);
        return ResultGenerator.genSuccess(testCase);
    }


}
