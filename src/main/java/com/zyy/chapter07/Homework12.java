package com.zyy.chapter07;

//����һ��Employee��.������(����,�Ա�,����,ְλ,нˮ),�ṩ3�����췽��
//���Գ�ʼ��
//(1) (����,�Ա�,����,ְλ,нˮ)
//(2) (����,�Ա�,����)
//(3) (ְλ,нˮ)
//Ҫ���ָ��ù�����

public class Homework12 {
    public static void main(String[] args){
        Employee emp1 = new Employee("ZYY","MAN",27,"Big-Data Enginner",18000);
        Employee emp2 = new Employee("ZhangYanyin","Man",27);
        Employee emp3 = new Employee("Big-Data Engineer",18000);
}
static class Employee {
    String name; //����
    String sex; //�Ա�
    int age; //����
    String job; //ְλ
    double sal; //нˮ

    Employee() { //�ղι�����

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