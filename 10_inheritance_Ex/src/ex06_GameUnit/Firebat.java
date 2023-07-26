package ex06_GameUnit;

public class Firebat extends GameUnit{
  private final int POWER = 10;  
  
  public Firebat() {
    super();
  }
  public Firebat(String name) {
    super(name);
  }

  public int getPOWER() {
    return POWER;
  }
  @Override
  public void attack(GameUnit gameunit) {
    System.out.println(getName() + "의 공격!");
    if(POWER >= gameunit.getHp()) {
      gameunit.setHp(0);
    }else {
    gameunit.setHp(gameunit.getHp() - POWER);
    }
  }
  
}
