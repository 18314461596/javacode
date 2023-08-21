package com.zyy.chapter07;

public class MethodDetail {

    public static void main(String[] args){

        AA a = new AA();
        int[] res = a.getSumAndSub(1,4);
        System.out.println("和 = " + res[0]);
        System.out.println("差 = " + res[1]);

        //细节:调用带参数的方法时,一定对应着参数列表传入相同类型
        //或兼容类型的参数
        byte b1 = 1;
        byte b2 = 2;
        a.getSumAndSub(b1,b2); //byte -> int 类型自动转换
        a.getSumAndSub((int)1.1,(int)1.8); //double -> int 不能自动转换
        //细节:实参和形参的类型要一致或兼容,个数,顺序必须一致
        // getSumAndSub(int n1,int n2)  这就是形参
        // getSumAndSub((int)1.1,(int)1.8) 这就是实参
        //a.getSumAndSub(100); //参数个数不一致
        //a.f3(100,"jack"); //实际参数和形参的顺序不一致，也会报错
        a.f3("tom",10);
    }
}

class AA {
    //细节: 方法不能嵌套定义
    public void f4(){
        //错误
        //public void f5(){
        //}
    }

    public void f3(String str,int n){

    }

    //1. 一个方法最多有一个返回值[思考,如何返回多个结果？  返回数组就好了]
    public int[] getSumAndSub(int n1,int n2){
        int[] resArr = new int[2];
        resArr[0] = n1 + n2;
        resArr[1] = n1 - n2;
        return resArr;
    }

    //2.返回类型可以是任意类型,包含基本类型或引用类型(数组,对象)
    //  具体看getSumAndSub

    //3.如果方法要求有返回数据类型,则方法体中,最后的执行语句必须为return值
    //  而且要求返回值类型必须和return的值类型一致或兼容

    public double f1(){

        double d1 =  1.1 * 3;
        int n = 100;
        //return d1; //OK
        return n; //OK, int -> double
    }

    //如果方法是void，则方法体中可以没有return语句,或者只写return，表示跳出方法
    //老韩提示:在实际工作中,我们的方法都是为了完成某个功能,
    //所以方法名要有一定含义
    //最好要见名知意

    public void f2(){
        System.out.println("hello");//打印的值不算返回值
        //返回值只能通过return xxx来返回给方法
        System.out.println("hello1");
        System.out.println("hello2");
        int n = 10;
        //return n; //return n返回值给方法f2时，报错，因为void声明表示f2不接受返回值
        return; //return不报错，是因为return在此处表示跳出f2方法代码执行，并不是要返回值，所以无冲突，不报错
    }






}
