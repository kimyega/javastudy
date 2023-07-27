package ex02_Coffee;


public class MainWrapper {

  public static void main(String[] args) {
    
    Cup cup1 = new Cup();
    Cup cup2 = new Cup();
    
    Coffee coffe1 = new Americano("아메리카노");
    cup1.setCoffee(coffe1);
    
    Coffee coffe2 = new CafeLatte("카페라떼");
    cup2.setCoffee(coffe2);
    
    
    Person p = new Person();
    p.addCupToTray(cup1);
    p.addCupToTray(cup2);
    
//    System.out.println(p.getTray());
    p.trayInfo();
    
  }

}
