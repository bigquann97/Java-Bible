package aCollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx2 {
    public static void main(String[] args) {
        final int LIMIT = 10;
        String source = "0123456789abcdefghijABCDEFGHIJ!@#$%^&*()ZZZ"; // 10 + 10 + 10 + 10 + 3
        int length = source.length(); // 43

        List list = new ArrayList(length/LIMIT + 10); // (43/10) + 10 = 14

        for(int i  = 0; i < length; i += LIMIT) {
            if(i + LIMIT < length) {
                list.add(source.substring(i, i + LIMIT));
            }
            else {
                list.add(source.substring(i));
            }
        }

        for(int i = 0; i < list.size(); i++) { // size = 5
            System.out.println(list.get(i));
        }
    }
}
