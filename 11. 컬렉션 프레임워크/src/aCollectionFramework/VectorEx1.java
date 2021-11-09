package aCollectionFramework;

import java.util.Vector;

public class VectorEx1 {
    public static void main(String[] args) {
        Vector v = new Vector(5);
        v.add("1");
        v.add("2");
        v.add("3");
        print(v);

        v.trimToSize(); // 빈 공간 없앰 - Capacity를 size만큼으로 최적화
        System.out.println("=== After trimToSize() ===");
        print(v);

        v.ensureCapacity(6); // 용량 늘리기
        System.out.println("=== After ensureCapacity(6) ===");
        print(v);

        v.setSize(7); // size 7까지 하면 capacity 오버 - 기존 capacity 두배로 늘림
        System.out.println("=== After setSize(7) ===");
        print(v);

        v.clear(); // 모든 요소 삭제
        System.out.println("=== After clear() ===");
        print(v);
    }

    public static void print(Vector v) {
        System.out.println(v);
        System.out.println("size : " + v.size());
        System.out.println("capacity : " + v.capacity());
    }
}
