package com.zyy.chapter06;

import java.util.Scanner;

//ʵ�ֶ�̬�ĸ��������Ԫ�ص�Ч����ʵ����������
public class ArrayAdd02 {
    //��дһ��main����
    public static void main(String[] args){
     /*
		Ҫ��ʵ�ֶ�̬�ĸ��������Ԫ��Ч����ʵ�ֶ��������ݡ�ArrayAdd.java
		1.ԭʼ����ʹ�þ�̬���� int[] arr = {1,2,3}
		2.���ӵ�Ԫ��4��ֱ�ӷ����������� arr = {1,2,3,4}
		3.�û�����ͨ�����·����������Ƿ������ӣ���ӳɹ����Ƿ������y/n

		˼·����
		1. �����ʼ���� int[] arr = {1,2,3}//�±�0-2
		2. ����һ���µ����� int[] arrNew = new int[arr.length+1];
		3. ���� arr ���飬���ν�arr��Ԫ�ؿ����� arrNew����
		4. �� 4 ���� arrNew[arrNew.length - 1] = 4;��4����arrNew���һ��Ԫ��
		5. �� arr ָ�� arrNew ;  arr = arrNew; ��ô ԭ��arr����ͱ�����
		6. ����һ�� Scanner���Խ����û�����
		7. ��Ϊ�û�ʲôʱ���˳�����ȷ������ʦʹ�� do-while + break������
		 */
        Scanner myScanner = new Scanner(System.in);
        //��ʼ������
        int[] arr= {1,2,3};

        do{
            int[] arrNew = new int[arr.length + 1];
            //����arr��Ԫ�أ����ŵ��µ�arrNew������
            for(int i = 0; i < arr.length; i++){
                arrNew[i] = arr[i];
            }
            //��arrNew��ĩβ�����û������Ԫ��
            //�ж��û��Ƿ�������ֵ��û�������˳�����,����ж��û��Ƿ�������ֵ��
            //��Ӧ��ȥ�ж��Ƿ�������ֵ����Ӧ��ѯ���û��Ƿ���Ҫ����ֵ
            System.out.println("������һ����Ҫ׷�ӵ�arr�����Ԫ��");
            int arraddnum = myScanner.nextInt();
            arrNew[arrNew.length - 1] = arraddnum;
            //��arrָ��arrNew��ʵ��ԭarr�������滻
            arr = arrNew;
            //�����ݺ��arrѭ����ӡ
            for(int i = 0 ; i < arr.length; i++ ){
                System.out.println("���ݺ��arr��"+(i+1)+"��Ԫ��Ϊ"+arr[i]);
            }
            //ѯ���û��Ƿ������������
            System.out.println("�Ƿ������� y/n");
            char key = myScanner.next().charAt(0);
            if (key == 'y'){
                continue;
            }else{
                break;
            }

        }while(true);









    }
}
