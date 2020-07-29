package com.test;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.Function;

public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,String> todos = new HashMap<String,String>();
		todos.put("Monday", "washdog");
		todos.put("Tuesday", "weed yard");
		//Function<String,String> printTodo = (String k,String v)->System.out.println(k+""+v);
		//Consumer<String,String> printTodo1 = (String k,String v) -> System.out.println("on"+k+"do"+v);	
		
		//Consumer<String,String> printTodo12 = (Map m)->	System.out.println(m.keySet()+""+m.value());
		BiConsumer<String,String> printTodo12 = (String k,String v)->System.out.println("on"+k+"do"+v);	
		todos.forEach(printTodo12);
		
	}

}
