package com.zyy.chapter05;

public class Homework09 {
    //��дһ��main����
    public static void main(String[] args){
        //��(1)+��1+2��+��1+2+3��+��1+2+3+4��+...+(1+2+3+..+100)�Ľ��
        //
        //˼·����
        //1. һ����100�����
        //2. ÿһ���������������
        //3. ����һ��˫��ѭ��
        //i ���Ա�ʾ�ǵڼ���,ͬʱҲ�ǵ�ǰ������һ����
        //4. ʹ�� sum �����ۼƼ���
        int sum = 0 ;//���ѭ���ܺ�
        int sum1 = 0 ; //�ڲ�ѭ���ܺ�
        label1:
        for(int i = 1; i<=100; i++){ //���ѭ��
            label2:
            sum1 = 0;
            for(int j = 1; j<=i; j++){ //�ڲ�ѭ��
                sum1 = sum1 + j;
                System.out.print(" i = " + i + "; j = " + j + "; sum1 = " + sum1);
                System.out.println(" ");
            }
            sum = sum + sum1;
            System.out.println(" ");
            System.out.println("i = " + i + ";sum = " + sum );
            System.out.println("=================");
        }
        System.out.println("���sum�ĺ�Ϊ:" + sum);

    }
}
