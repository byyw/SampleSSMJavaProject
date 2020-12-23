package com.test.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("testDao")
public interface TestDao {
    public List findStu();
}