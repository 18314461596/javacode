package com.zyy.chapter05;

import java.util.Scanner;

public class BreakExercise02 {
    //��дһ��main����
    public static void main(String[] args){
        //ʵ�ֵ�¼��֤����������֤���ᣬ����û���Ϊ�����桱�����롰666����ʾ��¼�ɹ�
        //������ʾ���м��λ���
        //
        //˼·����
        //1.����Scanner��������û�����
        //2.����String name;String passwd;�����û���������
        //3.���ѭ��3�Ρ���¼3�Ρ������������������ǰ�˳�
        //4.����һ�����int chance ��¼���м��ε�¼����
        //
        //����ʵ��
        Scanner myScanner = new Scanner(System.in);
        String name = "����";
        String passwd = "666";
        int chance = 3; //��¼һ�Σ�����һ��
        for(int i = 1; i <= 3; i++){
            System.out.println("����������");
            name = myScanner.next();
            System.out.println("����������");
            passwd = myScanner.next();
            //�Ƚ���������ֺ������Ƿ���ȷ
            //����˵���ַ��������� �Ƚ� ʹ�õķ���equals
            if("����".equals(name) && "666".equals(passwd)){
            //if(name == "����" && passwd == "666"){  �ַ����ж����ʱ������ʹ�� == ������Ч
            System.out.println("��ϲ�㣬��¼�ɹ�~");
            break;
            }else{
                chance--;
                System.out.println("�㻹��"+chance+"�ε�¼����");
            }



        }
    }
}
