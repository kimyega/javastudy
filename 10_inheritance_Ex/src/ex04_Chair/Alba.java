package ex04_Chair;

public class Alba extends Student{
  private String work;
  
  public String getWork() {
    return work;
  }
  
  public Alba() {
    
  }
  public Alba(String name, String school, String work) {
    super(name, school);
    this.work = work;
  }
  public void setWork(String work) {
    this.work = work;
  }
  public void info() {
    super.info();
    System.out.println("일하는 곳: " + work);
  }
  
}
