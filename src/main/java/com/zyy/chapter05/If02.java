package com.zyy.chapter05;

import java.util.Scanner;

public class If02 {
    //编写一个main方法
    public static void main(String[] args){


        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入年龄");
        //把年龄保存到一个变量中 int age
        int age= myScanner.nextInt();
        //使用if - else 判断，输出对应信息
        if(age > 18){
            System.out.println("大于18岁，抄斩~");
        }else{
            //双分支
            System.out.println("你年龄不大，先放过你~");
        }
        System.out.println("程序继续。。。");
    }
}
