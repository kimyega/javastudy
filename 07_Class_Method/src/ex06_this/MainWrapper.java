package ex06_this;

public class MainWrapper {

  public static void main(String[] args) {
    ChainCalculator myCalc = new ChainCalculator();
    
    // 객체 자체는 참조값이다.
    System.out.println(myCalc);
    
//    myCalc.printThis();         // 참조값이 같다.
//    myCalc.addition(3).addition(2); // myCalc.addition 3실행후 2실행
    
    myCalc.on().addition(3).substraction(2).multiplication(5).division(2).done();
    
    
    
    
    
    
  }

}
