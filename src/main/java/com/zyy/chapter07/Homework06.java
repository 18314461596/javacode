package com.zyy.chapter07;

//编程创建一个cale计算类，在其中定义2个变量表示两个操作数，定义四个方法实现
//和、差、乘、商(要求除数为0的话,要提示) 并创建两个对象,分别测试

public class Homework06 {

    public static void main(String[] args){
        Cale cale1 = new Cale(9.7,4.3);
        Cale cale2 = new Cale(6.5,7.2);

    }
}

class Cale{
    double fenzi ;
    double fenmu ;

    public double he(double num1,double num2){
        return num1 + num2;
    }

    public double cha(double num1,double num2){
        return num1 - num2;
    }

    public double ji(double num1,double num2){
        return num1 * num2;
    }

    public double shang(double num1,double num2){
        return num1 / num2;
    }

    public Cale(double fenzi,double fenmu){
        if(fenmu == 0 ){
            System.out.println("分母不能为0,数据输入有误");
        }

        System.out.println(fenzi +" + " + fenmu + " = " + this.he(fenzi,fenmu));
        System.out.println(fenzi +" - " + fenmu + " = " + this.cha(fenzi,fenmu));
        System.out.println(fenzi +" * " + fenmu + " = " + this.ji(fenzi,fenmu));
        System.out.println(fenzi +" / " + fenmu + " = " + this.shang(fenzi,fenmu));
    }

    Cale(){

    }

}
