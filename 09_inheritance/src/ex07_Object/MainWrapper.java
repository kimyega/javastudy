package ex07_Object;

public class MainWrapper {
  
  public static void ex01() {
    // Object 타입으로 모든 객체를 저장할 수 있다.
    Object obj = new Person();
    ((Person)obj).setName("아이유");
    ((Person)obj).setAge(30);
    
    System.out.println(((Person)obj).getName());
    System.out.println(((Person)obj).getAge());

  }
  public static void ex02() {
     
    // equals() 두 객체의 참조값을 비교해서 같으면 true 아니면 false반환
    Person p1 = new Person("홍길동", 20);
    Person p2 = new Person("홍길동", 20);
  
    boolean same = p1.equals(p2);   // equals 번지수 비교
                                    // equals 를 이용해 문자비교한다.
    System.out.println(same ? "동일한 객체" : "다른 객체");
    
  }
  public static void ex03() {
    Person p = new Person("홍길동", 20);
    System.out.println(p);      // 객체 p는 p.toString() 이 자동 호출되서 사용된다.
    System.out.println(p.toString());
  }
  public static void main(String[] args) {
    ex03();
    
    
  }
}
