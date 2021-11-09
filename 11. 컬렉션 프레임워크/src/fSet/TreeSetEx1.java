package fSet;

import java.util.TreeSet;

public class TreeSetEx1 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b"; // * Comparable하든가 Comparator가 구현되어 있든가
        String to = "d";

        set.add("abc"); set.add("alien"); set.add("bat");
        set.add("car"); set.add("Car"); set.add("disc");
        set.add("dance"); set.add("dZZZZ"); set.add("dzzz");
        set.add("elephant"); set.add("elevator"); set.add("fan");
        set.add("flower");
// 검색 범위를 지정해서 검색하는 거에 대해 매우 유용한 컬렉션 프레임워크
        System.out.println(set);
        System.out.println("range search : from " + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from, to)); // 범위 검색
        System.out.println("result2 : " + set.subSet(from, to + "zzz"));
    }

}

//  공백 숫자 대문자 소문자