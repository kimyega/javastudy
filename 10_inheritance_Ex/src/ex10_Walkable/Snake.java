package ex10_Walkable;

public class Snake extends Animal{

  public Snake(String name) {
    super(name);
  }

  @Override
  public String toString() {
    return getName();
  }
  
  
}
