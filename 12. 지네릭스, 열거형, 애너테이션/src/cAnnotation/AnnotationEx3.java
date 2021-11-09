package cAnnotation;

import java.util.ArrayList;

class NewClass1 {
    int newField;

    int getNewField() {
        return newField;
    }

    @Deprecated
    int oldField;

    @Deprecated
    int getOldField() {
        return oldField;
    }
}

public class AnnotationEx3 {
    @SuppressWarnings("deprecation")
    public static void main(String[] args) {
        NewClass1 nc = new NewClass1();

        nc.oldField = 10;
        System.out.println(nc.getOldField());

        @SuppressWarnings("unchecked")
        ArrayList<NewClass1> list = new ArrayList(); // 타입을 지정하지 않음
        list.add(nc);
    }
}
