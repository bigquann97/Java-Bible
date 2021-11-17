package dStream.Note;

public class note {
    public static void main(String[] args) {
        String a = "hi, my name is gwanho";
        char p = ' ';

        System.out.println("hi"+p+"aa");

        String[] b = a.split(" +");

        for(String c : b) {
            System.out.println(c);
        }

        String[] asdf = new String[]{"123", "456", "15"};
        System.out.println(asdf[0]);
    }
}
