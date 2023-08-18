package com.zyy.chapter05;

import java.util.Scanner;

public class BreakExercise02 {
    //编写一个main方法
    public static void main(String[] args){
        //实现登录验证，有三次验证机会，如果用户名为“丁真”，密码“666”提示登录成功
        //否则提示还有几次机会
        //
        //思路分析
        //1.创建Scanner对象接收用户输入
        //2.定义String name;String passwd;保存用户名和密码
        //3.最多循环3次【登录3次】，如果满足条件就提前退出
        //4.定义一般变量int chance 记录还有几次登录机会
        //
        //代码实现
        Scanner myScanner = new Scanner(System.in);
        String name = "丁真";
        String passwd = "666";
        int chance = 3; //登录一次，减少一次
        for(int i = 1; i <= 3; i++){
            System.out.println("请输入名字");
            name = myScanner.next();
            System.out.println("请输入密码");
            passwd = myScanner.next();
            //比较输入的名字和密码是否正确
            //补充说明字符串的内容 比较 使用的方法equals
            if("丁真".equals(name) && "666".equals(passwd)){
            //if(name == "丁真" && passwd == "666"){  字符串判断相等时，不能使用 == ，会无效
            System.out.println("恭喜你，登录成功~");
            break;
            }else{
                chance--;
                System.out.println("你还有"+chance+"次登录机会");
            }



        }
    }
}
