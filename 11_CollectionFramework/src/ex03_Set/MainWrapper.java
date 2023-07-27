package ex03_Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainWrapper {
  
  
  /*
   * Set
   * 1. 인덱스가 없다. 저장 순서가 없다.
   * 2. 중복 저장이 되지 않는다.
   */
  
  /*
   * Hash
   * 1. 해쉬코드 조회  -> equals 조회
   */
  public static void ex01() {
    
    // Set 인터페이스 타입선언
    Set<String> season;
    
    // HashSet 클래스 객체 생성
    season = new HashSet<String>();
    
    // 요소 추가하기
    season.add("봄");
    season.add("여름");
    season.add("가을");
    season.add("겨울");
    season.add("봄");
    
    System.out.println(season);
    
    
  }
  
  public static void ex02() {
    
    Set<String> hobbies = new HashSet<String>();
    
    hobbies.add("독서");
    hobbies.add("요리");
    hobbies.add("게임");
    hobbies.add("그림");
    
    for(String h : hobbies) {
      System.out.println(h);
    }
    
    
  }
  
  public static void ex03() {
    
    Set<String> flower = new HashSet<String>();
    flower.add("국화");
    flower.add("강아지풀");
    flower.add("진달레");
    flower.add("민들레");
    
    // 반복자 Iterator를 이용한 Set 순회
    Iterator<String> arm = flower.iterator();
    while(arm.hasNext()) {
      System.out.println(arm.next());
    }
    System.out.println(arm.hasNext());

    
  }
  
  public static void ex04() {
    Person p1 = new Person("홍길동", 30);
    Person p2 = new Person("홍길동", 30);
    
    Set<Person> people = new HashSet<Person>();
    
    people.add(p1);
    people.add(p2);
    
    System.out.println(people);
  }
  
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
    ex04();
    
    
    
  }
}
