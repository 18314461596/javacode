package com.zyy.chapter04;

// !和^案例演示
public class InverseOperator {
    //编写一个main方法
    public static void main(String[] args){
        // ! 操作是取反 T -> F，F - > T
        System.out.println(60 > 20); //T
        System.out.println(!(60 > 20)); //F

        // a^b:叫逻辑异或，当a 和 b不同时，则结果为true，否则为false
        boolean b = (10 > 1) ^ (3 > 5 );
        System.out.println(10 > 1);
        System.out.println(3 > 5);
        System.out.println("b = " + b);//T
    }
}
