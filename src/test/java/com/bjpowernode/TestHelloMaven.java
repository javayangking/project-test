package com.bjpowernode;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author yangkai
 * @create 2021-09-15 16:11
 */
public class TestHelloMaven {
    @Test
    public void testAddNumber(){
        HelloMaven helloMaven = new HelloMaven();
        int result = helloMaven.addNumber(10, 20);
        Assert.assertEquals(30,result);

    }
}
