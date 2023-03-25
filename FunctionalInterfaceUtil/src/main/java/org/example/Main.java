package org.example;

import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello world!");
        UseFoo useFoo = new UseFoo();
        Foo foo = param -> param + " from Lambda";

        String result = useFoo.add("Message ", foo);
        System.out.println(result);

        result = "";

        Function<String, String> fn = param -> param + " from Lambda";

        result = useFoo.add("Message ", fn);
        System.out.println(result);
    }
}