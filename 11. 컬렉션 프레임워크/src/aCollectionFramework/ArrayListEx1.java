package aCollectionFramework;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListEx1 {
    public static void main(String[] args) {
        ArrayList list1 = new ArrayList(10);
        list1.add(new Integer(5)); // 컴파일러 오토박싱
        list1.add(new Integer(4));
        list1.add(new Integer(2));
        list1.add(new Integer(0));
        list1.add(new Integer(1));
        list1.add(new Integer(3));

        ArrayList list2 = new ArrayList(list1.subList(1,4)); // fromIndex~toIndex 사이 객체 반환
        print(list1, list2);

        Collections.sort(list1); // * Collection - Collections
        Collections.sort(list2);
        print(list1, list2);

        System.out.println("List1.containsAll(list2): " + list1.containsAll(list2));
        // list1이 list2가 가지고 있는 요소를 모두 가지고 있는가?
        list2.add("B");
        list2.add("C");
        list2.add(3, "A"); // 추가
        print(list1, list2);

        System.out.println("List1.containsAll(list2): " + list1.containsAll(list2));

        list2.set(3, "AA"); // 교체
        print(list1, list2);

        System.out.println("list1.retainAll(list2): " + list1.retainAll(list2));
        print(list1, list2);
        // list1에 대해 list2가 가지고 있는 값만 유지하도록

        for(int i = list2.size() - 1; i >= 0; i--) { // * list2의 맨마지막 요소 부터 끝까지 - i를 증가시켜 삭제시 요소 삭제마다 자리이동 일어남
            if(list1.contains(list2.get(i))) { // list1이 list2[i]에 대한 요소를 갖고 있으면
                list2.remove(i); // list2에서 해당 인덱스의 요소를 삭제하도록
            }
        }
        print(list1, list2);


    }

    static void print(ArrayList list1, ArrayList list2) {
        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println();
    }
}
