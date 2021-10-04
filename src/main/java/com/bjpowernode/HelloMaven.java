package com.bjpowernode;

/**
 * @author yangkai
 * @create 2021-09-15 16:07
 */
public class HelloMaven {
    
    public int addNumber(int i,int j){
        return i + j;
    }

    public static void main(String[] args) {
        HelloMaven helloMaven = new HelloMaven();
        int result = helloMaven.addNumber(10, 20);
        System.out.println("result= " + result);
    }
}
