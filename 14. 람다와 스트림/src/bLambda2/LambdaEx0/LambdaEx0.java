package bLambda2.LambdaEx0;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class LambdaEx0 {
    public static void main(String[] args) {
        
        // 자주 쓰이는 형식의 메서드를 함수형 인터페이스로 미리 정의해놓음

//        Runnable r = new Runnable() {
//            @Override
//            public void run() {
//                System.out.println("hi");
//            }
//        }

//        Runnable r = () -> System.out.println("hi");
//        r.run();

//        Supplier s = () -> { return "Hi"; }; // 받는건 없고, 주는것만 있음
//        System.out.println(s.get());

//        Consumer c = i -> System.out.println(i); // Bi - 받는건 있는데, 주는건 없는
//        c.accept("hi");

//        Function f = (i) -> { return "hi"; }; // Bi - 함수 - 받는것도 있고, 주는것도 있고
//        System.out.println(f.apply(1));

//        Predicate p = (i) -> i.equals("hi"); // Bi - 함수의 변형인데 - 받는거 있고 주는거 있는데, 주는게 boolean
//        System.out.println(p.test("sd"));

//        Predicate<String> isEmptyStr = i -> i.length() == 0;
//        String i  = "";
//        if(isEmptyStr.test(i)) { // if(s.length() == 0)
//            System.out.println("This is an empty String.");
//        }

//        3개 이상이면 직접 만들어 작성
    }

//    @FunctionalInterface
//    interface TriFunction<T,U,V,R> {
//        R apply(T t, U u, V v);
//    }

    // UnarayOperator, BinaryOperator - 함수의 형태인데, 받는값이랑 주는 값이랑 타입이 같아요
}
