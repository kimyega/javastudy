package ex03_class;

public class MainWrapper {

  public static void main(String[] args) {
    
    // Calculator 객체 만들기
    Calculator myCalc = new Calculator(); // 객체 생성 메소드는 자바가 직접 만든다. (생성자)
    
    double a = 1.5;
    double b = 1.2;
    
    System.out.println(myCalc.addition(a, b));
    System.out.println(myCalc.subtraction(a, b));
    System.out.println(myCalc.multiplication(a, b));
    System.out.println(myCalc.division(a, b));
    
   
  }

}
