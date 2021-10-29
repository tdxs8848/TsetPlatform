package com.md.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.md.entity.Type;
import com.md.entity.request.TypeRequest;
import com.md.mapper.TypeMapper;
import com.md.service.TypeService;
import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class TypeImpl extends ServiceImpl<TypeMapper,Type> implements TypeService {

    @Resource
    private TypeMapper typeMapper;


    @Override
    public List<Type> searchType(String typeName) {
        return typeMapper.selectByTypeName("%"+typeName+"%");
    }

    @Override
    public Type addType(TypeRequest typeRequest) {
        Type type = new Type();
        BeanUtils.copyProperties(typeRequest,type);


        return type;
    }


}
