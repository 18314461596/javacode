package com.zyy.chapter04;

public class BitOperator02 {

    // ��дһ��main����
    public static void main(String[] args){
        System.out.println(1>>2); //0 1/2
        System.out.println(1<<2); //4 1*2*2
        System.out.println(4<<3); //  4*2*2*2 = 32
        System.out.println(15 >> 2); //15/2/2 = 3

        System.out.println(-10.4 % 3); // -1.4����ֵ
        int i = 66;
        System.out.println(++i+i); //134
     }
}
