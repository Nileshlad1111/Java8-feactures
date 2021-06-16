package com.lambdaexpresion;

public class Main {
    public static void main(String[] args) {
        System.out.println("My system starts");

        /*MyInter myInter = new MyInterImp();
        myInter.sayHello();
    */

       /* MyInter myInter = new MyInter() {
            @Override
            public void sayHello() {
                System.out.println("this second anonymous class");
            }
        };
        myInter.sayHello();*/

        //lambda expression

        MyInter myInter = () -> System.out.println("This is third method lambda expression");
        myInter.sayHello();
    }
}
