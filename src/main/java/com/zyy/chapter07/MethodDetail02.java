package com.zyy.chapter07;

public class MethodDetail02 {

    // ��дһ��Main����
    public static void main(String[] args){
        A a = new A();
        a.sayOk();

        a.m1();
    }
}
class A{
    //ͬһ�����еķ�������: ֱ�ӵ��ü���

    public void print(int n){
        System.out.println("print()���������� n = " + n);
    }

    public void sayOk(){ //sayOk���� print(ֱ�ӵ��ü���)
        print(10);
        System.out.println("����ִ��sayOk()~~~");
    }


    public void m1(){
        //����B����,Ȼ���ٵ��÷�������
        System.out.println("m1()����������");
        B b = new B();
        b.hi();

        System.out.println("m1() ����ִ��:");
    }
}

class B {
    public void hi(){
        System.out.println("B���е� hi()����������");
    }
}
