package com.zyy.chapter03;

public class FloatDetail {
    //��дһ��main����
    public static void main(String[] args){
        //Java �ĸ����ͳ���������ֵ��Ĭ��Ϊdouble���ͣ�����flaot�ͳ���������'f'��'F'
        //float num1 = 1.1; //�Բ��ԣ�����
        float num2 = 1.1F; //�Ե�
        double num3 = 1.1; //�Ե�
        double num = 1.1f; //�Ե�
        // float num5 = 1.1; //����

        //ʮ��������ʽ����: 5.12  512.0f  .512 (������С����)
        double num5 = .123;  //�ȼ� 0.123
        System.out.println(num5);
        //��ѧ��������ʽ���� 5.12e2 [5.12 * 10��2�η�]  5.12E-2 [5.12 * 10�ĸ�2�η�]
        System.out.println(5.12e2); //512.0
        System.out.println(5.12E-2);//0.0512

        //ͨ������£�Ӧ��ʹ��double���ͣ���Ϊ����float�͸���ȷ��
        //[����˵��] double num9 = 2.1234567851;float num10 = 2.1234567851F;
        double num9 = 2.1234567851;
        float num10 = 200.1234567851F;//float���͵�С����С����ǰ���ܹ�ֻ�ܱ�����8λ��
        System.out.println(num9);
        System.out.println(num10);

        //������ʹ������:2.7 �� 8.1/3 �Ƚ�
        //����һ�δ���
        double num11 = 2.7;
        double num12 = 8.1/3;  //8.1/3; //2.7
        System.out.println(num11);//2.7
        System.out.println(num12);//�ӽ�2.7��һ��С����������2.7
        //java��8.1/3�������2.7���������޽ӽ�2.7��һ��С�����ɵײ�ԭ��������
        //�õ�һ����Ҫ��ʹ�õ㵱���Ƕ���������С���Ľ����ж����ʱ��ҪС��
        //Ӧ�������������Ĳ�ֵ�ľ���ֵ����ĳ�����ȷ�Χ���ж�
        if(num11 == num12){
            System.out.println("num11 == num12 ���");
        }
        //��ȷ��д����ctrl + / ע�Ϳ�ݼ����ٴ������ȡ��ע��
        if(Math.abs(num11 - num12)< 0.000001){
            System.out.println("��ֵ�ǳ�С�����ҵĹ涨���ȣ���Ϊ���...");
        }
        //����ͨ��java API ������һ����Ƶ�������ʹ��API
        System.out.println(Math.abs(num11 - num12));
        //ϸ�ڣ������ֱ�Ӳ�ѯ�õ���С�����߸�ֵ���ǿ����ж���ȵ�






    }
}