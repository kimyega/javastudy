package ex02_random;

import java.util.Random;

public class Ex02_Random {

  public static void main(String[] args) {
    
    /*
     *  java.util.Random 클래스
     *  1. 전달된 시드(seed)에 따라 서로 다른 난수를 발생한다.
     *  2. 전달된 시드(seed)가 없는 경우 현재 시간을 시드(seed)로 사용한다.
     *  3. 동일한 시드(seed)를 사용하면 동일한 난수가 발생한다.
     */
    
    // Random 객체 선언 생성
    Random random = new Random();
    
    // 실수 0.0 <= n < 1.0
    double randomNumber1 = random.nextDouble();
    
    // 정수 Integer.MIN_VALUE <= n <= Integer.MAX_VALUE
    int randomNumber2 = random.nextInt();
    
    //  0 ~ 4 5개의 난수
    int randomNumber3 = random.nextInt(5);
    
    System.out.println(randomNumber1);
    System.out.println(randomNumber2);
    System.out.println(randomNumber3);
  }

}
