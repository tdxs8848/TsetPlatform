package com.md.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.md.emuns.ApiEnums;
import com.md.entity.EnvParam;

import com.md.entity.request.EnvParamRequest;
import com.md.exception.GlobalException;
import com.md.mapper.EnvParamMapper;
import com.md.service.EnvParamService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class EnvParamImpl extends ServiceImpl<EnvParamMapper, EnvParam> implements EnvParamService {

    @Resource
    private EnvParamMapper envParamMapper;


    @Override
    public EnvParam addEnvparam(EnvParamRequest envParamRequest) {
        EnvParam ep = new EnvParam();
        BeanUtils.copyProperties(envParamRequest,ep);
        return ep;
    }


    @Override
    public EnvParam updateEnvparam(EnvParamRequest envParamRequest) {
        EnvParam envParam = envParamMapper.selectById(envParamRequest.getId());
        if(envParam == null){
            throw new GlobalException(ApiEnums.ERROR_ID_TO_UPDATE);
        }
        BeanUtils.copyProperties(envParamRequest, envParam);
        envParamMapper.updateById(envParam);
        return envParamMapper.selectById(envParam.getId());
    }

    @Override
    public EnvParam deleteByEnvparamId(Long id) {
        EnvParam envParam = envParamMapper.selectById(id);
        if (envParam == null){
            throw new GlobalException(ApiEnums.ERROR_ID_TO_DELETE);
        }
        envParamMapper.deleteById(id);
        return envParam;
    }
}
