package aGenerics.fruitbox2;

import java.util.ArrayList;

class Fruit { public String toString() { return "Fruit"; }}
class Apple extends Fruit { public String toString() { return "Apple"; }}
class Grape extends Fruit { public String toString() { return "Grape"; }}

class Juice {
    String name;

    Juice(String name) { this.name = name + "Juice"; }
    public String toString() { return name;}
}

class Juicer { // ? 어떤거를 받을거냐 할때는 와일드카드를 사용해서 - 이게 명확히 받아야하니까
    static Juice makeJuice(FruitBox<? extends Fruit> box) { // 뭐를 받을건지 정할거면 ?
        // 상한 Fruit => Apple, Grape => 후르츠로 상한설정을 해버렸으니까 => 후르츠를 포함해서, 그 자손들까지 받을 수 있게 되는
        // FruitBox
        //어떤거를 받을건지 말을 해줘야되는데, 후르츠박스에
        String tmp = "";

        for(Fruit f : box.getList()) {
            tmp += f + " ";
        }
        return new Juice(tmp);
    }
}

public class FruitBoxEx3 {
    public static void main(String[] args) {
        FruitBox<Fruit> fruitBox = new FruitBox<Fruit>();
        FruitBox<Apple> appleBox = new FruitBox<Apple>();

        fruitBox.add(new Apple());
        fruitBox.add(new Grape());
        appleBox.add(new Apple());
        appleBox.add(new Apple());

        System.out.println(Juicer.makeJuice(fruitBox));
        System.out.println(Juicer.makeJuice(appleBox));
    }
}

// 제네릭 클래스를 '정의' 할때는 T
class FruitBox<T extends Fruit> extends Box<T> {} // 정의할때는 T

class Box<T> {
    ArrayList<T> list = new ArrayList<>();
    void add(T item) { list.add(item); }
    T get(int i) { return list.get(i); }
    ArrayList<T> getList() { return list; }
    int size() { return list.size(); }
    public String toString() { return list.toString(); }
}
