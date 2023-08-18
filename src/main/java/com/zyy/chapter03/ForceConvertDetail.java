package com.zyy.chapter03;

public class ForceConvertDetail {

    //编写一个main方法
    public static void main(String[] args){

        //演示强制类型转换
        //强转符号只针对最近的操作数有效，往往会使用小括号提升优先级
        //int x = (int)10*3.5+6*1.5;//编译错误 -> int
        int x = (int)(10*3.5+6*1.5);
        System.out.println(x);

        char c1 = 100; //ok
        int m = 100; //ok
        //char c2 = m; //错误 char -> int是正常转 ，int -> char要强转
        char c3 = (char)m;//ok
        System.out.println(c3);//100对应的字符，d字符
    }
}
