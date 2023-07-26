package ex09_Eatable;

public class Person {
  private Food food;
  private Eatable eatable;
  public void eatEvrything(Food food) {
    System.out.println(food + "먹는다.");
  }
  public void eatPossible(Eatable eatable) {
    System.out.println(eatable + "못먹는다.");
  }
}
