package com.zyy.chapter05;

import java.util.Scanner;

public class If02 {
    //��дһ��main����
    public static void main(String[] args){


        Scanner myScanner = new Scanner(System.in);
        System.out.println("����������");
        //�����䱣�浽һ�������� int age
        int age= myScanner.nextInt();
        //ʹ��if - else �жϣ������Ӧ��Ϣ
        if(age > 18){
            System.out.println("����18�꣬��ն~");
        }else{
            //˫��֧
            System.out.println("�����䲻���ȷŹ���~");
        }
        System.out.println("�������������");
    }
}
