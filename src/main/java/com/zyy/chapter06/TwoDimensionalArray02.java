package com.zyy.chapter06;

public class TwoDimensionalArray02 {
    //编写一个main方法
    public static void main(String[] args){
        //int arr[][] = new int[2][3];

        //int[][] arr1 ;

        int[][] arr; //声明二维数组
        arr = new int[2][3]; //再开空间 表明生成一个 2行3列的二维数组

        arr[1][1] = 8;
        //遍历arr数组
        label1:
        for(int i = 0; i < arr.length; i++){
            label2:
            for(int j = 0 ; j < arr[i].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }





    }
}
