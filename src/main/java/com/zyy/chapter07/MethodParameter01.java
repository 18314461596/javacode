package com.zyy.chapter07;

public class MethodParameter01 {

    //��дһ��main����
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        //����AA���� ���� obj
        AA obj = new AA();
        obj.swap(a,b);//����swap

        System.out.println("main������a = " + a + " b = " + b); //a = 10,b = 20
    }
    static class AA{
        public  void swap(int a,int b){
            System.out.println("\n a��b����ǰ��ֵ \n a = " + a
            + "\tb = " + b); // a = 10,b = 20
            int tmp = a;
            a = b;
            b = tmp;
            System.out.println("\n a��b�������ֵ \n a = " + a
            + "\tb = " + b); // a = 20,b = 10
        }
    }
}
