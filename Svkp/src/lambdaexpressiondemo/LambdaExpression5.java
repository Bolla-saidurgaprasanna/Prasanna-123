package lambdaexpressiondemo;

import java.util.*;  
public class LambdaExpression5{  
    public static void main(String[] args) {  
          
        List<String> list=new ArrayList<String>();  
        list.add("Prasanna");  
        list.add("Chinnu");  
        list.add("Keerthana");  
        list.add("Vani");  
          
        list.forEach(  
            (n)->System.out.println(n)  
        );  
    }  
}  