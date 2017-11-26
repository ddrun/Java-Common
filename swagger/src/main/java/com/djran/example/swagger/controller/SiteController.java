package com.djran.example.swagger.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("site")
public class SiteController {
    @PostMapping("list")
    @ApiOperation("获取site列表")
    public List querySiteList(){
        return new ArrayList();
    }
    @PostMapping("detail")
    @ApiOperation("获取site详情")
    public String getSiteDetail(String id){
        return "siteContent";
    }
}
