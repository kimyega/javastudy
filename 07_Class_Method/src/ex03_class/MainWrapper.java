package ex03_class;

public class MainWrapper {

  public static void main(String[] args) {
    
    // Calculator 객체 만들기
    Calculator myCalc = new Calculator();
    double a = 1.5;
    double b = 1.2;
    
    System.out.println(myCalc.addition(a, b));
    System.out.println(myCalc.subtraction(a, b));
    System.out.println(myCalc.multiplication(a, b));
    System.out.println(myCalc.division(a, b));
    
   
  }

}
