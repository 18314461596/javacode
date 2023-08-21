package com.zyy.chapter07;

public class Method02 {
    //编写一个main方法
    public static void main(String[] args){
        //请遍历一个数组,输出数组的各个元素值
        int[][] map = {{0,0,0},{1,1,1},{1,1,3}};

        //使用方法完成输出,创建MyTools对象
        MyTools tool = new MyTools();

        //传统的解决方法就是遍历
        for(int i = 0; i < map.length; i++){
            for(int j = 0; j < map[i].length; j++){
                System.out.print(map[i][j]+" ");
            }
            System.out.println();
        }



        tool.printArr(map);



    }
    static class MyTools{
        public void printArr(int[][] map){
            System.out.println("=========");
            //对传入的map数组进行遍历输出
            for(int i = 0; i < map.length; i++){
                for(int j = 0; j < map[i].length; j++ ){
                    System.out.print(map[i][j] + " ");
                }
                System.out.println(); //换行
            }
        }
    }
}


