package ex03_constructor;

public class Student extends Person{
  private String school;
  
  public Student() {
    System.out.println("Student() 호출");
  }
  public Student(String school) {
    this.school = school;
    System.out.println("Student(String school) 호출");
  }
  public Student(String name, String school) {
    // 파라미터 String name을 슈퍼 클래스의 생성자를 호출할 때 사용
    super(name);
    this.school = school;
    System.out.println("Student(String name, String school) 호출");
  }
  
  public String getSchool() {
    return school;
  }
  public void setSchool(String school) {
    this.school = school;
  }
  
  
}
