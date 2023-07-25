package ex05_upcasting;

public class Person {
  private String name;
  
  public Person() {
    
  }
  
  public Person(String name) {
    this.name = name;
  }
  
  
  
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public void sleep() {
    System.out.println("드르렁");
  }
  public void eat() {
    System.out.println("쩝쩝");
  }
  public void info() {
    System.out.println("이름: " + name);
  }
  
  // 실행이 목적이 아닌 호출이 목적인 메소드
  
  public void study() {
    
  }
  public void working() {
    
  }
  
}
