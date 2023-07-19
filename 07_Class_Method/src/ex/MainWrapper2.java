package ex;

public class MainWrapper2 {
  public static void ex01(int a , int b) {
    System.out.println(a + ", " + b);
    a++;
    b++;
  }
  public static void main(String[] args) {
    int a = 10;
    int b = 20;
    ex01(a, b);

  }

}
