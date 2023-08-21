package com.zyy.chapter07;

public class Recursion01 {

    //编写一个main方法
    public static void main(String[] args){
        T t1 = new T();
        t1.test(4); //输出什么? n=2,n=3,n=4
        int res = t1.factorial(5);
        System.out.println("5的阶乘 res = " + res);

    }
}

class T{
    //分析
    public void test(int n){
        if ( n > 2){
            test(n-1);
        }
        System.out.println(" n = " + n);
    }

    //factorial阶乘
    public int factorial(int n){
        if( n == 1){
            return 1;
        }else{
            return factorial(n-1) * n;
        }
    }
//递归的本质就是方法的自我调用
}
