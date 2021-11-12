package aLambda.LambdaEx2;

@FunctionalInterface
interface MyFunction {
    void myMethod(); // public abstract void myMethod();
}

@FunctionalInterface
interface MyFunction2 {
    void myMethod();
}

public class LambdaEx2 {
    public static void main(String[] args) {
        MyFunction f = () -> {}; // MyFunction f = (MyFunction)( () -> {} );
        Object obj = (MyFunction)( () -> {} );
        // Object obj = (Object)( () -> {} ); - 오류
        String str = ((Object)(MyFunction)( () -> {} )).toString();

        System.out.println(f);
        System.out.println(obj);
        System.out.println(str);

//        System.out.println( () -> {} ); - 에러 람다식은 Object타입 형변환 불가
        System.out.println((MyFunction)( () -> {} ));
//        System.out.println((MyFunction)( () -> {} ).toString() ); - 에러
        System.out.println( ( (Object) (MyFunction) ( () -> {} ) ).toString() );
        System.out.println();
    }

}
