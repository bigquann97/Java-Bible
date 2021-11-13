package bLambda2;

import java.util.function.Function;
import java.util.function.Predicate;

public class LambdaEx0 {
    public static void main(String[] args) {
        Predicate<String> isEmptyStr = s -> s.length() == 0;
        String s  = "1";

        if(isEmptyStr.test(s)) { // if(s.length() == 0)
            System.out.println("This is an empty String.");
        }

    }
}
