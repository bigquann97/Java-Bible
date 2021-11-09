package iCollections;
import java.util.*;
import static java.util.Collections.*;

public class CollectionsEx {
    public static void main(String[] args) {
            List list = new ArrayList(); // => Collection
            System.out.println(list);

            Collections.addAll(list, 1, 2, 3, 4, 5);
            System.out.println(list);

            Collections.rotate(list, 2); // 오른 쪽으로 두 칸씩 이동
            System.out.println(list);

            Collections.swap(list, 0, 2);
            System.out.println(list);

            Collections.shuffle(list);
            System.out.println(list);

            Collections.sort(list);
            System.out.println(list);

            Collections.sort(list, reverseOrder());
            System.out.println(list);

            Collections.reverse(list);
            System.out.println(list);

            int idx = binarySearch(list, 3);
            System.out.println("index of 3=" + idx);

            System.out.println("max=" + Collections.max(list));
            System.out.println("min=" + Collections.min(list));
            System.out.println("min=" + Collections.max(list, reverseOrder()));

            Collections.fill(list, 9);
            System.out.println("list=" + list);

            // list와 같은 크기의 새로운 list를 생성하고 2로 채움 - 결과 변경 불가
            List newList = Collections.nCopies(list.size(), 2);
            System.out.println("newList=" + newList);

            System.out.println(disjoint(list, newList)); // 공통요소 없으면 true

            copy(list, newList);
            System.out.println("newList=" + newList);
            System.out.println("list=" + list);

            Collections.replaceAll(list, 2, 1);
            System.out.println("list=" + list);

            Enumeration e = Collections.enumeration(list);
            ArrayList list2 = Collections.list(e);

            System.out.println("list2="+list2);

        }
}
