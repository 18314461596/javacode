package com.zyy.chapter07;

public class VarScopeDetail {

    //��дһ��main����
    public static void main(String[] args){
        Person p1 = new Person();
        p1.say();

        /*
        �����������ڽϳ�,�����Ŷ���Ĵ���������,�����Ŷ�������ٶ�����
        �ֲ�����,�������ڽ϶�,���������Ĵ�����ִ�ж�����
        �����Ŵ����Ľ���������.����һ�η������ù�����
         */

        //p1.say(); ��ִ��say����ʱ,say�����ľֲ���������name���ᴴ��
        //��sayִ����Ϻ�
        //name �ֲ�����������,��������(ȫ�ֱ���)��Ȼ����ʹ��

        T t1 = new T();
        t1.test(); //��һ�ֿ�����ʶ������Եķ�ʽ

        t1.test2(p1); //�ڶ��ֿ�����ʶ������Եķ�ʽ









    }

    static class T{

        //ȫ�ֱ���/����:���Ա�����ʹ��,��������ʹ��(ͨ���������)
        public void test(){
            Person p1 = new Person();
            System.out.println(p1.name);
        }

        public void test2(Person p ) {
            //�����Person p �൱���Ѿ���test2������һ��Person��,]
            // �� Person p = new Person() �ȼ�
            System.out.println(p.name); //jack
        }

    }

    static class Person{
        //ϸ��: ���Կ��Լ����η�(public protected private...)
        //�ֲ��������ܼ����η�
        public int age = 20;

        String name = "jack";

        public void say(){
            //ϸ�� ���Ժ;ֲ�������������,����ʱ��ѭ�ͽ�ԭ��
            String name = "King";
            System.out.println("say() name = " + name);
        }

        public void hi(){
            String address = "����";
            //String address = "�Ϻ�"; �����ظ��������
            String name  = "hsp"; //����
        }
    }
}
