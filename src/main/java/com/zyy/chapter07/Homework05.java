package com.zyy.chapter07;

//定义一个圆类Circle，定义属性:半径,提供显示圆周长功能的方法,提供显示圆面积的方法
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
            System.out.println("半径为"+R+"的圆,其周长为"+C);
        }else{
            System.out.println("输入的圆半径应 >=0");
        }
        return C;
    }

    public double Circle_S(double R){
        double S = 0 ;
        if(R >= 0){
            S = 3.14 * 1/2 * R * R;
            System.out.println("半径为"+R+"的圆,其面积为"+S);
        }else{
            System.out.println("输入的圆半径应 >=0");
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
