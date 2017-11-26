package com.djran.example.swagger.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("post")
@Api("文章")
public class PostController {
    @GetMapping("list")
    @ApiOperation(value = "获取文章列表")
    public List queryPostList(){
        return new ArrayList();
    }
    @GetMapping("detail")
    @ApiOperation(value = "获取文章详情")
    public String getPostDetail(String id){
        return "postContent";
    }


}
