package com.zyy.chapter06;

public class Homework04 {
    //��дһ��Main����
    public static void main(String[] args){
        /*
        ��֪�и���������飬Ҫ�����һ��Ԫ�أ�������˳����Ȼ�����򣬱���:
        [10,12,45,90].���23������Ϊ[10,12,23,45,90]

        ˼·�������������� + ��λ
        1. ������ȷ�� �����Ӧ�ò��뵽�ĸ�����
        2. Ȼ������
         */

        //�ȶ���ԭ����
        int[] arr = {10,12,23,45,90};
        int insertNum = 111;
        int index = -1; //index����Ҫ���������

        //���� arr���飬 ������� insertNum<=arr[i], ˵�� i ����Ҫ�����λ��
        // �������ˣ� i֮���Ԫ����ÿһ����Ҫ����Ųһλ��
        //ʹ�� index ���� index = i;
        //����������û�з��� insertNum<=arr[i]�� ˵�� index = arr.length
        //������ӵ�arr�����

        for(int i = 0 ; i < arr.length; i++){
            if(insertNum <= arr[i]){
                index = i;
                break; //�ҵ���һ������������λ�ú󣬾������˳�
            }
        }

        //�ж�Index��ֵ
        if(index == -1){
            //˵����û���ҵ�λ��
            index = arr.length; //������Ԫ�طŵ����
        }

        // ����
        // �ȴ���һ���µ�����,��С arr.length + 1
        int[] arrNew = new int[arr.length + 1];
        // ���潫arr��Ԫ�ؿ�����arrNew�У�����Ҫ����index��λ��
        /*
        ������
        int[] arr = {10,12,45,90}
        int[] arrNew = {          }
         */
        // i����arrNew���±꣬j��������arr������±�
        for(int i = 0,j = 0; i < arrNew.length;i++){
            if(i != index){ //ͨ������ж��߼���ʵ����index֮���arrԪ�ص�ȫ������һλ
                //˵�����԰�arr��Ԫ�ؿ�����arrNew
                arrNew[i] = arr[j];
                j++; //��������arr��Ԫ���±�
            }else{
                //i���λ�þ���Ҫ�������
                arrNew[i] = insertNum;
            }
        }

        //��arrָ��arrNew,ԭ�������飬�ͳ�Ϊ������������
        arr = arrNew;

        System.out.println("===========�����,arr�����Ԫ�����===========");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
        }



























    }
}
