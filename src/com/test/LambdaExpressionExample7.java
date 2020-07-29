package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class LambdaExpressionExample7{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("ankit");  
        list.add("jai");  
        list.add("irfan");  
        list.add("mayank");  
        list.add("Bharath");
          
        list.forEach(  
            (m)->System.out.println(m)  
        );  
        list.stream().forEach((String)->{System.out.println(list);});
		/*
		 * list.stream().forEach((String) -> { // lambda expression
		 * System.out.println("The string is: " + list); });
		 */
    }  
}  