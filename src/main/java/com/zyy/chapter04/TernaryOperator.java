package com.zyy.chapter04;

//三元运算符的使用
public class TernaryOperator {
    //编写一个Main方法
    public static void main(String[] args){
        int a = 10;
        int b = 99;
        //解读
        // 1. a > b 为false
        // 2. 返回 b--,先返回b的值,然后再b-1
        // 3. 返回的结果为99
        int result = a > b ? a++:b--;
        System.out.println("result = " + result);
        System.out.println("a = " + a );
        System.out.println("b = " + b );
    }

}
