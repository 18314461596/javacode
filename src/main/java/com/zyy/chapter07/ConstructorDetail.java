package com.zyy.chapter07;

public class ConstructorDetail {
    //��дһ��Main����
    public static void main(String[] args){

        Dog dog1 = new Dog();

        Person p1 = new Person("King",40);
        Person p2 = new Person("Tom");

    }

    static class Dog{
        //�������Աû�ж��幹����,ϵͳ���Զ���������һ��Ĭ���޲ι�����(Ҳ��Ĭ�Ϲ�����)
        //ʹ��javapָ��,�����뿴��
        /*
            Ĭ�Ϲ�����
            Dog(){

            }
         */
        //һ���������Լ��Ĺ�����,Ĭ�ϵĹ������͸�����,�Ͳ�����ʹ��Ĭ�ϵ��޲ι�����
        //������ʾ�Ķ���һ��,��: Dog(){} д(��һ�����Ҫ)
        Dog() {

        }

        public Dog(String dName){

        }


    }

    static class Person{
        String name ;
        int age ;
        public Person(String pName,int pAge){
            name = pName;
            age = pAge;
        }
        //��2��������,ָֻ������,����Ҫָ������
        public Person(String pName){
            name = pName;
        }

    }

}