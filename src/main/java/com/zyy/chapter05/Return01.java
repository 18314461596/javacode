package com.zyy.chapter05;

public class Return01 {

    //��дmain����
    public static void main(String[] args){

        for (int i = 1; i <= 5; i++ ){
            if( i == 3){
                System.out.println("��˳ƽ���� " + i);
                return; //��return����ʱ����ʾ�������������ʹ����main����ʾ�˳�����
            }
            System.out.println("Hello World ~");
        }
        System.out.println("go on ..");
    }
}
