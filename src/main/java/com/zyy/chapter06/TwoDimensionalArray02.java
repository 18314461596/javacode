package com.zyy.chapter06;

public class TwoDimensionalArray02 {
    //��дһ��main����
    public static void main(String[] args){
        //int arr[][] = new int[2][3];

        //int[][] arr1 ;

        int[][] arr; //������ά����
        arr = new int[2][3]; //�ٿ��ռ� ��������һ�� 2��3�еĶ�ά����

        arr[1][1] = 8;
        //����arr����
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
