package com.zyy.chapter07;

//��̴���һ��cale�����࣬�����ж���2��������ʾ�����������������ĸ�����ʵ��
//�͡���ˡ���(Ҫ�����Ϊ0�Ļ�,Ҫ��ʾ) ��������������,�ֱ����

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
            System.out.println("��ĸ����Ϊ0,������������");
        }

        System.out.println(fenzi +" + " + fenmu + " = " + this.he(fenzi,fenmu));
        System.out.println(fenzi +" - " + fenmu + " = " + this.cha(fenzi,fenmu));
        System.out.println(fenzi +" * " + fenmu + " = " + this.ji(fenzi,fenmu));
        System.out.println(fenzi +" / " + fenmu + " = " + this.shang(fenzi,fenmu));
    }

    Cale(){

    }

}
