package com.test.service.impl;

import java.util.List;

import javax.annotation.Resource;

import com.test.dao.TestDao;
import com.test.service.TestService;

import org.springframework.stereotype.Service;

@Service("testService")
public class TestServiceImpl implements TestService{
    @Resource
    private TestDao testDao;
    @Override
    public List findStu(){
        return this.testDao.findStu();
    }
}