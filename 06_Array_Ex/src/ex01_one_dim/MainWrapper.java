package ex01_one_dim;

import java.util.Arrays;

public class MainWrapper {
  public static void ex01() {
    // 월에 따른 계절    월 % 12
    // 3 ~ 5 : 봄        3 ~ 5
    // 6 ~ 8 : 여름      6 ~ 8
    // 9 ~ 11: 가을      9 ~ 11
    // 12 ~ 2: 겨울      0 ~ 2
    int month = 1;
    String[] seasons = {"겨울", "봄", "여름", "가을"};
    // 코드 1줄로 해결할 것
    System.out.println(seasons[(month % 12) / 3]);
    
  }
  
  public static void ex02() {
    // 10, 20, 30, 40, 50을 배열 a에 저장하고 출력하기
    // 배열 a: [10, 20, 30, 40, 50]
    int[] a = new int[5];
    // 배열과 인덱스 외 변수 사용 금지
    for(int i = 0; i < a.length; i++) {
     a[i] = (i + 1) * 10;  
    }
    System.out.println("배열 a: " + Arrays.toString(a));
    
  }
  
  public static void ex03() {
    // 'A', 'B', 'C', ...'Z'를 배열 a에 저장하고 출력하기
    // 배열 a: [A, B, C, D, E, F, G, H, I, J, K, L, M, N, O, P, Q, R, S, T, U, V, W, X, Y, Z]
    char[] a = new char[26];
    char ch = 'A';
    for(int i = 0; i < a.length; i++) {
      a[i] = ch++;
    }
    System.out.println("배열 a: " + Arrays.toString(a));
  }
  
  public static void ex04() {
    // 배열 a의 마지막 3개 요소 0을 배열 b의 요소로 바꾸기
    // 배열 a: [10, 20, 30, 40, 50, 60]
    int[] a = {10, 20, 30, 0, 0, 0};
    int[] b = {40, 50, 60};
    
    System.arraycopy(b, 0, a, 3, b.length);    // b배열 인덱스 0부터 를 a배열 인덱스 3부터 로 b.length 만크 복사해주는 함수.0
//    for(int i = 0; i < b.length; i++) {
//        a[i + 3] = b[i];
//    }
    System.out.println("배열 a: " + Arrays.toString(a));
  }
  
  public static void ex05() {
    // 10진수(int number)를 2진수(int[] binary)로 변환하기
    // 10진수 35 = 2진수 0000100011
    int number = 35;             //  35를 2진수로 변환하면 아래와 같다.
                                 // ┌------------------------------------------------┐
    int[] binary = new int[10];  // │ 0 │ 0 │ 0 │ 0 │ 1 │ 0 │ 0 │ 0 │ 1 │ 1 │
                                 // └------------------------------------------------┘
    System.out.print("10진수 " + number + " = 2진수 "); 
    
    for(int i = 0; i < binary.length; i++) {
      binary[binary.length - 1 - i] = number % 2;
      number /= 2;
    }
    for(int b : binary) {
      System.out.print(String.format("%d", b));
    }
   
  }
  
  public static void ex06() {
    // 배열에 저장된 점수의 평균, 최댓값, 최솟값 구하기
    // 평균: 84.8점
    // 최대: 100점
    // 최소: 70점
    String[] name = {"윤아", "태연", "지민", "강호", "민지"};
    int top = 0;
    int bottom = 0;
    int[] score = {100, 70, 95, 83, 76};
    int total = score[0];  // 합계(평균을 구할 때 필요한 변수)
    int max = score[0];  // 최댓값
    int min = score[0];  // 최솟값
    
    for(int i = 1; i < score.length; i++) {
      total += score[i];
      if(score[i] > max) {
        max = score[i];
        top = i;
      }
      if(score[i] < min) {
        min = score[i];
        bottom = i;
      }
      
      }
     
    
    System.out.println("평균: " + (double)total / score.length + "점");
    System.out.println("최대: " + max + "점");
    System.out.println("최소: " + min + "점");
    System.out.println("1등 : " + name[top] + " " + max + "점");
    System.out.println("꼴등: " + name[bottom] + " " + min + "점");
    
  }
  public static void main(String[] args) {
//   ex01();
//   ex02();
//   ex03();
//   ex04();
//   ex05();
   ex06();
   

  }

}
