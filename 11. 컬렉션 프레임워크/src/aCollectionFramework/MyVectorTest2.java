package aCollectionFramework;

import java.util.Vector;

public class MyVectorTest2 {
    public static void main(String[] args) {
        MyVector myVector = new MyVector();
        myVector.add(1);
        myVector.add(1);
        myVector.add(1);
        myVector.add(1);
        myVector.add(1);
        myVector.add(1);
        myVector.add(1);
        myVector.add(0, 0);



        System.out.println(myVector.data.length);
        System.out.println(myVector);

        MyVector myVector1 = new MyVector();
    }
}
