package com.zyy.chapter06;

import java.util.Scanner;

public class SeqSearch {
    //��дһ��main����
    public static void main(String[] args) {
        /*
		��һ�����У���üӥ������ëʨ����������������������������Ϸ��
		�Ӽ�������������һ�����ƣ��ж��������Ƿ���������ơ�˳����ҡ�
		Ҫ��: ����ҵ��ˣ�����ʾ�ҵ����������±�ֵ

		˼·����
		1. ����һ���ַ�������
		2. �����û�����, �������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�
		 */

        //����һ���ַ�������
        String[] names = {"��üӥ��", "��ëʨ��", "��������", "��������"};
        Scanner myScanner = new Scanner(System.in);

        System.out.println("��������Ҫ���ҵ��Ĵ�boss����:");
        String findName = myScanner.next();

        //�������飬��һ�Ƚϣ�����У�����ʾ��Ϣ�����˳�

        int index = -1;
        for (int i = 0; i < names.length; i++) {
            if (findName.equals(names[i])) {
                System.out.println("�ҵ���");
                System.out.println("��������±�Ϊ" + i);
                System.out.println("ƥ�䵽��ֵ��" + names[i]);
                index = i;
                break;
            }


        }
        if (index == -1) {
            System.out.println("Sorry~,û���ҵ� " + findName);
        }
    }
}

