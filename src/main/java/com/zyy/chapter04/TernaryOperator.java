package com.zyy.chapter04;

//��Ԫ�������ʹ��
public class TernaryOperator {
    //��дһ��Main����
    public static void main(String[] args){
        int a = 10;
        int b = 99;
        //���
        // 1. a > b Ϊfalse
        // 2. ���� b--,�ȷ���b��ֵ,Ȼ����b-1
        // 3. ���صĽ��Ϊ99
        int result = a > b ? a++:b--;
        System.out.println("result = " + result);
        System.out.println("a = " + a );
        System.out.println("b = " + b );
    }

}
