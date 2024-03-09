package org.javaStream.functions;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FilterMethod {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        //filter and strore as list
        List<Integer> evenList = list.stream().filter(ele -> ele%2==0).collect(Collectors.toList());
        System.out.println(evenList);

        //filter and print directly
        list.stream().filter(ele -> ele%2==0).forEach(ele-> System.out.print(ele+" "));
        System.out.println();
        //another way of writing the above code for print
        list.stream().filter(ele -> ele%2==0).forEach(System.out::println);
    }
}
