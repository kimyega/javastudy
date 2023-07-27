package ex02_List;

import java.util.*;

// java.lang.패키지는 생략 가능

public class MainWrapper {
  
  public static void ex01() {
    
    // ArrayList의 인터페이스 List 타입 선언
    List<String> season;
    
    // ArrayList 생성
    season = new ArrayList<String>();
    
    // 배열 요소 추가하기
    season.add("여름");
    season.add("가을");
    season.add("겨울");
    season.add(0, "봄");
    
    // 배열 요소 확인
    System.out.println(season.get(0));
    System.out.println(season.get(1));
    System.out.println(season.get(2));
    System.out.println(season.get(3));
    
  }

  public static void ex02() {
    
    // ArrayList의 선언 생성
    List<String> hobbies = new ArrayList<String>();
    
    hobbies.add("여행");
    hobbies.add("독서");
    hobbies.add("코딩");
    
    // 배열의 길이 확인하기 저장된 요소 갯수
    System.out.println(hobbies.size());
    System.out.println();
    
    // 배열 길이 관련 (마지막 요소 꺼내기)
    System.out.println(hobbies.get(hobbies.size() - 1));
    System.out.println();
    
    // 배열 for문 적용하기
    for(String a : hobbies) {
      System.out.println(a);
    }
    System.out.println();
    
    for(int i = 0, length = hobbies.size(); i < length; i++) {
      System.out.println(hobbies.get(i));
    }
  }
  
  public static void ex03() {
    
    List<String> flower = new ArrayList<String>();
    
    flower.add("카나리아");
    flower.add("골드마리");
    flower.add("라벤더");
    
    flower.set(0, "카네이션");
    flower.remove(2);
    
    for(String a : flower) {
      System.out.println(a);
    }
  }
  
  public static void ex04() {
    
    Integer[] a = {10, 20, 30, 40, 50};   // 타입을 맞춰줘야 한다.
    List<Integer> numbers = Arrays.asList(a);
    
    // 주의 !! 초기화된 ArrayList는 길이를 변경할 수 없다.
//    numbers.remove(0);
//    numbers.add(60);
    
    for(Integer n : numbers) {
      System.out.println(n);
    }
  }

  public static void ex05() {
    
    List<Integer> numbers = Arrays.asList(10, 20, 30, 40, 50);
    
    // for문
    
    for(int i = 0, length = numbers.size(); i < length; i++) {
      System.out.println(numbers.get(i));
    }
  }
  
public static void ex99() {
    
    List<Integer> age = new ArrayList<Integer>();
    age.add(20);
    age.add(30);
    age.add(24);
    
    List<String> name = new ArrayList<String>();
    name.add("박나래");
    name.add("이지은");
    name.add("김수현");
    
//    List<Info> info = new ArrayList<Info>();
    
//    for(int i = 0, length = info.size(); i < length; i++) {
//      info.add(i,);
//    }
    
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
    ex05();
    
    
  }
}
