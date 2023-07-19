package kr.co.gdu;

/**
 * 
 * 덧셈, 뺄셈, 곱셈, 나눗셈 기능계산기
 * 
 * @author 김예가
 * @since 2023.07.19
 * @version 1.0.0
 */
    // /** 엔터로 자바독
public class Calculator { // 커서대면 클래스 정보가 나온다.
  
  /**
   *  실수 2개를 받아서 합반환 메소드
   *  
   * @param a 실수
   * @param b 실수
   * @return 파라미터들의 합
   */
  public double addition(double a, double b) {
    return a + b;
  }
  
  /**
   *  실수 2개를 받아서 뺄셈 반환 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터들의 차
   */
  public double subtraction(double a, double b) {
    return a - b;
  }
  
  /**
   *  실수 2개를 받아서 곱셈 반환 메소드
   * 
   * @param a 실수
   * @param b 실수
   * @return 파라미터들의 곱
   */
  public double multiplication(double a, double b) {
    return a * b;
  }
  /**
   *  실수 2개를 받아서 나눗셈 반환 메소드
   *  
   * @param a 실수
   * @param b 실수
   * @return 파라미터들의 나눗셈
   */
  public double division(double a, double b) {
    return a / b;
  }
  /**
   *  정수 2개를 받아서 나머지 반환 메소드
   *  
   * @param a 정수
   * @param b 정수
   * @return 파라미터들을 나눈값의 나머지
   */
  public int remainder(int a, int b) {
    return a % b;
  }
  /**
   *  정수 2개를 받아서 몫 반환 메소드
   *  
   * @param a 정수
   * @param b 정수
   * @return 파라미터들을 나눈값의 몫
   */
  public int quotient(int a, int b) {
    return a / b;
  }
  
}
