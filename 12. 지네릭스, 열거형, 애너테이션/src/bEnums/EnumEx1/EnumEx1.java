package bEnums.EnumEx1;

enum Direction { EAST, SOUTH, WEST, NORTH }

public class EnumEx1 {
    public static void main(String[] args) {
        Direction d1 = Direction.EAST; // EAST
        Direction d2 = Direction.valueOf("WEST");
        Direction d3 = Enum.valueOf(Direction.class, "EAST"); // EAST
        // d1 == d3 => false 주소값은 다르기때문에, 안에 들어있는건 똑같은데
        // d1 = EAST , d3 = EAST => 같은 스태틱변수를 참조하기때문에 ,같은 주소값을 같게 되는 형태입니다.
        // static변수를 공유하기때문에 == 를 써도 그냥


        System.out.println("d1="+d1);
        System.out.println("d2="+d2);
        System.out.println("d3="+d3);

        System.out.println("d1 == d2 ? " + (d1 == d2)); // == 주소값 비교
        System.out.println("d1 == d3 ? " + (d1 == d3));
        System.out.println("d1.equals(d3) ? " + (d1.equals(d3)));
//        System.out.println("d2 > d3 ? " + (d2 > d3));
        System.out.println("d1.compareTo(d3) ? " + (d1.compareTo(d3))); // 0 d1 EAST d3 EAST
        System.out.println("d1.compareTo(d2) ? " + (d1.compareTo(d2))); // -2 d1 EAST d2 WEST
        // ordinal => EAST 0 // WEST 2 // 0 - 2 => -2

        switch(d1) {
            case EAST: // Direction.EAST라고 쓸 수 없다
                System.out.println("The direction is EAST.");
                break;
            case SOUTH:
                System.out.println("The direction is SOUTH.");
                break;
            case WEST:
                System.out.println("The direction is WEST.");
                break;
            case NORTH:
                System.out.println("The direction is NORTH.");
                break;
            default:
                System.out.println("Invalid direction.");
                break;
        }

        Direction[] dArr = Direction.values();

        for(Direction d : dArr) { // for (Direction d : Direction.values())
            System.out.printf("%s = %d%n", d.name(), d.ordinal());
        }
    }
}
