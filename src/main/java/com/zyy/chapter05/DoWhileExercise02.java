package com.zyy.chapter05;

import java.util.Scanner;

public class DoWhileExercise02 {

    //��дһ��main����
    public static void main(String[] args){
        //�����������Ǯ�����Ϻ���һֱʹ�������ޣ�ֱ������˵��ǮΪֹ
        //[System.out.println("�Ϻ��ʣ���Ǯ�� y/n")] do...while..
        //
        //����Ϊ��
        //(1)��ͣ���� ����Ǯ�𣿡�
        //(2)ʹ��char answer ���ջش� y/n������һ��Scanner����
        //(3)��do-while��while�ж������y�Ͳ���ѭ��
        Scanner myScanner = new Scanner(System.in);
        do{
            System.out.println("��Ǯ�� ������y/n");
            char answer =  myScanner.next().charAt(0);
            if( 'y' == answer){
                break;
            }
            System.out.println("�Ϻ�ʹ������������~~~ ������");

        }while(true);
        System.out.println("���������Ϻ�Ǯ~~~");
    }
}
