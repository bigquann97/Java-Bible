public class SuperTest {
    public static void main(String[] args) {
        B b = new B();
    }
}

class A {
    public A() {
        System.out.println("A 생성됨");
    }
}

class B extends A {
    public B() {
        // super(); 생략된 상태
        System.out.println("B 생성됨");
    }
}