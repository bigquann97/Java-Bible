package cStream;

import java.util.Arrays;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx0 {
    public static void main(String[] args) {
        String[] strArr = { "aaa", "ddd", "ccc" };

        Stream<String> strStream = Arrays.stream(strArr);
        
        // 3가지 forEach 표현식 - Sout

//
//        strStream.forEach(System.out::println);
//
//        strStream = Arrays.stream(strArr);
//        strStream.forEach((i) -> System.out.println(i));
//
//        strStream = Arrays.stream(strArr);
//        strStream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

        String a = "Hi";
        String b = "Bye";

        BiFunction<String, String, Boolean> f = (s1, s2) -> s1.equals(s2);
        BiFunction<String, String, Boolean> f2 = (String::equals);

        System.out.println(f2.apply(a, b));
    }
}
