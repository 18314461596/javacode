package com.zyy.chapter05;

public class Homework01 {
    //��дһ��main����
    public static void main(String[] args){
      /*
		ĳ����100,000Ԫ,ÿ����һ��·�ڣ���Ҫ����,��������:
		1) ���ֽ�>50000ʱ,ÿ�ν�5%
		2) ���ֽ�<=50000ʱ,ÿ�ν�1000
		��̼�����˿��Ծ������ٴ�·��, Ҫ��: ʹ�� while + break��ʽ���

		˼·����
		1. ���� double money ���� 100000
		2. �������Ҫ�����Ƿ����������������
			money > 50000
			money >=1000 && money <= 50000
			money < 1000
		3. ʹ�ö��֧ if-elseif-else
		4. while+break[money < 1000], ͬʱʹ��һ������count������ͨ��·��
		����ʵ��
		 */
        double money = 100000; //���ж���Ǯ
        int count = 0 ;//�ۻ��������ٸ�·��
        while(true){
            if(money > 50000){
                //money = money - money * 0.05
                money *= 0.95;  //���˱���·�ڣ���ʣ���Ǯ
                count++;  //·���� +1
                System.out.println("���˵� " + count +" ��·�ں󣬻�ʣ�� " + money);
            }else if(money >= 1000 ){
                money -= 1000;
                count++;
                System.out.println("���˵� " + count +" ��·�ں󣬻�ʣ�� " + money);
            }else{ //Ǯ����1000
                break;
            }
        }
        System.out.println("100000 ���Թ� " + count + " ��·�ڡ�����");
    }
}
