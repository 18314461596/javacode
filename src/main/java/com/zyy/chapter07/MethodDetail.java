package com.zyy.chapter07;

public class MethodDetail {

    public static void main(String[] args){

        AA a = new AA();
        int[] res = a.getSumAndSub(1,4);
        System.out.println("�� = " + res[0]);
        System.out.println("�� = " + res[1]);

        //ϸ��:���ô������ķ���ʱ,һ����Ӧ�Ų����б�����ͬ����
        //��������͵Ĳ���
        byte b1 = 1;
        byte b2 = 2;
        a.getSumAndSub(b1,b2); //byte -> int �����Զ�ת��
        a.getSumAndSub((int)1.1,(int)1.8); //double -> int �����Զ�ת��
        //ϸ��:ʵ�κ��βε�����Ҫһ�»����,����,˳�����һ��
        // getSumAndSub(int n1,int n2)  ������β�
        // getSumAndSub((int)1.1,(int)1.8) �����ʵ��
        //a.getSumAndSub(100); //����������һ��
        //a.f3(100,"jack"); //ʵ�ʲ������βε�˳��һ�£�Ҳ�ᱨ��
        a.f3("tom",10);
    }
}

class AA {
    //ϸ��: ��������Ƕ�׶���
    public void f4(){
        //����
        //public void f5(){
        //}
    }

    public void f3(String str,int n){

    }

    //1. һ�����������һ������ֵ[˼��,��η��ض�������  ��������ͺ���]
    public int[] getSumAndSub(int n1,int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    //2.�������Ϳ�������������,�����������ͻ���������(����,����)
    //  ���忴getSumAndSub

    //3.�������Ҫ���з�����������,�򷽷�����,����ִ��������Ϊreturnֵ
    //  ����Ҫ�󷵻�ֵ���ͱ����return��ֵ����һ�»����

    public double f1(){

        double d1 =  1.1 * 3;
        int n = 100;
        //return d1; //OK
        return n; //OK, int -> double
    }

    //���������void���򷽷����п���û��return���,����ֻдreturn����ʾ��������
    //�Ϻ���ʾ:��ʵ�ʹ�����,���ǵķ�������Ϊ�����ĳ������,
    //���Է�����Ҫ��һ������
    //���Ҫ����֪��

    public void f2(){
        System.out.println("hello");//��ӡ��ֵ���㷵��ֵ
        //����ֵֻ��ͨ��return xxx�����ظ�����
        System.out.println("hello1");
        System.out.println("hello2");
        int n = 10;
        //return n; //return n����ֵ������f2ʱ��������Ϊvoid������ʾf2�����ܷ���ֵ
        return; //return����������Ϊreturn�ڴ˴���ʾ����f2��������ִ�У�������Ҫ����ֵ�������޳�ͻ��������
    }






}
