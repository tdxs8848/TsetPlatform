package com.md.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.md.entity.Type;
import com.md.entity.request.TypeRequest;

import java.util.List;

public interface TypeService extends IService<Type> {
    Type addType(TypeRequest typeRequest);
    List<Type> searchType(String TypeName);
}
