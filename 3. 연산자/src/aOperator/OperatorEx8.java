package aOperator;

public class OperatorEx8 {
    public static void main(String[] args) {
        int a = 1_000_000;
        int b = 2_000_000;

        long c = a * b; // int타입과 int타입의 연산결과는 int타입이기때문에 long형태로 자동형변환되어도 값은 안바뀜
        // a나 b 둘중하나 long형태로 변환 필요
        System.out.println(c);
    }
}
