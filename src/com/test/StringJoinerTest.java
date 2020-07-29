package com.test;


import java.util.StringJoiner;
public class StringJoinerTest {
    public static void main(String[] args) {
        StringJoiner sj1 = new StringJoiner(":", "[", "]");
        sj1.add("red").add("green").add("blue");

        StringJoiner sj2 = new StringJoiner("/", "{", "}");
        sj2.add("yellow").add("violet").add("orange");
        
        sj2.merge(sj1);
        System.out.println(sj1);
        System.out.println(sj2.toString());
    }
}

