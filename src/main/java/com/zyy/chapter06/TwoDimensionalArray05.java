package com.zyy.chapter06;

public class TwoDimensionalArray05 {

    // 编写一个main方法
    public static void main(String[] args){
        /*
        int arr[][] = {{4,6},{1,4,5,7},{-2}}; 遍历该二维数组，并得到和
         */

        //思路
        //1. 遍历二维数组，并得到各个值累积到int sum
        int sum = 0;
        int[][] arr = { {4,6},
                        {1,4,5,7},
                        {-2}};
        for(int i = 0; i < arr.length; i++){
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
                sum = sum + arr[i][j];
            }
            System.out.println(); // 换行
        }
        System.out.println("sum = " + sum);
    }
}
