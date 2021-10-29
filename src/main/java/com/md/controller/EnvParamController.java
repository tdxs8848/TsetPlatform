package com.md.controller;

import com.md.dto.ApiResult;
import com.md.dto.ResultGenerator;
import com.md.entity.EnvParam;
import com.md.entity.request.EnvParamRequest;
import com.md.service.EnvParamService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/envparam")
public class EnvParamController {
    @Resource
    private EnvParamService envParamService;
    @PostMapping("/addEnvparam")
    @CrossOrigin
    public ApiResult addEnvparam(@RequestBody EnvParamRequest envParamRequest)  {
        EnvParam envParam = envParamService.addEnvparam(envParamRequest);
        envParamService.save(envParam);
        return ResultGenerator.genSuccess(envParam);
    }

    @GetMapping("/envparamList")
    @CrossOrigin
    public ApiResult listEnvParam(){
        List<EnvParam> list =envParamService.list();
        return ResultGenerator.genSuccess(list);
    }

    @PostMapping("/updateEnvparam")
    @CrossOrigin
    public ApiResult updateEnvparam(@RequestBody EnvParamRequest envParamRequest){
        EnvParam envParam = envParamService.updateEnvparam(envParamRequest);
        return ResultGenerator.genSuccess(envParam);
    }

    @PostMapping("/deleteEnvparam")
    @CrossOrigin
    public ApiResult deleteEnvparam(@RequestBody Long id){
        EnvParam envParam = envParamService.deleteByEnvparamId(id);
        return ResultGenerator.genSuccess(envParam);
    }

}
