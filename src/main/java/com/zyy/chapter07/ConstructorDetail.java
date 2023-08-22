package com.zyy.chapter07;

public class ConstructorDetail {
    //编写一个Main方法
    public static void main(String[] args){

        Dog dog1 = new Dog();

        Person p1 = new Person("King",40);
        Person p2 = new Person("Tom");

    }

    static class Dog{
        //如果程序员没有定义构造器,系统会自动给类生成一个默认无参构造器(也叫默认构造器)
        //使用javap指令,反编译看看
        /*
            默认构造器
            Dog(){

            }
         */
        //一旦定义了自己的构造器,默认的构造器就覆盖了,就不能再使用默认的无参构造器
        //除非显示的定义一下,即: Dog(){} 写(这一点很重要)
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
        //第2个构造器,只指定人名,不需要指定年龄
        public Person(String pName){
            name = pName;
        }

    }

}
