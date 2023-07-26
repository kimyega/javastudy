package ex06_GameUnit;

public class GameUnit {
  private String name;
  private int hp;
  private boolean isAlive;
  
  
  public GameUnit() {
    
  }
  public GameUnit(String name) {
    this.name = name;
  }
  
  
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }
  public int getHp() {
    return hp;
  }
  public void setHp(int hp) {
    this.hp = hp;
    setAlive(hp > 0);
  }
  public boolean isAlive() {
    return isAlive;
  }
  private void setAlive(boolean isAlive) {
    this.isAlive = isAlive;
  }
  
  public void attack(GameUnit gameunit) {

  }

}
