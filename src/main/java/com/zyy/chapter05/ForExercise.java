package com.zyy.chapter05;

public class ForExercise {

    // ��дһ��main����
    public static void main(String[] args){
        //��ӡ1~100֮��������9�ı�����������ͳ�Ƹ������ܺ͡�������Ϊ��������
        //�Ϻ����������˼�루���ɣ�
        //1.����Ϊ�򣺼������ӵ����󣬲��ɼ򵥵����������
        //2.�������ȿ��ǹ̶���ֵ��Ȼ��ת�ɿ������仯��ֵ
        //
        //˼·����
        //��ӡ1~100֮��������9�ı�����������ͳ�Ƹ������ܺ�
        //����Ϊ��
        //(1) ������ 1-100��ֵ
        //(2) ������Ĺ����У����й��ˣ�ֻ���9�ı��� i % 9 == 0 ;
        //(3) ͳ�Ƹ��� ����һ������int count = 0; ����������ʱ count++;
        //(4) �ܺͣ�����һ������int sum = 0; ����������ʱ�ۻ�sum += i;
        //�������
        //(1) Ϊ����Ӧ���õ����󣬰ѷ�Χ�Ŀ�ʼֵ�ͽ���ֵ���ɱ���
        //(2) �����Խ�һ��9�ı���Ҳ���ɱ��� int t = 9;

        int t = 9;
        int starti = 1;
        int endi = 100;
        int count = 0;
        int sum = 0;
        for( int i = starti; i <= endi ; i++){
            if(i % t == 0){
                count++;
                sum += i;
                System.out.println("count"+count+" i= "+i+" sum= "+sum);
            }
        }
        System.out.println("count = " + count + " sum = " + sum);


    }

}
