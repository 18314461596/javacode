package com.zyy.chapter05;

import java.util.Scanner;

public class If01 {
    //��дһ��main����
    public static void main(String[] args){
        //��дһ�����򣬿��������˵����䣬�����ͬ־���������18�꣬
        //����������������18��Ҫ���Լ�����Ϊ�������������
        //
        //˼·����
        //1.������������䣬Ӧ�ö���һ��Scanner����
        //2.�����䱣�浽һ������ int age
        //3.ʹ��if�жϣ������Ӧ����Ϣ

        //Ӧ�ö���һ��Scanner����
        Scanner myScanner = new Scanner(System.in);
        System.out.println("����������");
        //�����䱣�浽һ������int age
        int age = myScanner.nextInt();
        if(age > 18){
            System.out.println("���������18�꣬Ҫ���Լ�����Ϊ�����������");
        }
        System.out.println("�������������");


    }
}
