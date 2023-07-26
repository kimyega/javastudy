package ex06_downcasting;

public class MainWrapper {

  public static void ex01() {
    
    Person p1 = new Student();
    p1.eat();
    p1.sleep();
    ((Student)p1).study();      // 슈퍼 -> 서브 다운캐스팅 
    
    ((Worker)p1).work();        // 잘못된 캐스팅을 막고 싶다!
  }
  
  public static void ex02() {
    Person p1 = new Student();
    
    // a instanceof b 를 이용해서 잘못된 캐스팅을 막을 수 있다.
    System.out.println(p1 instanceof Person);
    System.out.println(p1 instanceof Student);
    System.out.println(p1 instanceof Worker);
    
    // 코드 자동완성 가능
    if(p1 instanceof Student) {
      ((Student) p1).study();
    }
  
    
    Person p2 = new Worker();
    if(p2 instanceof Worker) {
      ((Worker) p2).work();
    }
    
  }
  
  public static void main(String[] args) {
    ex02();
  }

}
