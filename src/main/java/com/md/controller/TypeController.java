package com.md.controller;

import com.md.dto.ApiResult;
import com.md.dto.ResultGenerator;
import com.md.entity.Type;
import com.md.entity.request.TypeRequest;
import com.md.service.TypeService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/type")
public class TypeController {
    static String PICURL ;

    @Resource
    private TypeService typeService;



    @PostMapping("/addtype")
    @CrossOrigin
    public ApiResult addType(@RequestBody TypeRequest typeRequest)  {
        Type type = typeService.addType(typeRequest);
        type.setName(typeRequest.getName());
        type.setPic(PICURL);
        System.out.println(PICURL);
        System.out.println("type........"+type);
        typeService.save(type);
        return ResultGenerator.genSuccess();

    }
//    get参数获取示例
    @GetMapping("/gettype/{id}")
    public ApiResult getType(@PathVariable Long id){
        Type type = typeService.getById(id);
        return ResultGenerator.genSuccess(type);
    }

//    查询示例 - 自定义sql示例
    @PostMapping("/searchtype")
    public ApiResult searchtype(@RequestBody TypeRequest tr){
        List<Type> typelist = typeService.searchType(tr.getName());
        return ResultGenerator.genSuccess(typelist);
    }

    @GetMapping("/typelist")
    @CrossOrigin
    public ApiResult typelist(){
        List<Type> list = typeService.list();
        return ResultGenerator.genSuccess(list);
    }

}
