package org.javaStream.functions;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapMethod {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("ram","lakshman","sita","hanumam");
        //converting to uppercase
        list.stream().map(str->str.toUpperCase()).forEach(System.out::println);
        list.stream().map(str->str.length()).forEach(System.out::println);

        //using filter even and map to its square at one time
        List<Integer> listOfInteger = Arrays.asList(1,2,3,4,5,6,7,8,9);
        List<Integer> result = listOfInteger.stream()
                                            .filter(ele->ele%2==0)
                                            .map(ele->ele*ele)
                                            .collect(Collectors.toList());
        System.out.println(result);
    }
}
