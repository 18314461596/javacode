package com.zyy.chapter07;

//定义Music类,里面有音乐名name、音乐时长times属性，并有播放play功能
//和返回本身属性信息的功能方法getInfo

public class Homework09 {
    public static void main(String[] args){
        Music music1 = new Music("夜曲","4 min 24 s");
        music1.getInfo();
        music1.play();

        System.out.println("=========================================");

        Music music2 = new Music("天国的女儿","4 min 53 s");
        music2.getInfo();
        music2.play();

    }
}
class Music{
    String name;
    String times;

    public void play(){
        System.out.println("~~~@##$$##@%@#%^");
    }

    public void getInfo(){
        System.out.println("这首歌的 name : " + this.name);
        System.out.println("这首歌的 times : " + this.times);
    }

    public Music(String name,String times){
        this.name = name;
        this.times = times;
    }

    Music(){

    }
}
