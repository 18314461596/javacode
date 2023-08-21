package com.zyy.chapter07;

public class VarParameter01 {
    //编写一个main方法
    public static void main(String[] args){

        HspMethod m = new HspMethod();
        System.out.println(m.sum(1,5,100));
        System.out.println(m.sum(1,19));
    }
}

class HspMethod{
    //可以计算两个数的和，三个数的和，4，5.。。。
    //可以使用方法重载
//    public int sum(int n1,int n2){
//        return n1 + n2;
//    }
//
//    public int sum(int n1,int n2,int n3){
//        return n1 + n2 + n3;
//    }
//    ...
    //上述方法名称相同,功能相同,参数个数不同,可以使用·可变参数·进行优化
    //老韩解读
    //1. int... 表示接受的是可变参数,类型是int，即可以接收多个int(0 - 多)
    //2. 使用可变参数时,可以当做数组来使用 即 nums 可以当作数组
    //3. 遍历 nums 求和即可
    public int sum(int... nums){
        System.out.println("接收的参数个数 = " + nums.length);
        int res = 0;
        for(int i = 0; i < nums.length; i++){
            res += nums[i];
        }
        return res;
    }
}