package com.zyy.chapter05;

public class BreakExercise {
    //��дһ��main����
    public static void main(String[] args){

        // 1-100���ڵ�����ͣ�������͵�һ�δ���20�ĵ�ǰ����for + break��
        // ˼·����
        // 1.ѭ��1-100����� sum
        // 2.��sum > 20ʱ����¼�µ�ǰ����Ȼ��break
        // 3.��forѭ���ⲿ���������n,�ѵ�ǰi��ֵ��n
        int sum = 0; //�ۻ���

        // ע��i�����÷�Χ��for{}
        int n = 0;
        for(int i = 1;i <= 100;i++){
            sum += i; //�ۻ�
            System.out.println("i = "+i);
            System.out.println("sum = " + sum);
            if(sum > 20){
                System.out.println("��>20��ʱ�򣬵�ǰi="+i);
                n = i;
                break;
            }
        }
        System.out.println("��ǰ�� = " + n);
    }
}
