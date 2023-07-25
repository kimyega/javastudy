package ex05_upcasting;

public class Alba extends Student{
  private String work;
  
  public Alba() {
    super();  // 생략 가능
  }
  public Alba(String name, String school, String work) {
    super(name, school);
    this.work = work;
  }
  public String getWork() {
    return work;
  }
  public void setWork(String work) {
    this.work = work;
  }
  @Override
  public void working() {
    System.out.println("알바중!");
  }
  public void info() {
    super.info();
    System.out.println("일하는 곳: " + work);
  }
}
