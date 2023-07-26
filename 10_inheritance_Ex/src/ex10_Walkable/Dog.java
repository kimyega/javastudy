package ex10_Walkable;

public class Dog extends Animal implements Walkable{

  public Dog(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return getName();
  }

  

  
  
}
