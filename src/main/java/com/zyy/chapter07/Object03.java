package com.zyy.chapter07;

public class Object03 {
     //编写一个main方法
    public static void main(String[] args){

        Person p1 = new Person();
        p1.age = 10;
        p1.name = "小明";
        Person p2 = p1; //把p1赋给p2，让p2指向p1
        System.out.println(p2.age); //10
    }

static class Person{
        String name;
        int age;
    }
}