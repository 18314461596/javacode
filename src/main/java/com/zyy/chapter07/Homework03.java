package com.zyy.chapter07;

//��д��Book,���巽��updatePrice��ʵ�ָ���ĳ����ļ۸�,
// ����:����۸� > 150,�����Ϊ150
//     ����۸� > 100,�����Ϊ100
//     ���򲻱�
public class Homework03 {
    public static void main(String[] args){
        Book book1 = new Book("�������ɴ�",200);
        System.out.println("book1.name = " + book1.name
                + "book1.price = " + book1.price);

        Book book2 = new Book("��ħ",120);
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
