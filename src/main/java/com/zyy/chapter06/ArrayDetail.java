package com.zyy.chapter06;

public class ArrayDetail {
    //��дһ��main����
    public static void main(String[] args){
        //1.�����Ƕ����ͬ�������ݵ���ϣ�ʵ�ֶ���Щ���ݵ�ͳһ����

        //int[] arr1 = {1,2,3,60,"hello"}; //�����е���������Ҫһ�£�����Ҫ���Զ�ʵ����������ת��
        double[] arr2 = {1.1,2.2,3.3,60.6,100}; // int -> double

        //2. �����е�Ԫ�ؿ������κ��������ͣ������������ͺ��������ͣ����ǲ��ܻ���
        String[] arr3 = {"����","jack","milan"};

        //3. ���鴴�������û�и�ֵ����Ĭ��ֵ
        //   int 0;short 0; byte 0; long 0,
        //   float 0.0, double 0.0, char \u0000,
        //   boolean false, String null

        char[] arr4 = new char[3];
        System.out.println("====����arr4====");
        for(int i = 0; i < arr4.length; i++){
            System.out.println(arr4[i]);
        }

        // 6.�����±������ָ����Χ��ʹ�ã����� ���±�Խ���쳣��
        // ���磺
        //int[] arr = new int[5];  //����Ч�±�Ϊ 0 - 4
        //��������±�/���� ��СΪ0�����Ϊ���鳤�� -1 ��4��
        int[] arr = new int[5]; //5ָ���ǿ��Դ�5��Ԫ�أ������Ǵ�0��ʼ����
        System.out.println(arr[4]);
        //Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 5
    }
}
