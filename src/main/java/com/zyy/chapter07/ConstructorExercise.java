package com.zyy.chapter07;

public class ConstructorExercise {

    /*
    ��ǰ�涨��� Person �������������������
    ��һ���޲ι����������ù��������������˵� age ���Գ�ʼֵ��Ϊ 18
    �ڶ����� pName �� pAge ���������Ĺ�������ʹ��ÿ�δ��� Person �����ͬʱ��ʼ������� age ����ֵ�� name ����ֵ��
    �ֱ�ʹ�ò�ͬ�Ĺ���������������
     */

    //��дһ��Main����
    public static void main(String[] args){
        Person p1 = new Person();
        System.out.println("p1.name = " + p1.name + " p1.age = " + p1.age);

        Person p2 = new Person("Zyy",27);
        System.out.println("p2.name = " + p2.name + " p2.age = " + p2.age);
    }
    static class Person{
        String name ;
        int age ;
        public Person(){
            age = 18;
        }
        public Person(String pName,int pAge){
            name = pName;
            age = pAge;
        }


    }
}
