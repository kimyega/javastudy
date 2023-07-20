package ex06_this;

/*
 * this
 * 1. 필드나 메소드를 호출하는 객체의 참조값.
 * 2. 클래스 내부에서만 사용할 수 있는 키워드.
 * 3. this.으로 필드를 매개변수와 구분지을 수 있다.
 */


/**
 *  <p>메소드를 연속해서 호출할 수 있는 메소드 체이닝(method chaining)이 가능한 계산기</p>
 *  <p>사칙연산 메소드를 연속해서 호출할 수 있다.</p> 
 * @author 김예가
 * @since 2023.07.20
 * @version 1.0
 */

// <p> ~ </p>줄바꿈 태그
public class ChainCalculator {
  /**
   * 사칙연산 결과
   */
  private double value;
  
  public void printThis() {
    System.out.println("현재 객체(printThis를 호출한 객체)의 참조값: " + this);
  }
  
  // Setter
  public void setValue(double value) {
    this.value = value;
  }
  // Getter
  public double getValue() {
    return value;
  }
  
  public ChainCalculator addition(double a) {
    value += a;
    System.out.print(" + " + a);
    return this;
  }
  public ChainCalculator substraction(double a) {
    value -= a;
    System.out.print(" - " + a);
    return this;
  }
  public ChainCalculator multiplication(double a) {
    value *= a;
    System.out.print(" * " + a);
    return this;
  }
  public ChainCalculator division(double a) {
    value /= a;
    System.out.print(" / " + a);
    return this;
  }
  public ChainCalculator on() {
    System.out.print(value);
    return this;
  }
  public ChainCalculator done() {
    System.out.print(" = " + value);
    return this;
  }
  
}
