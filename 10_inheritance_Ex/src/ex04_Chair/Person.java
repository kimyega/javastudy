package ex04_Chair;

public class Person extends Chair{
  private String name;
  private Student student;
  
  public Person() {
    
  }
  public Person(String name) {
    this.name = name;
  }
  
  public Person(Student student) {
    this.student = student;
  }
  
  public Student getStudent() {
    return student;
  }

  public void setStudent(Student student) {
    this.student = student;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }
  public void info() {
    System.out.println("이름: " + name);
  }
}
