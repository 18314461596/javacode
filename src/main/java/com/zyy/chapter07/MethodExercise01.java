package com.zyy.chapter07;

public class MethodExercise01 {

    //1) ��д�� AA ����һ���������ж�һ���������� odd ����ż��, ���� boolean
    //2) �����С��С��ַ���ӡ ��Ӧ�������������ַ������磺�У�4���У�4���ַ�#,���ӡ��Ӧ��Ч��

    public static void main(String[] args) {
        AA a = new AA();
        a.odd(17);

        a.printchar(5,6,'$');

    }


    static class AA {
        public void odd(int n){
            if(n % 2 == 0 ){
                System.out.println( n + "�������ż��");
            }else{
                System.out.println( n + "�����������");
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