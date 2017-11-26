package com.djran.example.swagger.config;

import io.swagger.annotations.ApiOperation;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.mvc.method.RequestMappingInfo;
import org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerMapping;

import java.lang.reflect.Method;

/**
 * Created by d.djran@gmail.com on 2017/11/25
 */
@Component
public class HandlerMappingConfig extends RequestMappingHandlerMapping{
    @Override
    protected RequestMappingInfo getMappingForMethod(Method method, Class<?> handlerType) {
        RequestMappingInfo requestMappingInfo=super.getMappingForMethod(method, handlerType);
        if(requestMappingInfo==null){
            return null;
        }
        ApiOperation apiOperation= AnnotationUtils.findAnnotation(method,ApiOperation.class);
        if(apiOperation==null){
            return null;
        }
        System.out.println(apiOperation.toString());
        //此处可以做相关业务处理
        return null;
    }
}
