package com.zyy.chapter04;

public class TernaryOperatorExercise {
    //��дһ��main����
    public static void main(String[] args){
        //������ʵ�������������ֵ
        int n1 = 553;
        int n2 = 33;
        int n3 = 123;
        // ˼·
        // 1.�ȵõ�n1��n2�е����ֵ�����浽max1
        // 2.Ȼ�������max1��n3�е����ֵ��������max2

        int  max1 = n1 > n2 ? n1:n2;
        int  max2 = max1 > n3 ? max1:n3;
        System.out.println( " ����� = " + max2);

        //ʹ��һ�����ʵ�֣��Ƽ�ʹ�����淽��
        // ��ʾ���������ǿ����ø��õķ�������������
        int max = (n1 > n2 ? n1:n2)>n3?(n1>n2?n1:n2):n3;
        System.out.println("����� = " + max);

        int abcclass = 10;
        int n = 40;
        int N = 50;
        System.out.println("n = " + n); //40
        System.out.println("N = " + N); //50

        //?abc �� aBcʱ������ͬ�ı���
        int abc = 100;
        int aBc = 200;

        int a , b = 300;
        //int a-b = 10;
        int goto1 = 10;




    }

}
