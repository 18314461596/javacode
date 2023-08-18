package com.zyy.chapter05;

public class Continue01 {

    //编写一个Main方法
    public static void main(String[] args){
        //代码
        int i = 1;
        while(i <= 4){
            i++;
            if(i == 2){
                continue;
            }
            System.out.println("i=" + i);
        }
    }
}
