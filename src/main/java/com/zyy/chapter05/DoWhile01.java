package com.zyy.chapter05;

public class DoWhile01 {

    //��дһ��Main����
    public static void main(String[] args){
        //���10�� ��ã���˳ƽ����
        int i = 1; //ѭ��������ʼ��
        do{
            //ѭ��ִ�����
            System.out.println("��ã���˳ƽ����" + i);
            //ѭ����������
            i++;
        }while( i <= 10);

        System.out.println("�˳� do..while ����ִ��.." + i);//11
    }
}
