package cType;

public class CharToCode {
    public static void main(String[] args) {
        char ch = 'A'; // char ch = 65;
        int code = (int)ch;  // ch저장된 값을 int 타입으로 변환하여 저장

        System.out.printf("%c=%d(%#X)%n", ch, code, code);

        char hch = '가'; // char hch = 0xAC00;
        System.out.printf("%c=%d(%#X)%n", hch, (int)hch, (int)hch);

        char hch0 = 0xAC00; // char hch0 = '가';
        char hch1 = '\uAC00';
    }
}
