package com.md.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.md.entity.Type;
import java.util.List;


public interface TypeMapper extends BaseMapper<Type> {
    List<Type> selectByTypeName(String typeName);
}
