package ex02_finally;

import java.util.Scanner;

public class MainWrapper {

  /*   finally 블록
   * 1. try - catch 문의 마지막 블록으로 추가할 수 있다. 생략 가능
   * 2. 예외 발생 여부와 상관 없이 "항상 마지막"에 실행된다.
   */
  
  public static void main(String[] args) {
    
    // try 블록과 finally 블록에서 모두 사용할 수 있도록 scope 조정
    Scanner sc = new Scanner(System.in);
    try {
    System.out.println("몇살인가요?");
    int age = sc.nextInt();
    System.out.println(age >= 20 ? "주류 구매 가능" : "주류 구매 불가능");
    }catch(Exception e) {
      System.out.println("나이를 정확히 입력해 주세요.");
    } finally {
      sc.close(); // finally는 주로 자원 반납용으로 사용한다.
      
    }
  }

}
