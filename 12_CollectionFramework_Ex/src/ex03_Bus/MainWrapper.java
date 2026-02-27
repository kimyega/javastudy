package ex03_Bus;

public class MainWrapper {

  public static void main(String[] args) {
    
    Bus bus = new Bus();
    
    bus.getOn(1, new Person("박보영"));    // int number = 1; Person person = new Person("박보영");
    bus.getOn(25, new Student("차범근"));
    bus.getOn(30, new Student("박태환"));    // 오류
    
    bus.getOff(1);
    bus.getOff(10);     // 오류
    bus.getOff(30);     // 오류
    
    bus.info();       // 전체 좌석 출력
  }

}
