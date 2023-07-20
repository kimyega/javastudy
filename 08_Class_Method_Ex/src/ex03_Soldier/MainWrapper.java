package ex03_Soldier;

public class MainWrapper {

  public static void main(String[] args) {
   Soldier s = new Soldier(30);
   s.reload(30);
   s.reload(20);
   
   for(int n = 0; n < 50; n++) {
     s.shoot(); 
   }
   s.shoot();
  }

}
