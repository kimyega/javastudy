package ex02_Coffee;

public class Cup {
  private Coffee coffee;
  
  public Cup() {
    
  }
  public Cup(Coffee coffee) {
    super();
    this.coffee = coffee;
  }

  public Coffee getCoffee() {
    return coffee;
  }

  public void setCoffee(Coffee coffee) {
    this.coffee = coffee;
  }
  @Override
  public String toString() {
    return "Cup [커피: " + coffee + "]";
  }
  
  
}
