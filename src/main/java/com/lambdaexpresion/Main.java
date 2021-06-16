package com.lambdaexpresion;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system starts");

        //regular object throw method call
        MyInter myInter = new MyInterImp();
        myInter.sayHello();

        //anonymous class
        MyInter myInter1 = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this second anonymous class");
            }
        };
        myInter.sayHello();

        //lambda expression

        MyInter myInter2 = () -> System.out.println("This is third method lambda expression");
        myInter2.sayHello();
    }
}
