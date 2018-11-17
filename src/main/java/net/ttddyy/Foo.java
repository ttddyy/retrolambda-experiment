package net.ttddyy;

public class Foo {

    public static String hello() {
        return "Hello";
    }

    public String world() {
        return "World";
    }

    public String hi(MySupplier<String> supplier) {
        return "Hi " + supplier.get();
    }
}
