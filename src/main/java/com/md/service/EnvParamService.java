package com.md.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.md.entity.EnvParam;
import com.md.entity.request.EnvParamRequest;

import java.util.List;

public interface EnvParamService extends IService<EnvParam> {
    EnvParam addEnvparam(EnvParamRequest envParamRequest);
    EnvParam updateEnvparam(EnvParamRequest envParamRequest);
    EnvParam deleteByEnvparamId(Long id);

}
