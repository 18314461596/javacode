package com.zyy.chapter07;

//创建一个Employee类.属性有(名字,性别,年龄,职位,薪水),提供3个构造方法
//可以初始化
//(1) (名字,性别,年龄,职位,薪水)
//(2) (名字,性别,年龄)
//(3) (职位,薪水)
//要求充分复用构造器

public class Homework12 {
    public static void main(String[] args){
        Employee emp1 = new Employee("ZYY","MAN",27,"Big-Data Enginner",18000);
        Employee emp2 = new Employee("ZhangYanyin","Man",27);
        Employee emp3 = new Employee("Big-Data Engineer",18000);
}
static class Employee {
    String name; //名字
    String sex; //性别
    int age; //年龄
    String job; //职位
    double sal; //薪水

    Employee() { //空参构造器

    }

    public Employee(String name, String sex, int age, String job,double sal) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.job = job;
        this.sal = sal;
    }

    public Employee(String name, String sex, int age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }

    public Employee(String job, double sal) {
        this.job = job;
        this.sal = sal;
        }
    }

}