package com.tester.extend.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodsDemo {

    @Test
    public void test1(){
        Assert.assertEquals(1,2);
    }
    @Test
    public void test2(){
        Assert.assertEquals(1111,1111);
    }
    @Test
    public void test3(){
        Assert.assertEquals("aaa","aaa");
    }
    @Test
    public void logDemo(){
        Reporter.log("Its my log");
        throw new RuntimeException("自己的运行时异常");

    }
}
