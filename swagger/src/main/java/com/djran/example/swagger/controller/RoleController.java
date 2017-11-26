package com.djran.example.swagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("role")
public class RoleController {
    @PostMapping("list")
    @ApiOperation("获取机构列表")
    public List queryRoleList(){
        return new ArrayList();
    }
    @PostMapping("detail")
    @ApiOperation("获取机构详情")
    public String getRole(String id){
        return "roleContent";
    }
}
