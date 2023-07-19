package ex04_field;

/**
 *  사칙연산 계산기
 * 
 * @author 김예가
 * @since 2023.07.19
 * @version 1.0.0
 */
public class AccCalculator {
  /*
   * 필드
   * 1. 객체가 가질 수 있는 값을 저장할 변수
   * 2. 클래스에서 선언
   * 3. 필드는 자동으로 초기화된다.
   * 4. 정보 은닉을 위해서 private 처리한다.
   */
  
  /**
   *  이 필드는 AccCalculator의 사칙연산 결과를<br>저장할 수 있는 필드이다.
   */
  private double value;
  
  /**
   *  합 계산기
   * 
   * @param a 실수
   * @return 누적 합계
   */
  public void addition(double a) {
    value += a;
    System.out.println("+ " + a + " = " + value);
  }
  /**
   *  빼기 계산기
   * 
   * @param a 실수
   * @return 누적차
   */
  public void substraction(double a) {
    value -= a;
    System.out.println("- " + a + " = " + value);
  }
  /**
   *  곱하기 계산기
   *  
   * @param a 실수
   * @return 누적곱
   */
  public void multiplication(double a) {
    value *= a;
    System.out.println("* " + a + " = " + value);
  }
  /**
   *  나눗셈 계산기
   * 
   * @param a 실수
   * @return 누적 나눗셈
   */
  public void division(double a) {
    value /= a;
    System.out.println("/ " + a + " = " + value);
  }
  public void showValue() {
    System.out.println(value);
  }
}
