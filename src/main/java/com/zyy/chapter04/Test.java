package com.zyy.chapter04;

//��֤

public class Test {
    //��дһ��Main����
    public static void main(String[] args){
        //int x = 5;
        //int y = 5;
        //if(x++==6 & ++y == 6){ //�߼���
        //    x = 11;
        //}
        //System.out.println("x = " + x +",y = " + y);


        //if(x++==6 && ++y == 6 ){ //��·��
        //    x = 11;
        //}
        //System.out.println("x="+x+",y="+y);

        //int x = 5,y = 5;
        //if(x++ == 5 | ++y == 5){
        //    x = 11;
        //}
        //System.out.println("x = " + x + ",y = " + y);

        //int x = 5,y = 5;
        //if(x++==5|| ++y==5){
        //    x = 11;
        //}
        //System.out.println("x = " + x + ",y = " + y);


        boolean x = true;
        boolean y = false;
        short z = 46;
        if((z++ == 46) && (y=true)) {  //z=47
            z++;
        };
        if((x == false) ||(++z == 49)) {  //48
            z++;
        };
        System.out.println("z = " + z);






















    }

}
