package ex06_GameUnit;

public class Marine extends GameUnit{
  private final int POWER = 5;
  
  public Marine() {
    super();
  }
  
  public Marine(String name) {
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
