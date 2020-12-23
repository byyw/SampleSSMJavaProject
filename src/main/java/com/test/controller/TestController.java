package com.test.controller;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import com.test.service.TestService;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/test")
public class TestController {
    @Resource
    private TestService testService;

    @RequestMapping("/findStu")
    @ResponseBody
    public Object findStu(HttpServletRequest request){
        String opt = request.getParameter("opt");
        System.out.println(opt);
        List list = testService.findStu();
        return list;
    }
}