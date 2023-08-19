package com.zyy.chapter05;

import java.util.Scanner;

public class Homework04 {
    //编写一个main方法
    public static void main(String[] args){
      /*
		4. 判断一个整数是否是水仙花数，所谓水仙花数是指一个3位数，
		其各个位上数字立方和等于其本身。
		例如： 153 = 1*1*1 + 3*3*3 + 5*5*5

		思路分析 => 多听. 见多识广..
		1. 比如 int n = 153;
		2. 先得到 n的百位，十位 ，各位的数字, 使用 if 判断他们的立方和是否相等
		3. n的百位 = n / 100
		4. n的十位 = n % 100 / 10
		5. n的各位 = n % 10
		6. 判断即可
		 */

        Scanner myScanner = new Scanner(System.in);
        System.out.println("请输入一个百位的正整数，用来判断其是否为水仙花数");
        int num = myScanner.nextInt();
        int num100 = num / 100;
        int num10 = (num % 100) / 10;
        int num1 = num / 10;
        if(num100*num100*num100 + num10*num10*num10 + num1*num1*num1 == num){
            System.out.println("这个数是水仙花数");
        }else{
            System.out.println("这个数不是水仙花数");
        }
    }
}
