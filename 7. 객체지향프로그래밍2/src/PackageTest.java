package com.javachobo.book;

public class PackageTest {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}

// javac -d . PackageTest.java
// 컴파일 - -d: 소스파일에 지정된 경로를 통해 패키지의 위치를 찾아 클래스파일 생성 - 디렉토리 없으면 자동생성
// -d 뒤엔 루트 디렉토리의 경로 적음 => .은 현재 디렉토리로 지정