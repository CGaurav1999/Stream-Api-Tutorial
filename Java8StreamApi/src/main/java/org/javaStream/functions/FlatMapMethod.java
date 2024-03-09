package org.javaStream.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class FlatMapMethod {
    public static void main(String[] args) {
        List<Integer> l1 = Arrays.asList(1,2);
        List<Integer> l2 = Arrays.asList(3,4);
        List<Integer> l3 = Arrays.asList(5,6);
        List<List<Integer>> list = new ArrayList<>();
        list.add(l1);
        list.add(l2);
        list.add(l3);

        List<Integer> result = list.stream().flatMap(x->x.stream().map(ele->ele*ele)).collect(Collectors.toList());
        List<Integer> result1 = list.stream().flatMap(x->x.stream()).map(ele->ele*ele).collect(Collectors.toList());

        System.out.println(result);
        System.out.println(result1);
    }
}
