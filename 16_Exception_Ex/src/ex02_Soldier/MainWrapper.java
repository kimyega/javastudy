package ex02_Soldier;

public class MainWrapper {
  // main이 예외를 던지면 Java가 처리한다.
  public static void main(String[] args) throws RuntimeException{
   Soldier s = new Soldier(30);
     s.reload(10);
     s.reload(10);
     
     for(int n = 0; n < 50; n++) {
       s.shoot(); 
     }
     s.shoot();
   
  }

}
