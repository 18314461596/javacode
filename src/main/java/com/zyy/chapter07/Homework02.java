package com.zyy.chapter07;

//��д��A02,���巽��find��ʵ�ֲ���ĳ�ַ����Ƿ����ַ���������,����������
//����Ҳ���,�򷵻� -1
public class Homework02 {
    public static void main(String[] args){
        String[] strarr = {"��������","����","����","�������ɴ�"};

        A02 a02 = new A02();
        System.out.println("strarr�ַ������������չʾ����: =====");
        for(int i = 0 ; i < strarr.length; i++){
            System.out.print(strarr[i] + " ");

        }
        String findstr = "�������ɴ�";
        System.out.println("���ڲ��ҵ��ַ���Ϊ: " + findstr);

        System.out.println("���ַ������ַ��������е��±�Ϊ : " + a02.find(strarr,"�������ɴ�"));

    }
}

class A02{
    public int find(String[] strarr,String str) {
        int returnnum = -1;
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].equals(str)) {
                returnnum =  i;
                break;
            }
        }
        return returnnum;
    }
}