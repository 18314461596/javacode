package com.zyy.chapter06;

public class Homework07 {
    //��дһ��main����
    public static void main(String[] args){
        //ð������
        //Ҫ���С����
        int[] arr = {20,-1,89,2,890,7};

        int temp = 0 ; //��������
        for(int i = 0; i < arr.length - 1; i++){//���ѭ��(��)
            for(int j = 0; j < arr.length-1-i; j++){ //ÿ�ֵıȽϴ���
                //�����С����,������ arr[j] > arr[j+1]
                //����Ӵ�С,������ arr[j] < arr[j+1]
                if(arr[j] > arr[j+1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        //�㶨
        System.out.println("\n====�����====");
        for(int i = 0 ; i < arr.length; i++){
            System.out.print(arr[i] + "\t");
        }
    }
}
