package com.zyy.chapter05;

public class Homework09 {
    //编写一个main方法
    public static void main(String[] args){
        //求(1)+（1+2）+（1+2+3）+（1+2+3+4）+...+(1+2+3+..+100)的结果
        //
        //思路分析
        //1. 一共有100项相加
        //2. 每一项的数字在逐渐增加
        //3. 很像一个双层循环
        //i 可以表示是第几项,同时也是当前项的最后一个数
        //4. 使用 sum 进行累计即可
        int sum = 0 ;//外层循环总和
        int sum1 = 0 ; //内层循环总和
        label1:
        for(int i = 1; i<=100; i++){ //外层循环
            label2:
            sum1 = 0;
            for(int j = 1; j<=i; j++){ //内层循环
                sum1 = sum1 + j;
                System.out.print(" i = " + i + "; j = " + j + "; sum1 = " + sum1);
                System.out.println(" ");
            }
            sum = sum + sum1;
            System.out.println(" ");
            System.out.println("i = " + i + ";sum = " + sum );
            System.out.println("=================");
        }
        System.out.println("外层sum的和为:" + sum);

    }
}
