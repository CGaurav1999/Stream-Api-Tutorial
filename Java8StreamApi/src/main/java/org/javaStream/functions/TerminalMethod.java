package org.javaStream.functions;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class TerminalMethod {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(9,1,2,3,4,5,6,7,8,9,1,2,3,4);
        //count method
        long count = list.stream().distinct().count();
        System.out.println(count);

        //min method
        int minElement = list.stream().min((a, b)-> a.compareTo(b)).get();
        //alternate
        Optional<Integer> minElementAlt = list.stream().min(Comparator.naturalOrder());

        System.out.println(minElement);
        System.out.println(minElementAlt.get());

        //min method
        int maxElement = list.stream().max((a, b)-> {return a.compareTo(b);}).get();
        //alternate
        Optional<Integer> maxElementAlt = list.stream().max(Comparator.naturalOrder());

        System.out.println(maxElement);
        System.out.println(maxElementAlt.get());

        //reduce method
        //combines like in first take it consumes first and second element and return result
        //then previous result acts as first element and then the next element comes to second
        //element and then return result and goes on..........
        int res = list.stream().reduce((val1,val2)->{return val1+val2;}).get();
        System.out.println(res);


        //toArray method
        Object[] arr = list.stream().toArray();
        for(Object o : arr){
            System.out.print(o+" ");
        }
        System.out.println();

        //anyMatch
        System.out.println(list.stream().anyMatch(ele->ele==100));
        System.out.println(list.stream().anyMatch(ele->ele==5));

        //noneMatch
        System.out.println(list.stream().noneMatch(ele->ele==100));
        System.out.println(list.stream().noneMatch(ele->ele==5));

        //allMatch
        System.out.println(list.stream().allMatch(ele->ele==5));

        //findAny
        //findAny method returns optional any value from collection
        //if there is no value then noSuchElementException is thrown
        System.out.println(list.stream().findAny().get());

        //findFirst returns optional of first value
        //returns noSuchElementException if no element is present
        System.out.println(list.stream().findFirst().get());

        //Stream.concat(stream1,stream2) // returns concatinated stream



    }
}
