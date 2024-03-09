package org.javaStream.functions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class NonTerminalMethods {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,1,2,3,4,5,6,7,8,9,1,2,3,4,0);
        //distinct method
        List<Integer> result = list.stream().distinct().collect(Collectors.toList());
        System.out.println(result);

        //limit method
        List<Integer> l1 = list.stream().distinct().limit(4).collect(Collectors.toList());
        System.out.println("limited values : "+l1);


        //skip first 3 elements
        System.out.println(list.stream().sorted().skip(3).collect(Collectors.toList()));


    }
}
