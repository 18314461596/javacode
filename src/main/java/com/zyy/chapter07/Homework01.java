package com.zyy.chapter07;

public class Homework01 {
    //��д��A01�����巽��max��ʵ����ĳ��double��������ֵm,������
    public static void main(String[] args){
       double[] arr = {1.0,2,3,9,-1};
       System.out.println("arr����Ϊ : =================" );
       for(int i = 0; i < arr.length; i++){
           System.out.print(arr[i] + " ");
       }

       A01 A = new A01();
       System.out.println("arr���������ֵΪ : " +  A.DoubleArrMax(arr));


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
