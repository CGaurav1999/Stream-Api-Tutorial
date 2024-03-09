package org.javaStream.functions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortMethod {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10,1,2,3,4,5,6,7,8,9,1,2,3,4,0);

        //sorted method ascending order
        System.out.println(list.stream().sorted().collect(Collectors.toList()));

        //sorted method descending order
        System.out.println(list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()));

    }
}
