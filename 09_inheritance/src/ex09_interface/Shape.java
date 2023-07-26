package ex09_interface;

/*
 * 인터페이스
 * 1. JDK 1.7 이전에는 추상 메소드로만 구성된 추상 클래스를 의미했다.
 * 2. JDk 1.8 이후로는 추상 메소드 + 디폴트 메소드 + 스테틱 메소드 + 파이널 상수 로 구성된다.
 *    1) 추상 메소드   : 본문이 없는 메소드(대부분은 추상 메소드로 구성됨)
 *    2) 디폴트 메소드 : 본문이 있는 메소드
 *    3) 스테틱 메소드 : 클래스 메소드 (본문 있음)
 * 3. 인터페이스의 추상 메소드는 public abstract를 생략할 수 있다.   
 */

public interface Shape {

 public static final double PI = 3.14;
 
 double getArea();  // public abstract 생략
 
 public default void info1() {
   System.out.println("난 도형");
 }
 public static void info2() {
   System.out.println("난 도형");
 }
}
