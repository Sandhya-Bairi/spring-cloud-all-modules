package org.example;

import java.util.function.Function;

public class UseFoo {
    public String add(String string, Foo foo) {
        return foo.method(string);
    }

    public String add(String string, Function<String, String> foo) {
        return foo.apply(string);
    }
}
