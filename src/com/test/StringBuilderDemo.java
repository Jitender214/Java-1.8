package com.test;


import java.util.Scanner;    
public class StringBuilderDemo { 
	
    public static void main(String[] argList) {               
    	short x = 2;
        switch (x) {
           case 0: System.out.print("0");
           case 1: System.out.print("1");
           case 2: System.out.print("2");
           case 3: System.out.print("3");
        }
               
          StringBuilder str = new StringBuilder("java StringBuilderDemo Test null Test 1 2 3 test");
          for (String arg : argList) {
              if (str.indexOf(arg)<1)             
                   str.append(arg+" ");                                    
           }                                                      
          //System.out.println(str.toString()); 
         Scanner sc = new Scanner(str.toString());
         while (sc.hasNext()){                     
             if(sc.hasNextInt())                    
                 System.out.print(sc.nextInt() + " ");
             else                                   
                 sc.next();                           
         }                                          
   } 
                                     
 }