package com.zyy.chapter04;

//��Ԫ�����ϸ��

public class TernaryOperatorDetail {

    //��дһ��main����
    public static void main(String[] args){
        //���ʽ1 �� ���ʽ2 ҪΪ���Ը������ܱ���������
        //(������Զ�ת��/����ǿ��ת��)
        int a = 3;
        int b = 8;
        int c = a > b ? (int) 1.1:(int) 3.4; //���Ե�
        double d = a > b ? a : b + 3; //���Եģ�����int -> double���Զ�ת��
    }
}
