package com.sajal;

import org.springframework.stereotype.Component;

@Component
public class A {
    public void printHello(){
        System.out.println("hello");
    }
    int getNum(){
        int num = 30061;
        System.out.println("getNum called");
        return  num;
    }
    public int getSum(int a, int b){
        System.out.println("getSum called");
        return a+b;
    }
}
