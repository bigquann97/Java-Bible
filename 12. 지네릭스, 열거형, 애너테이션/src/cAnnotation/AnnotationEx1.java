package cAnnotation;

class Parent {
    void parentMethod() {}
}

class Child extends Parent {
    @Override
    void parentMethod() {}
}
// 오타시) Override하지 않으면 컴파일러는 그냥 새로운 메서드가 추가된줄 안다

public class AnnotationEx1 {
}
