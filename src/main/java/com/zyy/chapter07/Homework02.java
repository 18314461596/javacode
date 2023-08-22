package com.zyy.chapter07;

//编写类A02,定义方法find，实现查找某字符串是否在字符串数组里,并返回索引
//如果找不到,则返回 -1
public class Homework02 {
    public static void main(String[] args){
        String[] strarr = {"三国演义","遮天","仙逆","凡人修仙传"};

        A02 a02 = new A02();
        System.out.println("strarr字符串数组的数据展示如下: =====");
        for(int i = 0 ; i < strarr.length; i++){
            System.out.print(strarr[i] + " ");

        }
        String findstr = "凡人修仙传";
        System.out.println("正在查找的字符串为: " + findstr);

        System.out.println("该字符串在字符串数组中的下标为 : " + a02.find(strarr,"凡人修仙传"));

    }
}

class A02{
    public int find(String[] strarr,String str) {
        int returnnum = -1;
        for (int i = 0; i < strarr.length; i++) {
            if (strarr[i].equals(str)) {
                returnnum =  i;
                break;
            }
        }
        return returnnum;
    }
}