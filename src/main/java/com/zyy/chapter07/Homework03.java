package com.zyy.chapter07;

//编写类Book,定义方法updatePrice，实现更改某本书的价格,
// 具体:如果价格 > 150,则更改为150
//     如果价格 > 100,则更改为100
//     否则不变
public class Homework03 {
    public static void main(String[] args){
        Book book1 = new Book("凡人修仙传",200);
        System.out.println("book1.name = " + book1.name
                + "book1.price = " + book1.price);

        Book book2 = new Book("求魔",120);
        System.out.println("book2.name = " + book2.name
                + "book2.price = " + book2.price);

    }
}

class Book{
    String name;
    double price;
    public void updatePrice(){
        if (this.price > 150){
            this.price = 150;
        }else if(this.price > 100){
            this.price = 100;
        }
    }

    public Book(String name,double price){
        this.name = name;
        this.price = price;
        this.updatePrice();
    }

    Book(){

    }

}
