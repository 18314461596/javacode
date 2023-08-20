package com.zyy.chapter06;

import java.util.Scanner;

//实现动态的给数组添加元素的效果，实现数组扩容
public class ArrayAdd02 {
    //编写一个main方法
    public static void main(String[] args){
     /*
		要求：实现动态的给数组添加元素效果，实现对数组扩容。ArrayAdd.java
		1.原始数组使用静态分配 int[] arr = {1,2,3}
		2.增加的元素4，直接放在数组的最后 arr = {1,2,3,4}
		3.用户可以通过如下方法来决定是否继续添加，添加成功，是否继续？y/n

		思路分析
		1. 定义初始数组 int[] arr = {1,2,3}//下标0-2
		2. 定义一个新的数组 int[] arrNew = new int[arr.length+1];
		3. 遍历 arr 数组，依次将arr的元素拷贝到 arrNew数组
		4. 将 4 赋给 arrNew[arrNew.length - 1] = 4;把4赋给arrNew最后一个元素
		5. 让 arr 指向 arrNew ;  arr = arrNew; 那么 原来arr数组就被销毁
		6. 创建一个 Scanner可以接受用户输入
		7. 因为用户什么时候退出，不确定，老师使用 do-while + break来控制
		 */
        Scanner myScanner = new Scanner(System.in);
        //初始化数组
        int[] arr= {1,2,3};

        do{
            int[] arrNew = new int[arr.length + 1];
            //遍历arr的元素，都放到新的arrNew数组里
            for(int i = 0; i < arr.length; i++){
                arrNew[i] = arr[i];
            }
            //在arrNew的末尾放置用户输入的元素
            //判断用户是否输入了值，没输入则退出程序,如何判断用户是否输入了值？
            //不应该去判断是否输入了值，而应该询问用户是否还需要输入值
            System.out.println("请输入一个需要追加到arr数组的元素");
            int arraddnum = myScanner.nextInt();
            arrNew[arrNew.length - 1] = arraddnum;
            //将arr指向arrNew，实现原arr的扩容替换
            arr = arrNew;
            //将扩容后的arr循环打印
            for(int i = 0 ; i < arr.length; i++ ){
                System.out.println("扩容后的arr第"+(i+1)+"个元素为"+arr[i]);
            }
            //询问用户是否继续扩容数组
            System.out.println("是否继续添加 y/n");
            char key = myScanner.next().charAt(0);
            if (key == 'y'){
                continue;
            }else{
                break;
            }

        }while(true);









    }
}
