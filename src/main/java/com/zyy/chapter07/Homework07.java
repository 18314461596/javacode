package com.zyy.chapter07;


public class Homework07 {
    public static void main(String[] args){
        Dog dog1 = new Dog("哮天犬","白色",1092);
        System.out.println("======================");
        Dog dog2 = new Dog("田园土狗","棕红色",3);
    }
static class Dog{
        String name;
        String color;
        int age;

        public void show(){
            System.out.println("name = " + this.name);
            System.out.println("color = " + this.color);
            System.out.println("age = " + this.age);
        }

        //有参构造器
        public Dog(String name,String color,int age){
            this.name = name;
            this.color = color;
            this.age = age;
            this.show();
        }

        Dog(){

        }

    }
}


