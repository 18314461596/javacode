package com.zyy.chapter06;

public class Homework04 {
    //编写一个Main方法
    public static void main(String[] args){
        /*
        已知有个升序的数组，要求插入一个元素，该数组顺序依然是升序，比如:
        [10,12,45,90].添加23后，数组为[10,12,23,45,90]

        思路：本质数组扩容 + 定位
        1. 我们先确定 添加书应该插入到哪个索引
        2. 然后扩容
         */

        //先定义原数组
        int[] arr = {10,12,23,45,90};
        int insertNum = 111;
        int index = -1; //index就是要插入的索引

        //遍历 arr数组， 如果发现 insertNum<=arr[i], 说明 i 就是要插入的位置
        // 问题来了： i之后的元素是每一个都要往后挪一位吗？
        //使用 index 保留 index = i;
        //如果遍历完后，没有发现 insertNum<=arr[i]， 说明 index = arr.length
        //即：添加到arr的最后

        for(int i = 0 ; i < arr.length; i++){
            if(insertNum <= arr[i]){
                index = i;
                break; //找到第一个满足条件的位置后，就立马退出
            }
        }

        //判断Index的值
        if(index == -1){
            //说明还没有找到位置
            index = arr.length; //即新增元素放到最后
        }

        // 扩容
        // 先创建一个新的数组,大小 arr.length + 1
        int[] arrNew = new int[arr.length + 1];
        // 下面将arr的元素拷贝到arrNew中，并且要跳过index的位置
        /*
        分析：
        int[] arr = {10,12,45,90}
        int[] arrNew = {          }
         */
        // i控制arrNew的下标，j用来控制arr数组的下标
        for(int i = 0,j = 0; i < arrNew.length;i++){
            if(i != index){ //通过这个判断逻辑，实现了index之后的arr元素的全部后移一位
                //说明可以把arr的元素拷贝到arrNew
                arrNew[i] = arr[j];
                j++; //这是在拿arr的元素下标
            }else{
                //i这个位置就是要插入的数
                arrNew[i] = insertNum;
            }
        }

        //让arr指向arrNew,原来的数组，就成为垃圾，被销毁
        arr = arrNew;

        System.out.println("===========插入后,arr数组的元素情况===========");
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i] + "\t");
        }



























    }
}
