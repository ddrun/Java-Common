package com.djran.example.swagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
@RestController
@RequestMapping("user")
public class UserController {
    @PostMapping("list")
    @ApiOperation("获取user列表")
    public List queryUserList(){
        return new ArrayList();
    }
    @PostMapping("detail")
    @ApiOperation("获取user详情")
    public String getUserDetail(String id){
        return "userContent";
    }
}
