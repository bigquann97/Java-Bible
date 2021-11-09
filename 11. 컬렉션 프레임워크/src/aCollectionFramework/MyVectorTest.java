package aCollectionFramework;

public class MyVectorTest {
    public static void main(String[] args) {
        MyVector myVector1 = new MyVector(5);
        MyVector myVector3 = myVector1;
        MyVector myVector2 = new MyVector(5);
        System.out.println(myVector3.equals(myVector1));
        System.out.println(myVector2.equals(myVector1));

        MyVector myVector = new MyVector(5);

        System.out.println(myVector.capacity);
        System.out.println(myVector.size);

        myVector.add(1);
        myVector.add(5);
        myVector.add(4);
        myVector.add(3);
        myVector.add(2);
        System.out.println("size = " + myVector.size);

        System.out.println(myVector.get(1));

        System.out.println(myVector.contains(6));

        //System.out.println(myVector.equals(myVector1));
        //System.out.println(myVector.equals(myVector2));

        myVector.set(0,0);
        System.out.println(myVector.get(1));
        System.out.println("size = " + myVector.size);
        myVector.set(4,9);
        System.out.println(myVector.get(4));

        myVector1.add(1);
        myVector1.add(2);
        myVector1.add(3);
        myVector1.add(4);
        myVector1.add(0, 0);
        myVector1.add(5, 6);
        myVector1.add(0, 1);

        System.out.println(myVector3);

        System.out.println("indexof = " + myVector1.indexOf(3));
        System.out.println("lastIndexOf = " + myVector1.lastIndexOf(1));
        System.out.println(myVector1.size);
        System.out.println(myVector1.capacity);
        System.out.println(myVector1);

/*
        MyVector myVector2 = new MyVector(7);
        myVector2.add(1);
        myVector2.add(0);
        myVector2.add(1);
        myVector2.add(2);
        myVector2.add(3);
        myVector2.add(4);
        myVector2.add(6);
        System.out.println(myVector2);
        System.out.println(myVector2.equals(myVector1));
*/


    }
}
