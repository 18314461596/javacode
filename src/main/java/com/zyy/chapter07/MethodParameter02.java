package com.zyy.chapter07;

public class MethodParameter02 {
    //编写一个main方法
    public static void main(String[] args){
        //测试
        B b = new B();

        int[] arr = {1,2,3};
        b.test100(arr); //调用方法
        System.out.println("main的arr数组");
        //遍历数组
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+"\t");
        }
        System.out.println();
        // arr的数据发生改变了，main方法中的引用类型属性可以被方法修改

        System.out.println("====测试二====");
        //测试
        Person p = new Person();
        p.name = "jack";
        p.age = 10;
        b.test200(p);
        System.out.println("main的p.age = " + p.age);
        // main方法中的基本类型属性无法被方法修改
    }

    static class Person{
        String name;
        int age;
    }

    static class B{
        public void test200(Person p){
            //p.age = 10000; //修改对象属性
            //思考
            p = new Person();
            p.name = "tom";
            p.age = 99;
            //思考
            p = null;
        }

        //B类中编写一个方法test100.
        //可以接收一个数组,在方法中修改该数组,看看原来的数组是否变化
        public void test100(int[] arr){
            arr[0] = 200; //修改元素
            //遍历数组
            System.out.println("test100的arr数组");
            for(int i = 0; i < arr.length; i++){
                System.out.print(arr[i] + "\t");
            }
            System.out.println();
        }
    }
}
