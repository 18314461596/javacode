package com.zyy.chapter07;

//����Music��,������������name������ʱ��times���ԣ����в���play����
//�ͷ��ر���������Ϣ�Ĺ��ܷ���getInfo

public class Homework09 {
    public static void main(String[] args){
        Music music1 = new Music("ҹ��","4 min 24 s");
        music1.getInfo();
        music1.play();

        System.out.println("=========================================");

        Music music2 = new Music("�����Ů��","4 min 53 s");
        music2.getInfo();
        music2.play();

    }
}
class Music{
    String name;
    String times;

    public void play(){
        System.out.println("~~~@##$$##@%@#%^");
    }

    public void getInfo(){
        System.out.println("���׸�� name : " + this.name);
        System.out.println("���׸�� times : " + this.times);
    }

    public Music(String name,String times){
        this.name = name;
        this.times = times;
    }

    Music(){

    }
}
