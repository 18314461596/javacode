package com.zyy.chapter03;

public class Plus {

    //编写一个main方法
    public static void main(String[] args){
        System.out.println(100 + 98);//198
        System.out.println("100" + 98);//10098 字符串拼接

        System.out.println(100+3+"hello");//103hello,先进行数字运算，遇到字符串再进行字符串拼接
        System.out.println("hello" + 100 + 3);//hello1003
    }
}
