package com.zyy.chapter07;

public class VarParameterDetail {
    //��дһ��Main����
    public static void main(String[] args){
        //ϸ��:�ɱ������ʵ�ο���������
        int[] arr = {1,2,3};
        T t1 = new T();
        t1.f1(arr);

    }


static class T {
        // int... �� int[] �ȼ�
        public void f1(int... nums){
            System.out.println("���� = " + nums.length);
        }

        //ϸ��: �ɱ�������Ժ���ͨ���͵Ĳ���һ������β��б�,�����뱣֤�ɱ���������
        public void f2(String str,double... nums){

        }

        //ϸ��: һ���β��б���ֻ�ܳ���һ���ɱ����
        //�����д���Ǵ��

        //public void f3(int... nums1,double... nums2){
        //     }
    }
}

