package com.zyy.chapter07;

public class ConstructorExercise {

    /*
    在前面定义的 Person 类中添加两个构造器：
    第一个无参构造器：利用构造器设置所有人的 age 属性初始值都为 18
    第二个带 pName 和 pAge 两个参数的构造器：使得每次创建 Person 对象的同时初始化对象的 age 属性值和 name 属性值。
    分别使用不同的构造器，创建对象
     */

    //编写一个Main方法
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
