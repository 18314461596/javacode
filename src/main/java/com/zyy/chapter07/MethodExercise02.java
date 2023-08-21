package com.zyy.chapter07;

public class MethodExercise02 {
    // 1) ��д�� MyTools �࣬��дһ���������Դ�ӡ��ά��������ݡ�
    // 2) ��дһ������ copyPerson�����Ը���һ�� Person ���󣬷��ظ��ƵĶ��󡣿�¡���� ע��Ҫ��õ��¶����ԭ����
    //    ���������������Ķ���ֻ�����ǵ�������ͬ

    // ��дһ��Main����
    public static void main(String[] args){
        Person p = new Person();
        p.name = "milan";
        p.age = 100;
        //����tools
        MyTools tools = new MyTools();
        Person p2 = tools.copyPerson(p);

        //���� p �� p2��Person����,���������������Ķ���,������ͬ
        System.out.println("p������ age = " + p.age + " ���� = " + p.name);
        System.out.println("p2������ age = " + p2.age + " ���� = " + p2.name);
        //������ʦ��ʾ: ����ͬ����ȽϿ����Ƿ�Ϊͬһ������
        System.out.println( p == p2); //false





    }

static class Person{
        String name;
        int age;
}
static class MyTools{
    //��дһ������copyPerson,���Ը���һ��Person���󣬷��ظ��ƵĶ���,��¡����
    //ע��Ҫ��õ��¶����ԭ���Ķ��������������Ķ���,ֻ�����ǵ�������ͬ
    //
    //��д������˼·
    //1.�����ķ������� Person
    //2.���������� copyPerson
    //3.�������β�(Person p)
    //4.������,����һ���¶���,����������,���ؼ���

    public Person copyPerson(Person p){
        Person p2 = new Person();
        p2.name = p.name ;//��ԭ����������ָ�ֵ��p2.name
        p2.age = p.age; //��ԭ����������丳ֵ��p2.age
        return p2;
        }
    }
}