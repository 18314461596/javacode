package com.zyy.chapter07;

public class VarScope {

    //��дһ��main����
    public static void main(String[] args){

    }
}

class Cat{
    //ȫ�ֱ���: Ҳ��������,������Ϊ�������� Cat��: cry eat �ȷ���ʹ������
    //�����ڶ���ʱ,����ֱ�Ӹ�ֵ
    int age = 10; //ָ����ֵ�� 10

    //ȫ�ֱ���(����)���Բ���ֵ,ֱ��ʹ��,��Ϊ��Ĭ��ֵ
    double weight; //Ĭ��ֵ��0.0

    public void hi(){
        //�ֲ��������븳ֵ��,����ʹ��,��Ϊû��Ĭ��ֵ
        int num = 1;
        String address = "������è";
        System.out.println("num = " + num);
        System.out.println("address = " + address);
        System.out.println("weight = " + weight); //����
    }

    public void cry(){
        //1.�ֲ�����һ����ָ�ڳ�Ա�����ж���ı���
        //2.n �� name ���Ǿֲ�����
        //3.n �� name ����������cry������
        int n = 10;
        String name = "jack";
        System.out.println("��cry��ʹ������ age = " + age);

    }

    public void eat(){
        System.out.println("��eat��ʹ������ age = " + age);

        // System.out.println("��eat��ʹ��cry�ı��� name = " + name);
    }
}