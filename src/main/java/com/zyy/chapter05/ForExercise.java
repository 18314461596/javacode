package com.zyy.chapter05;

public class ForExercise {

    // 编写一个main方法
    public static void main(String[] args){
        //打印1~100之间所有是9的倍数的整数，统计个数及总和。【化繁为简，先死后活】
        //老韩的两个编程思想（技巧）
        //1.化繁为简：即将复杂的需求，拆解成简单的需求，逐步完成
        //2.先死后活：先考虑固定的值，然后转成可以灵活变化的值
        //
        //思路分析
        //打印1~100之间所有是9的倍数的整数，统计个数及总和
        //化繁为简
        //(1) 完成输出 1-100的值
        //(2) 在输出的过程中，进行过滤，只输出9的倍数 i % 9 == 0 ;
        //(3) 统计个数 定义一个变量int count = 0; 当条件满足时 count++;
        //(4) 总和，定义一个变量int sum = 0; 当条件满足时累积sum += i;
        //先死后活
        //(1) 为了适应更好的需求，把范围的开始值和结束值做成变量
        //(2) 还可以进一步9的倍数也做成变量 int t = 9;

        int t = 9;
        int starti = 1;
        int endi = 100;
        int count = 0;
        int sum = 0;
        for( int i = starti; i <= endi ; i++){
            if(i % t == 0){
                count++;
                sum += i;
                System.out.println("count"+count+" i= "+i+" sum= "+sum);
            }
        }
        System.out.println("count = " + count + " sum = " + sum);


    }

}
