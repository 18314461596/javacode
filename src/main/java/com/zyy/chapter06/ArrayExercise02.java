package com.zyy.chapter06;

public class ArrayExercise02 {
    //��дһ��main����
    public static void main(String[] args){
        //�����һ������int[]�����ֵ {4,-1,9, 10,23}�����õ���Ӧ���±�
        //�Ϻ�˼·����
        //1. ����һ��int���� int[] arr = {4,-1,9, 10,23};
        //2. �ٶ� max = arr[0] �����ֵ , maxIndex=0;
        //3. ���±� 1 ��ʼ����arr�� ���max < ��ǰԪ�أ�˵��max ����������
        //   ���ֵ, ���Ǿ� max=��ǰԪ��; maxIndex=��ǰԪ���±�
        //4. �����Ǳ����������arr�� , max�������������ֵ��maxIndex���ֵ
        //   ��Ӧ���±�
        int[] arr = {4,-1,9,10,23};
        int max = arr[0] ;
        int maxIndex = 0;
        for(int i = 0 ; i < arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
                maxIndex = i;
            }
        }
        System.out.println("arr�е����ֵ��" + max );
        System.out.println("arr�е����ֵ���±���" + maxIndex);

    }
}
