package com.zyy.chapter07;

public class Homework13 {

    //��дһ��main����
    public static void main(String[] args) {
        Circle c = new Circle();
        PassObject po = new PassObject();
        po.printAreas(c,5);

    }

    static class Circle {
        double radius; //�뾶

        public Circle(){ //�޲ι�����

        }

        public Circle(double radius){
            this.radius = radius;
        }

        public double findArea(){
            return Math.PI * radius * radius;
        }

        //��ӷ���setRadius,�޸Ķ���İ뾶ֵ
        public void setRadius(double radius){
            this.radius = radius;
        }

    }


    static class PassObject{
        public void printAreas(Circle c,int times){
            System.out.println("radius\tarea");
            for(int i = 1; i <= times; i++){
                //���1��times֮���ÿ�������뾶ֵ
                c.setRadius(i);//�޸�c����İ뾶ֵ
                System.out.println((double)i + "\t" + c.findArea());
            }
        }
    }
}