package ex10_Walkable;

public class Person {
  private Animal animal;
  private String feed;
  private Walkable walkable;
  
  public void foodFeed(Animal animal, String feed) {
    System.out.println(animal + "에게 " + feed + "주기");
  }
  
  public void walk(Walkable walkable) {
    System.out.println(walkable+ "와 산책하기");
  }
}
