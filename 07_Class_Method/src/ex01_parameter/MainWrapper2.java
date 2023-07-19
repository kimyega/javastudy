package ex01_parameter;

public class MainWrapper2 {

  
  public static void main(String[] args) {
   print(10);
   print(10, 20);
   print(10, 20, 30);

  }

  public static void print(int...a) {   // 말 줄임표 ... = 배열
    for(int b : a) {
      System.out.println(b);
    }
  }
}
