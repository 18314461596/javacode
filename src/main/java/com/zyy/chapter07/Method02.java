package com.zyy.chapter07;

public class Method02 {
    //��дһ��main����
    public static void main(String[] args){
        //�����һ������,�������ĸ���Ԫ��ֵ
        int[][] map = {{0,0,0},{1,1,1},{1,1,3}};

        //ʹ�÷���������,����MyTools����
        MyTools tool = new MyTools();

        //��ͳ�Ľ���������Ǳ���
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
            //�Դ����map������б������
            for(int i = 0; i < map.length; i++){
                for(int j = 0; j < map[i].length; j++ ){
                    System.out.print(map[i][j] + " ");
                }
                System.out.println(); //����
            }
        }
    }
}


