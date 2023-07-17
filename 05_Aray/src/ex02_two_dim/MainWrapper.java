package ex02_two_dim;

public class MainWrapper {
  /*
   *  2차원 배열 
   *  1. 1차원 배열이 2개 이상 모인 자료 구조이다.
   *  2. 행과 열의 집합인 테이블 구조로 이해하면 쉽다.
   *  3. 사용하는 인덱스가 2개이다.
   *  4. 2차원 배열의 순회에는 2개의 for문이 필요하다.
   */
  public static void ex01() {
    // 2차원 배열의 선언
    int[][] a;
    // 2차원 배열의 생성
    a = new int[3][2]; // 3행 2열 (길이가 2인 1차원 배열 3개)
    // 테이블 형태로 2차원 배열 출력
    System.out.println(a[0][0] + " " + a[0][1]);  // 1번째 1차원 배열
    System.out.println(a[1][0] + " " + a[1][1]);  // 2번째 1차원 배열
    System.out.println(a[2][0] + " " + a[2][1]);  // 3번째 1차원 배열
    
  }
  public static void ex02() {
    int[][] a = new int[3][2];
    System.out.print(String.format("%4d", a[0][0]));
    System.out.println(String.format("%4d", a[0][1]));
    System.out.print(String.format("%4d", a[1][0]));
    System.out.println(String.format("%4d", a[1][1]));
    System.out.print(String.format("%4d", a[2][0]));
    System.out.println(String.format("%4d", a[2][1]));
    
    
  }
  public static void ex03() {
    // i : 행    1차원 배열 갯수
    // j : 열 각 1차원 배열 길이
    int[][] a = new int[3][2];
    for(int i = 0; i < 3;i++ ) {
      for(int j = 0; j < 2;j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }
  /*
   * 2차원 배열의 초기화
   * int[][] a = {
   *  {10, 20},
   *  {30, 40},
   *  {50, 60}
   *  };
   */
  public static void ex04() {
    // 2차원 배열의 초기화
    int[][]  a  = {
        {10, 20},
        {30, 40},
        {50, 60}
    };
    for(int i = 0; i < 3; i++) {
      for(int j = 0; j < 2; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }
  
  /*
   *  2차원 배열의 구조
   *  
   */
  public static void ex05() {
    int[][]  a  = {
        {10, 20},
        {30, 40},
        {50, 60}
    };
    // * 파이널 버전 *
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }
  public static void ex06() {
    // 모든 열의 갯수가 동일할 필요는 없다. java는 가능.
    
    int[][] a = {
        {10},
        {10, 30},
        {40,50,60}
    };
    for(int i = 0; i < a.length; i++) {
      for(int j = 0; j < a[i].length; j++) {
        System.out.print(String.format("%4d", a[i][j]));
      }
      System.out.println();
    }
  }
  
  
  public static void main(String[] args) {
//  ex01();
//  ex02();
//    ex03();
//   ex04();
//    ex05();
    ex06();
  }

}
