package com.zyy.chapter07;

public class OverLoad01 {

    //��дһ��main����
    public static void main(String[] args){

        System.out.println(100);
        System.out.println("hello,World");
        System.out.println('h');
        System.out.println(1.1);
        System.out.println(true);

        MyCalculator mc = new MyCalculator();
        System.out.println(mc.calculate(1,2));
        System.out.println(mc.calculate(1.1,2));
        System.out.println(mc.calculate(1,2.1));
        System.out.println(mc.calculate(1,2,3));
        //���ݴ���Ĳ����б�,���Զ�ʶ��ƥ�����Ҫ������ط���
    }
}

class MyCalculator {
    // ������ĸ� calculate ��������������
    // ���������ĺ�
    public int calculate(int n1,int n2){
        System.out.println("calculate(int n1,int n2) ������");
        return n1 + n2;
    }

    //û�й��ɷ�������,��Ȼ�Ǵ����,��Ϊ�Ƿ������ظ�����  (�������޷���ֵ�����ܹ��ɷ�������)
    // public void calculate(int n1,int n2){
    //    System.out.println("calculate(int n1,int n2)������");
    //    int res = n1 + n2;
    // }

    //���������Ƿ񹹳�����,û�й���,���Ƿ������ظ�����,�ʹ���
    // public int calculate(int a1,int a2){
    //    System.out.println("calculate(int n1,int n2)������");
    //    return a1+a2;
    // }

    //һ������,һ��double�ĺ�  �����б�ı䣬���Թ��ɷ�������
    public double calculate(int n1,double n2){
        System.out.println("calculate(int n1,double n2)������..");
        return n1 + n2;
    }

    // �����б�˳�����ı䣬���Թ��ɷ�������
    public double calculate(double n1,int n2){
        System.out.println("calculate(double n1,int n2)������..");
        return n1+n2;
    }

    // ����int�ĺ�
    public int calculate(int n1,int n2,int n3){
        System.out.println("calculate(int n1,int n2,int n3)������..");
        return n1 + n2 + n3;
    }

}
