package org.example;

import org.graalvm.polyglot.Context;


public class Main {
    public static void main(String[] args) {
        var context = Context.newBuilder("js").build();
        var result = context.eval("js", "1 + 2");

        System.out.println(result);
    }
}