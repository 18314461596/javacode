package com.zyy.chapter07;

//����һ��Բ��Circle����������:�뾶,�ṩ��ʾԲ�ܳ����ܵķ���,�ṩ��ʾԲ����ķ���
public class Homework05 {
    public static void main(String[] args){
        Circle circle1 = new Circle(2);
        Circle circle2 = new Circle(4.5);

        Circle circle3 = new Circle(-3.2);

    }
}

class Circle{
    public double Circle_C(double R){
        double C = 0;
        if(R >= 0){
            C = 2 * 3.14 * R;
            System.out.println("�뾶Ϊ"+R+"��Բ,���ܳ�Ϊ"+C);
        }else{
            System.out.println("�����Բ�뾶Ӧ >=0");
        }
        return C;
    }

    public double Circle_S(double R){
        double S = 0 ;
        if(R >= 0){
            S = 3.14 * 1/2 * R * R;
            System.out.println("�뾶Ϊ"+R+"��Բ,�����Ϊ"+S);
        }else{
            System.out.println("�����Բ�뾶Ӧ >=0");
        }
        return S;
    }

    public Circle(double R){
        this.Circle_C(R);
        this.Circle_S(R);
    }

    Circle(){

    }


}
