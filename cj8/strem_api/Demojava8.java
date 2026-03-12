package com.techouts.cj8.strem_api;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demojava8 {
 static Consumer<Integer> consumer= new Consumer<Integer>() {
        @Override
        public void accept(Integer integer) {

        }
    };

    static void main() {
        Stream<Integer> integerStream=Stream.of(1,2,3,4,5,6,7,8);
        integerStream.forEach(consumer);

        //Converting the list into stream
        List<Integer> lists= Arrays.asList(12,23,24,26,27,28);
        Stream<Integer> stre = lists.stream();
        stre.forEach(System.out::println);

        //Array
        String arr[]={"AA","BB","CC","DD"};
       Stream<String> n = Arrays.stream(arr);
        n.forEach(System.out::println);


    }
}
