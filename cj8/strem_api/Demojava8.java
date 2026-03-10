package com.techouts.cj8.strem_api;
import java.util.concurrent.CountDownLatch;
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

    }
}
