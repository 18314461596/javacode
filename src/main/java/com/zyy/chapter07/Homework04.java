package com.zyy.chapter07;

//��д��A03,ʵ������ĸ��ƹ���copyArr,���������,����һ���µ�����
//Ԫ�غ;�����һ��
//�����������������ж� ��

public class Homework04 {
    public static void main(String[] args){
        int[] arr1 = {1,8,3,1,4,4,6,1,5,9,6};
        A03 a03 = new A03();
        int[] arr2 = a03.copyArr(arr1);
        for(int i = 0; i < arr2.length; i++){
            System.out.print(arr2[i] + " ");
        }


    }
}
class A03{
    public int[] copyArr(int[] arr1){
        int[] arr2 =new int[arr1.length];
        for(int i = 0; i < arr1.length; i++){
            arr2[i] = arr1[i];
        }

        return arr2;
    }

    public A03(int[] arr){
        this.copyArr(arr);
    }

    A03(){

    }
}
