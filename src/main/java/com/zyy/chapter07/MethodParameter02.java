package com.zyy.chapter07;

public class MethodParameter02 {
    //��дһ��main����
    public static void main(String[] args){
        //����
        B b = new B();

        int[] arr = {1,2,3};
        b.test100(arr); //���÷���
        System.out.println("main��arr����");
        //��������
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        // arr�����ݷ����ı��ˣ�main�����е������������Կ��Ա������޸�

        System.out.println("====���Զ�====");
        //����
        Person p = new Person();
        p.name = "jack";
        p.age = 10;
        b.test200(p);
        System.out.println("main��p.age = " + p.age);
        // main�����еĻ������������޷��������޸�
    }

    static class Person{
        String name;
        int age;
    }

    static class B{
        public void test200(Person p){
            //p.age = 10000; //�޸Ķ�������
            //˼��
            p = new Person();
            p.name = "tom";
            p.age = 99;
            //˼��
            p = null;
        }

        //B���б�дһ������test100.
        //���Խ���һ������,�ڷ������޸ĸ�����,����ԭ���������Ƿ�仯
        public void test100(int[] arr){
            arr[0] = 200; //�޸�Ԫ��
            //��������
            System.out.println("test100��arr����");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    }
}
