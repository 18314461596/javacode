package com.zyy.chapter07;

public class VarParameterExercise {
    //编写一个main方法
    public static void main(String[] args){
        ZyyMethod z1 = new ZyyMethod();
        System.out.println(z1.getNameAndGradeall("zyy",91,97,89));


    }
}

class ZyyMethod{
    public String[] getNameAndGradeall(String name,int... grades){
        String[] res = new String[2];
        res[0] = name;
        int gradesum = 0;
        for(int i = 0; i < grades.length; i++){
            gradesum += grades[i];
        }
        res[1] = ""+gradesum; //int 怎么转成 String ?
        //System.out.println(name+"的"+grades.length+"科总分是"+gradesum);
        return res;
    }
}
