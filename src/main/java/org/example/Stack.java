package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Hello world!
 *
 */
public class Stack
{
    public static void main( String[] args )
    {

        String val = "Helloworld";

        List<String> list = Arrays.asList("a", "b", "c");
        Map<String, String> map = list.stream()
                .collect(Collectors.toMap(Function.identity(), Function.identity()));
        System.out.println(map);  // Output: {a=a, b=b, c=c}


       // Map<String, String> collect = Arrays.stream(val.split("")).collect(Collectors.toMap(Function.identity(), Function.identity()));
        //System.out.println(collect.toString());

        java.util.Stack stack = new java.util.Stack();
         stack.push("Hello");
         stack.push("World");
         stack.push("!");

         stack.peek();
         System.out.println(stack+" "+  stack.peek());

    }
}
