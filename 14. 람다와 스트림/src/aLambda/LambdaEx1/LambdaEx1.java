package aLambda.LambdaEx1;

import java.util.Comparator;

// 함수형 인터페이스
@FunctionalInterface
interface MyFunction {
    void run(); // public abstract void run();
}

public class LambdaEx1 {
    static void execute(MyFunction f) { // 매개변수의 타입이 MyFunction인 메서드
        f.run();
    }

    static MyFunction getMyFunction() { // 반환 타입이 MyFunction 인 메서드
        MyFunction f = () -> System.out.println("f3.run()");
        return f;
    }

    public static void main(String[] args) {

        // 람다식으로 MyFunction의 run()을 구현
        MyFunction f1 = () -> System.out.println("f1.run()");
/*
        MyFunction f1 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f1.run()");
            }
        };
*/

        MyFunction f2 = new MyFunction() {
            @Override
            public void run() {
                System.out.println("f2.run()");
            }
        };

        MyFunction f3 = getMyFunction();

        f1.run();
        f2.run();
        f3.run();

        execute(f1);

//        MyFunction f4 = () -> System.out.println("run()");
//        execute(f4);
        execute( () -> System.out.println("run()") );
    }
}
