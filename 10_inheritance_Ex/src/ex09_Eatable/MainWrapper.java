package ex09_Eatable;

public class MainWrapper {

  public static void main(String[] args) {
    Person p = new Person();
    
    p.eatEvrything(new AppleMango("애플망고"));
    p.eatEvrything(new Gosu("고수"));
    p.eatPossible(new AppleMango("애플망고"));
//    p.eatPossible(new Gosu("고수"));
  }

}
