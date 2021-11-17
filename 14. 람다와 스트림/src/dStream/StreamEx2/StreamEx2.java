package dStream.StreamEx2;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx2 {
    public static void main(String[] args) {
        File[] fileArr = { new File("Ex1.java"), new File("Ex1.bak"), new File("Ex2.java"),
                new File("Ex1"), new File("Ex1.txt")};

        Stream<File> fileStream = Stream.of(fileArr);

        // map()으로 Stream<File>을 Stream<String>으로 변환
        Stream<String> filenameStream = fileStream.map(File::getName);
//        filenameStream.forEach(System.out::println); // 모든 파일 이름 출력

        fileStream = Stream.of(fileArr); // 스트림 재생성

        fileStream.map(File::getName)      // Stream<File> -> Stream<String>              "Ex1.java", "Ex1.bak", "Ex2.java", "Ex1", "Ex1.txt"
                .filter(s -> s.indexOf('.') != -1) // 확장자 없는 것 제외                    "Ex1.java", "Ex1.bak", "Ex2.java", "Ex1.txt"
                .peek(s -> System.out.printf("filename = %s%n", s))     //                "Ex1.java", "Ex1.bak", "Ex2.java", "Ex1.txt"
                .map(s -> s.substring(s.indexOf('.') + 1)) // 확장자만 추출                 "java", "bak", "java", "txt"
//                .peek(s -> System.out.printf("확장자 = %s%n", s)) //                       "java", "bak", "java", "txt"
                .map(String::toUpperCase) // 대문자 변환                                    "JAVA", "BAK", "JAVA", "TXT"
//                .peek(s -> System.out.printf("대문자 = %s%n", s))     //                   "JAVA", "BAK", "JAVA", "TXT"
                .distinct() // 중복제거                               //                    "JAVA", "BAK", "TXT"
//                .peek(s -> System.out.printf("중복제거 = %s%n", s))   //                    "JAVA", "BAK", "TXT"
                .forEach(System.out::println); //                                            "JAVA", "BAK", "TXT"
                 // 주석처리시?
        System.out.println();
    }
}
