package ru.aberezhnoy.lesson009.ex01;

public class Main {
    public static void main(String[] args) {
        Foo foo = new Foo() {
            @Override
            public void method1() {
                System.out.println(">>>>Method1");
            }

            @Override
            public void method2() {
                System.out.println(">>>>Method2");
            }
        };

        foo.method1();
    }
}
