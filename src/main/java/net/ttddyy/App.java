package net.ttddyy;

public class App {

    public static void main(String[] args) {

        Foo foo = new Foo();

        String hi = foo.hi(() -> "foo");
        System.out.println(hi);

        System.out.println(foo.hi(() -> "bar"));

        System.out.println(foo.hi(Foo::hello));

        System.out.println(foo.hi(foo::world));
    }
}
