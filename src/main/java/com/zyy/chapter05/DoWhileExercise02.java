package com.zyy.chapter05;

import java.util.Scanner;

public class DoWhileExercise02 {

    //编写一个main方法
    public static void main(String[] args){
        //如果李三不还钱，则老韩将一直使出五连鞭，直到李三说还钱为止
        //[System.out.println("老韩问：还钱吗？ y/n")] do...while..
        //
        //化繁为简
        //(1)不停的问 “还钱吗？”
        //(2)使用char answer 接收回答 y/n，定义一个Scanner对象
        //(3)在do-while的while判断如果是y就不再循环
        Scanner myScanner = new Scanner(System.in);
        do{
            System.out.println("还钱吗？ 请输入y/n");
            char answer =  myScanner.next().charAt(0);
            if( 'y' == answer){
                break;
            }
            System.out.println("老韩使出闪电五连鞭~~~ ！！！");

        }while(true);
        System.out.println("李三还了老韩钱~~~");
    }
}
