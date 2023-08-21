package com.zyy.chapter07;

public class MethodExercise01 {

    //1) 编写类 AA ，有一个方法：判断一个数是奇数 odd 还是偶数, 返回 boolean
    //2) 根据行、列、字符打印 对应行数和列数的字符，比如：行：4，列：4，字符#,则打印相应的效果

    public static void main(String[] args) {
        AA a = new AA();
        a.odd(17);

        a.printchar(5,6,'$');

    }


    static class AA {
        public void odd(int n){
            if(n % 2 == 0 ){
                System.out.println( n + "这个数是偶数");
            }else{
                System.out.println( n + "这个数是奇数");
            }
        }

        public void printchar(int row,int col,char c){
            String res = "";
            for(int i = 0; i < row; i++){
                for(int j = 0; j < col; j++){
                    res =  res + c + "\t";
                }
                res = res + "\n";
            }

            System.out.print(res);
        }





    }
}