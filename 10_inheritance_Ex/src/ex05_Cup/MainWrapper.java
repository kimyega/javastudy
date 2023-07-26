package ex05_Cup;

public class MainWrapper {

  public static void main(String[] args) {
    Cup cup1 = new Cup();
    Coffee c1 = new Americano();
    cup1.setCoffee(c1);
    
    Cup cup2 = new Cup();
    cup2.setCoffee(new CafeLatte());

  }

}
