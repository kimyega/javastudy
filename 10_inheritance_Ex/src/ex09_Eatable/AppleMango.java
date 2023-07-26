package ex09_Eatable;

public class AppleMango extends Food implements Eatable{
  
  public AppleMango(String name) {    // 생성자가 디폴트가 아니므로 호출해야함
    super(name);
  }
}
