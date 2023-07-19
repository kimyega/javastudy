package ex04_field;

public class MainWrapper {

  public static void main(String[] args) {
   AccCalculator myAcc = new AccCalculator();
   myAcc.showValue();
   myAcc.addition(3);
   myAcc.showValue();
   myAcc.division(3);
   myAcc.showValue();
   myAcc.multiplication(5);
   myAcc.showValue();
  }

}
