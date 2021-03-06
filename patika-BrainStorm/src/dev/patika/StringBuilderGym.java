package dev.patika;

/*
    1- StringBuilder --> Mutable (değiştirilebilir - not thread-safe)
    2- StringBuffer --> Mutable (değiştirilebilir - thread-safe)
    String --> Immutable (değiştirilemez)
 */
public class StringBuilderGym {
    public static void main(String[] args) {

        StringBuilder builder1 = new StringBuilder();
        StringBuilder builder2 = new StringBuilder(0);
        String hello = "hello";

        hello.concat(" world");

        builder1.append(hello);
        builder2.append(builder1).append(" world");

        System.out.println(builder1); // hello
        System.out.println(builder2); // hello world
    }
}
