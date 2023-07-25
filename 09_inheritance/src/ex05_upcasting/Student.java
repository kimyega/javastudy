package ex05_upcasting;

public class Student extends Person{
  private String school;
  
  public Student() {
    
  }
  
  // 반드시 super 클래스의 생성자 호출이 있어야 하기 때문에
  // 개발자가 super 클래스의 생성자를 호출하지 않으면 Java가 직접 super클래스의 디폴트 생성자를 만든다.
  // 자동 호출 디폴트 생성자 super 
  public Student(String name, String school) {
    super(name);
    this.school = school;
  }
  
  
  public String getSchool() {
    return school;
  }
  public void setSchool(String school) {
    this.school = school;
  }
  
  @Override
  public void study() {
    System.out.println("공부중!");
  }
  
  @Override
  public void info() {
    super.info();
    System.out.println("학교: " + school);
  }
  
}
