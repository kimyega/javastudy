package ex05_Cup;

public class Cup {
  private Coffee coffee;
  
  public Cup() {
    
  }
  public Coffee getCoffee() {
    return coffee;
  }
  public void setCoffee(Coffee coffee) {
    this.coffee = coffee;
  }
  public Cup(Coffee coffee) {
    this.coffee = coffee;
  }
}
