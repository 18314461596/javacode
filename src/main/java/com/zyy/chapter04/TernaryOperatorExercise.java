package com.zyy.chapter04;

public class TernaryOperatorExercise {
    //编写一个main方法
    public static void main(String[] args){
        //案例：实现三个数的最大值
        int n1 = 553;
        int n2 = 33;
        int n3 = 123;
        // 思路
        // 1.先得到n1和n2中的最大值，保存到max1
        // 2.然后再求出max1和n3中的最大值，保存在max2

        int  max1 = n1 > n2 ? n1:n2;
        int  max2 = max1 > n3 ? max1:n3;
        System.out.println( " 最大数 = " + max2);

        //使用一条语句实现，推荐使用上面方法
        // 提示：后面我们可以用更好的方法，比如排序
        int max = (n1 > n2 ? n1:n2)>n3?(n1>n2?n1:n2):n3;
        System.out.println("最大数 = " + max);

        int abcclass = 10;
        int n = 40;
        int N = 50;
        System.out.println("n = " + n); //40
        System.out.println("N = " + N); //50

        //?abc 和 aBc时两个不同的变量
        int abc = 100;
        int aBc = 200;

        int a , b = 300;
        //int a-b = 10;
        int goto1 = 10;




    }

}
