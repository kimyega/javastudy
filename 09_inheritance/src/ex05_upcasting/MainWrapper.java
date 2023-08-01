package ex05_upcasting;


/*
 * upcasting
 * 1. 서브 클래스 객체를 슈퍼 클래스 타입으로 저장할 수 있다.
 * 2. 강제로 캐스팅(형변환)할 필요가 없다. 자동으로 변환된다.
 * 3. 장점 
 *    1) 슈퍼 클래스 타입으로 모든 서브 클래스 객체를 저장할 수 있다.
 *    2) 서로 다른 타입의 객체를 하나의 타입으로 관리할 수 있다.
 * 4. 단점
 *    1) 슈퍼 클래스 타입으로 저장하기 때문에 슈퍼 클래스의 메소드만 호출할 수 있다.
 *    2) 이 단점을 해결하기 위해서 메소드 오버라이드를 이용할 수 있다.
 */


public class MainWrapper {
  public static void main(String[] args) {
//    Student s1 = new Student();
//    s1.setName("장원영");
//    s1.setSchool("서울대학교");
//    s1.eat();
//    s1.sleep();
//    s1.study();
//    System.out.println(s1.getName());
//    System.out.println(s1.getSchool());
//    s1.info();
    
    Person p1 = new Student("김민지", "세종대학교");
    Person p2 = new Alba("김유정", "인하대학교", "스타벅스");
    
//    p1.study();     // 단점 슈퍼클래스 아니면 메소드 못불러옴
//    p2.study();
//    p2.working();
    
    
//    Alba alba = new Alba("김유정", "인하대학교", "스타벅스");
//    alba.info();
    
    
    
  }
}