package example2;

class Parent {

    public Parent() {
        fun();
    }

    public void fun() {
        System.out.println("parent");
    }
}

class Child extends Parent {
    Child() {
        super();
    }
    public void fun() {
        System.out.println("child");
    }
}

public class Abc {
    public static void main(String[] args) {
        Child a = new Child();
        System.out.println("main");
    }
}