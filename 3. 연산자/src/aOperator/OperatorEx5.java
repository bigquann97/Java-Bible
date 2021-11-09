package aOperator;

public class OperatorEx5 {
    public static void main(String[] args) {
        int a = 10;
        int b = 4;
        System.out.printf("%d + %d = %d%n", a, b, a + b);
        System.out.printf("%d - %d = %d%n", a, b, a - b);
        System.out.printf("%d * %d = %d%n", a, b, a * b);
        System.out.printf("%d / %d = %d%n", a, b, a / b); // int 두개 연산시 int형 얻게됨
        System.out.printf("%d / %f = %f%n", a, (float)b, a / (float)b); // float 형 반환
    }
}
