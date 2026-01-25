package ex08_static;

public class Mymath {
  // static 필드
  private static final double PI;
  
  // static 필드초기화를 위한 static 블록
  static {
    PI = 3.14;
  }
  
  // static 메소드
  public static double getCircleArea(double radius) {
    return PI * radius * radius;
  }
  
  
}
