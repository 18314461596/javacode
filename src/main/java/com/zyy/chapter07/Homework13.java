package com.zyy.chapter07;

public class Homework13 {

    //编写一个main方法
    public static void main(String[] args) {
        Circle c = new Circle();
        PassObject po = new PassObject();
        po.printAreas(c,5);

    }

    static class Circle {
        double radius; //半径

        public Circle(){ //无参构造器

        }

        public Circle(double radius){
            this.radius = radius;
        }

        public double findArea(){
            return Math.PI * radius * radius;
        }

        //添加方法setRadius,修改对象的半径值
        public void setRadius(double radius){
            this.radius = radius;
        }

    }


    static class PassObject{
        public void printAreas(Circle c,int times){
            System.out.println("radius\tarea");
            for(int i = 1; i <= times; i++){
                //输出1到times之间的每个整数半径值
                c.setRadius(i);//修改c对象的半径值
                System.out.println((double)i + "\t" + c.findArea());
            }
        }
    }
}