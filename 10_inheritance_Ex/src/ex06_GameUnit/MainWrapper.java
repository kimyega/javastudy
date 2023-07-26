package ex06_GameUnit;

public class MainWrapper {

  public static void main(String[] args) {
    
    
    GameUnit unit1 = new Marine("마린");
    GameUnit unit2 = new Firebat("파이어뱃");
    
    
    unit1.setHp(100);
    unit2.setHp(50);
    
    boolean myTurn = true;
    
    
    while(unit1.isAlive() && unit2.isAlive()) {
      
      if(myTurn) {
        unit1.attack(unit2);
      }else {
        unit2.attack(unit1);
      }
      myTurn = !myTurn;
    }
    
    System.out.println("=== 게임종료 ===");
    
    if(unit1.isAlive()) {
      System.out.println(unit1.getName() + "의  승리! 현재 HP = " + unit1.getHp());
    }else {
      System.out.println(unit2.getName() + "의  승리! 현재 HP = " + unit2.getHp());
    }

  }

}
