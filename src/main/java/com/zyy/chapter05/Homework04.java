package com.zyy.chapter05;

import java.util.Scanner;

public class Homework04 {
    //��дһ��main����
    public static void main(String[] args){
      /*
		4. �ж�һ�������Ƿ���ˮ�ɻ�������νˮ�ɻ�����ָһ��3λ����
		�����λ�����������͵����䱾��
		���磺 153 = 1*1*1 + 3*3*3 + 5*5*5

		˼·���� => ����. ����ʶ��..
		1. ���� int n = 153;
		2. �ȵõ� n�İ�λ��ʮλ ����λ������, ʹ�� if �ж����ǵ��������Ƿ����
		3. n�İ�λ = n / 100
		4. n��ʮλ = n % 100 / 10
		5. n�ĸ�λ = n % 10
		6. �жϼ���
		 */

        Scanner myScanner = new Scanner(System.in);
        System.out.println("������һ����λ���������������ж����Ƿ�Ϊˮ�ɻ���");
        int num = myScanner.nextInt();
        int num100 = num / 100;
        int num10 = (num % 100) / 10;
        int num1 = num / 10;
        if(num100*num100*num100 + num10*num10*num10 + num1*num1*num1 == num){
            System.out.println("�������ˮ�ɻ���");
        }else{
            System.out.println("���������ˮ�ɻ���");
        }
    }
}
