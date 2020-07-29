package com.test;
import java.util.Optional;
import java.util.StringJoiner;
public class Test {

    public static void main(String[] args) {
/*        StringBuilder builder = new StringBuilder("Wellcome everybody");
        StringJoiner joiner = new StringJoiner(" ","H","?");
        builder.replace(0, 7, "elcome");
        builder.setCharAt(7, '!');
        joiner.add("ello and").add(builder);
        System.out.println(joiner.toString());
    }*/
		/*
		 * int c = 0; System.out.println((0 == c++) ? "true" : "false"); String e = "1";
		 * System.out.println(("1" != e) ? "true" : "false");
		 */
        String a = null;
        Optional<String> b = Optional.empty();
        try {
            System.out.print(a.length());
            System.out.print(b.orElse("").length());
        }
        catch (Exception ex) {
            System.out.print(a);
        }
        finally {
            a = "String";
            System.out.print(a.length());
            b = Optional.ofNullable("");
            System.out.println(b.get().length());
        }
    }
}




