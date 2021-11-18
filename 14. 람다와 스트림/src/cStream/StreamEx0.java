package cStream;

import java.util.Arrays;
import java.util.Collections;
import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamEx0 {
    public static void main(String[] args) {
        String[] strArr = { "aaa", "ddd", "ccc" };

        Stream<String> strStream = Arrays.stream(strArr);
        
//        3가지 forEach 표현식 - Sout

//        strStream.forEach((i) -> System.out.println(i));
//
//        strStream.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });
//        
//        메서드 참조
//        strStream.forEach(System.out::println);


        // 메서드 참조 - 람다식 맨 마지막 부분에
        String a = "Hi";
        String b = "Bye"; // equals

        BiFunction<String, String, Boolean> f = (s1, s2) -> s1.equals(s2); // 이 형태가 너무 뻔하잖아요? String string 받고, 그 두개를 equals 메서드를 사용해서 boolean값을 뱉어주게 되는건데
        BiFunction<String, String, Boolean> f2 = (String::equals);
        System.out.println(f.apply(a, b));
        System.out.println(f2.apply(a, b));
    }
}
