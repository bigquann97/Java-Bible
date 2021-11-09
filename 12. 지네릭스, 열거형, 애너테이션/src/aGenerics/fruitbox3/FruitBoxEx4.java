package aGenerics.fruitbox3;

import java.util.*;

class Fruit {
    String name;
    int weight;

    Fruit(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public String toString() { return name + "(" + weight + ")"; }
}

class Apple extends Fruit {
    Apple(String name, int weight) {
        super(name, weight);
    }
}

class Grape extends Fruit {
    Grape(String name, int weight) {
        super(name, weight);
    }
}

class AppleComp implements Comparator<Apple> {
    @Override
    public int compare(Apple o1, Apple o2) {
        return o2.weight - o1.weight;
    }
}

class GrapeComp implements Comparator<Grape> {
    public int compare(Grape t1, Grape t2) {
        return t2.weight - t1.weight;
    }
}

class FruitComp implements Comparator<Fruit> {
    public int compare(Fruit t1, Fruit t2) {
        return t1.weight - t2.weight;
    }
}

public class FruitBoxEx4 {
    public static void main(String[] args) {
        FruitBox<Apple> appleBox = new FruitBox<>();
        FruitBox<Grape> grapeBox = new FruitBox<>();

        appleBox.add(new Apple("GreenApple", 300));
        appleBox.add(new Apple("GreenApple", 100));
        appleBox.add(new Apple("GreenApple", 200));

        grapeBox.add(new Grape("GreenGrape", 400));
        grapeBox.add(new Grape("GreenGrape", 300));
        grapeBox.add(new Grape("GreenGrape", 200));

        Collections.sort(appleBox.getList(), new AppleComp()); // Apple Fruit Object
        Collections.sort(grapeBox.getList(), new GrapeComp());
        // new GrapeComp() - ? super Grape
        // Grape로 하한을 설정을 해버려서 // Grape를 포함해서 그 조상들을 넣을수 있게 되는 형태
        // Grape, Fruit, Object

        System.out.println(appleBox);
        System.out.println(grapeBox);
        System.out.println();

        // 와일드카드를 이해했습니다.

        Collections.sort(appleBox.getList(), new FruitComp());
        Collections.sort(grapeBox.getList(), new FruitComp());
        // Fruit 로 하한을 조정해버리면,
        // Fruit 를 포함해서 그 조상들을 넣을 수 있게 되는 겁니다.
        // Fruit, Object =>
        // apple, grape자체가 Fruit를 상속하고 있는 형태라서
        // FruitComp 를 설정을 해도, Fruit를 상속 받고 있는 apple grape를 넣어도 상관이 없어지는 형태 입니다.

        System.out.println(appleBox);
        System.out.println(grapeBox);

    }
}

class FruitBox<T extends Fruit> extends Box<T> {}
class Box<T> {
    ArrayList<T> list = new ArrayList<>();

    void add(T item) {
        list.add(item);
    }

    T get(int i) {
        return list.get(i);
    }

    ArrayList<T> getList() { return list; }

    int size() {
        return list.size();
    }

    public String toString() {
        return list.toString();
    }
}