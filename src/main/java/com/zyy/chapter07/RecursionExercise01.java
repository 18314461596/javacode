package com.zyy.chapter07;

public class RecursionExercise01 {
    //编写一个main方法
    public static void main(String[] args){
        T t1 = new T();

        int n = 7;
        int res = t1.fibonacci(n);
        if(res != -1){
            System.out.println("当 n = " + n + "对应的斐波那契数 = " + res);
        }

        //桃子问题
        int day = 1;
        int peachNum = t1.peach(day);
        if(peachNum != -1){
            System.out.println("第 " + day + "天有" + peachNum + "个桃子");
        }

    }
    static class T{
        /*
        请使用递归的方法求出斐波那契数 1,1,2,3,5,6,13.....给你一个整数n，求出斐波那契数中第n个值
        思路分析
        1. 当 n = 1 斐波那契数 是1
        2. 当 n = 2 斐波那契数 是1
        3. 当 n >= 3 斐波那契数 是前两个数的和
        4. 这里就是一个递归的思路
         */

        public int fibonacci(int n){
            if(n >= 1){
                if( n == 1 || n == 2){
                    return 1;
                }else{
                    return fibonacci(n-1) + fibonacci(n-2);
                }
            }else{
                System.out.println("要求输入的n是 >= 1的整数");
                return -1;
            }
        }

        /*
        猴子吃桃子问题: 有一堆桃子,猴子第一天吃了其中的一半,并多吃了一个!
        以后每天猴子都吃其中的一半,然后再多吃一个，直到第10天时
        想再吃时(即还没吃),发现只有一个桃子了.问题:最初共有多少个桃子?

        思路分析: 逆推
        1.day = 10 时,有1个桃子
        2.day = 9 时,有(day10 + 1) * 2 = 4个
        3.day = 8 时,有(day9 + 1) * 2 = 10个
        4.规律就是 前一天的桃子 = (后一天的桃子 + 1) * 2//就是我们的能力
        5.递归
         */
        public int peach(int day){
            if(day == 10){ //第十天,只有一个桃
                return 1;
            }else if(day >= 1 && day <= 9){
                return (peach(day+1)+1)*2;//规则
            }else{
                System.out.println("day在1-10之间");
                return -1;
            }
        }





    }
}
