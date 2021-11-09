package aOperator;

public class OperatorEx6 {
    public static void main(String[] args) {
        byte a = 10;
        byte b = 20;
//        byte c = a + b; // 컴파일에러 발생 - 명시적 형변환 필요
        byte c = (byte)(a+b); // int형보다 작은 byte형은 두 피연산자의 자료형을 int형으로 변환한 다음 연산
        System.out.println(c);
    }
}
