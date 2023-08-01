package ex04_catch;

public class MainWrapper {

  public static void ex01() {
    try {
      
//      int a = 5 / 0;
//      System.out.println(a);
      
      // 개발자가 발생시킨 예외
      throw new RuntimeException("개발자 예외"); 
    }catch(Exception e) {
      
      // 예외 클래스 확인하기
      System.out.println(e.getClass().getName());   // Object 메소드 활용
      
      // 예외 메세지 확인하기(예외가 발생한 이유)
      System.out.println(e.getMessage());
    }
  }
  
  public static void ex02(String name) {
  
    try {
      System.out.println(name.substring(0, 1));
    }catch(Exception e) {
      e.printStackTrace();      // 예외 추적 메세지를 출력하는 메소드 (개발 중에는 이것만 사용)  
    }
  }
  
  public static void main(String[] args) {
//    ex01();
    ex02(null);
    
  }

}
