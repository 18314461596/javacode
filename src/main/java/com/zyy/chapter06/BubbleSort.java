package com.zyy.chapter06;

//冒泡排序算法
public class BubbleSort {
    //编写一个main方法
    public static void main(String[] args){
        //化繁为简，先死后活

        /*
			数组 [24,69,80,57,13]
			第1轮排序: 目标把最大数放在最后
			第1次比较[24,69,80,57,13]
			第2次比较[24,69,80,57,13]
			第3次比较[24,69,57,80,13]
			第4次比较[24,69,57,13,80]
			*/

        int[] arr = {24,69,80,57,13,-1,30,200,-110};
        int temp = 0; //用于辅助交换的变量

        // 将多轮排序使用外层循环包括起来即可
        // 先死后活 =》 4 就是arr.length - 1
        for(int i = 0; i < arr.length-1; i++){ //外层循环是4次
            for(int j = 0; j < arr.length - 1 - i; j++){//4次比较-3次-2次-1次
                //如果前面的数 > 后面的数，就交换
                if(arr[j] > arr[j + 1]){
                    temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
            System.out.println("\n==第"+(i+1)+"轮==");
            for(int j = 0; j < arr.length; j++){
                System.out.print(arr[j] + "\t");
            }
        }

//        for(int j = 0; j < 4; j++){ //4次比较
//            //如果前面的数 > 后面的数，就交换
//            if(arr[j] > arr[j+1]){
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }

//        System.out.println("==第一轮==");
//        for(int j = 0; j < arr.length; j++){
//            System.out.print(arr[j] + "\t");
//        }
//

        //第2轮排序：目标把第二大数放在倒数第二位置
        //第一次比较[24,69,57,13,80]
        //第二次比较[24,57,69,13,80]
        //第三次比较[24,57,13,69,80]

//        for(int j = 0; j < 3; j++){ //三次比较
//            //如果前面的数 > 后面的数，就交换
//            if (arr[j] > arr[j + 1]){
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//
//        }
//
//        System.out.println("\n==第2轮==");
//        for(int j = 0; j < arr.length; j++){
//            System.out.print(arr[j] + "\t");
//        }

        //第三轮排序：目标把第3大的数放在倒数第三位上
        //第1次比较[24,57,13,69,80]
        //第2次比较[24,13,57,69,80]

//        for (int j = 0; j < 2; j++){ //2次比较
//            //如果前面的数 > 后面的数，就交换
//            if(arr[j] > arr[j+1]){
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }

//        System.out.println("\n==第3轮==");
//        for(int j = 0; j < arr.length; j++){
//            System.out.print(arr[j] + "\t");
//        }

        /*
        第4轮排序：目标把第4大数放在倒数第4位置
        //第一次比较[13,24,57,69,80]
         */
//        for (int j = 0; j < 1; j++){  //1次比较
//            //如果前面的数 > 后面的数，就交换
//            if(arr[j] > arr[j + 1]){
//                temp = arr[j];
//                arr[j] = arr[j+1];
//                arr[j+1] = temp;
//            }
//        }


//        System.out.println("\n==第4轮==");
//        for(int j = 0; j < arr.length; j++){
//            System.out.println(arr[j] + "\t");
//        }
    }
}
