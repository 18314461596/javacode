package com.zyy.chapter07;

public class Constructor01 {
    //��дmain����
    public static void main(String[] args){
        //������new һ������ʱ,ֱ��ͨ��������ָ�����ֺ�����
        Person  p1 = new Person("Smith",80);
        System.out.println("p1����Ϣ����");
        System.out.println("p1���� name = " + p1.name); //smith
        System.out.println("p1���� age = " + p1.age); //80
    }

    static class Person{
        String name;
        int age;
        //������
        //�Ϻ����
        //1. ������û�з���ֵ,Ҳ����дvoid
        //2. �����������ƺ���Personһ��
        //3. (String pname,int pAge) �ǹ������β��б�,����ͳ�Ա����һ��
        public Person(String pName,int pAge){
            System.out.println("������������~~ ��ɶ�������Գ�ʼ��");
            name = pName;
            age = pAge;
        }
    }

}
