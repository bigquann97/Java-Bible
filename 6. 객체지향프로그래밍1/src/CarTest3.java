class Car {
    String color;
    String gearType;
    int door;

    Car() {
        this("white", "auto", 4);
    }

    Car(Car c) {
/*
        color = c.color; // 버전1
        gearType = c.gearType;
        door = c.door;
*/
/*
        this.color = c.color; // 버전2
        this.gearType = c.gearType;
        this.door = c.door;
*/
        this(c.color, c.gearType, c.door); // 버전3
    }

    public Car(String color, String gearType, int door) {
        this.color = color;
        this.gearType = gearType;
        this.door = door;
    }

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", gearType='" + gearType + '\'' +
                ", door=" + door +
                '}';
    }
}
public class CarTest3 {
    public static void main(String[] args) {
        Car c1 = new Car();
        Car c2 = new Car(c1);

        System.out.println(c1);
        System.out.println(c2);

        c2.color = "black";

        System.out.println(c1);
        System.out.println(c2);
    }
}
