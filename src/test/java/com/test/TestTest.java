package com.test;

import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import com.test.service.TestService;

import org.apache.log4j.Logger;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-mybatis.xml"})
public class TestTest {
    private static Logger logger = Logger.getLogger(TestTest.class);
    private ApplicationContext ac;
    @Resource
    private TestService testService;

    @Test
    public void findStu() {
        List list = testService.findStu();
        for(Object obj:list){
            Map<String,Object> map = (Map<String,Object>) obj;
            for(Map.Entry<String, Object> entry : map.entrySet()){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }
        }
    }
}