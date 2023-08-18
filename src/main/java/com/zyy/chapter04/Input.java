package com.zyy.chapter04;

import java.util.Scanner;

public class Input {

    //编写一个main方法
    public static void main(String[] args){
        //演示接受用户的输入
        //步骤
        //Scanner类，表示简单文本扫描器，在java.util包
        //1.导入/引入 Scanner类所在的包
        //2.创建Scanner对象，new 创建一个对象，体会
        //  myScanner 就是Scanner类的对象
        Scanner myScanner = new Scanner(System.in);
        //3.接收用户输入了，使用相关的方法
        System.out.println("请输入名字");

        //当程序执行到next方法时，会等待用户输入~~~
        String name = myScanner.next(); //接收用户输入字符串
        System.out.println("请输入年龄");
        int age = myScanner.nextInt(); //接受用户输入的int
        System.out.println("请输入薪水");
        double sal = myScanner.nextDouble();//接收用户输入的double

        System.out.println("请输入工作年限");
        int workyears = myScanner.nextInt();//接收第二个Int类型的数据

        System.out.println("人的信息如下：");
        System.out.println("名字=" + name + "年龄"+age + "薪水" + sal + "工作年限" + workyears);


    }
}
