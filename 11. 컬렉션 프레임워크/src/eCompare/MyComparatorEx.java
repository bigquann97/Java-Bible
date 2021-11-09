package eCompare;

import java.util.Arrays;
import java.util.Comparator;

public class MyComparatorEx {
    public static void main(String[] args) {
        Human[] humans = new Human[5];
        humans[0] = new Human("김씨", 10001);
        humans[1] = new Human("이씨", 10004);
        humans[2] = new Human("오씨", 10005);
        humans[3] = new Human("강씨", 10003);
        humans[4] = new Human("한씨", 10002);

        System.out.println("===정렬 전===");
        for(Human h : humans) {
            System.out.print(h + ", ");
        }
        System.out.println();

        Arrays.sort(humans);

        System.out.println("===정렬 후===");
        for(Human h : humans) {
            System.out.print(h + ", ");
        }
    }
}

class Human implements Comparable { // *
    String name;
    Integer studentNum;

    public Human(String name, Integer studentNum) {
        this.name = name;
        this.studentNum = studentNum;
    }

    @Override
    public int compareTo(Object o) {
        if(o instanceof Human) {
            Human tmp = (Human)o;
            return this.name.compareTo(tmp.name);
        }
        return -1;
    }



    @Override
    public String toString() {
        return name + '=' + studentNum;
    }
}

