package com.zyy.chapter02;

//����java�Ŀ������ţ���ʾjava�Ŀ�������
//�Դ�������˵��
//1.public class Hello ��ʾHello��һ���࣬��һ��public���е���
//2.Hello{} ��ʾһ����Ŀ�ʼ�ͽ���
//3.public static void main(String[] args) ��ʾһ��������������������
//4.main() {} ��ʾ�����Ŀ�ʼ�ͽ���
//5.System.out.println("hello,world ~ ");��ʾ���"hello , world ~"����Ļ
//6.;��ʾ������

public class Hello {
    //��дһ��main����
    public static void main(String[] args) {
        System.out.println("��˳ƽ���� hello world~");
    }
}
    //һ��Դ�ļ������ֻ����һ��public�࣬������ĸ������ޡ�����ʾ��
    //Dog��һ����
    //�����ÿһ���࣬������һ��.class

class Dog{
        //һ��Դ�ļ������ֻ����һ��public�ࡣ������ĸ������ޣ�Ҳ���Խ�main����д�ڷ�public����
        //Ȼ��ָ�����з�public�࣬������ڷ������Ƿ�public��main����
        public static void main(String[] args){
            System.out.println("hello ,С����~");
        }
    }

class  Tiger{
    public static void main(String[] args){System.out.println("hello,С�ϻ�~");}
}


