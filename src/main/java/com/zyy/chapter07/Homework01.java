package com.zyy.chapter07;

public class Homework01 {
    //编写类A01，定义方法max，实现求某个double数组的最大值m,并返回
    public static void main(String[] args){
       double[] arr = {1.0,2,3,9,-1};
       System.out.println("arr数组为 : =================" );
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " ");
       }

       A01 A = new A01();
       System.out.println("arr数组中最大值为 : " +  A.DoubleArrMax(arr));


    }
}
class A01{
    public double DoubleArrMax(double[] arr ){
        double max = arr[0];
        for(int i = 0; i < arr.length; i++ ){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
}
