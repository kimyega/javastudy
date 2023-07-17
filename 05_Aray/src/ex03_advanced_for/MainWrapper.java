package ex03_advanced_for;

import java.util.Arrays;

public class MainWrapper {
  public static void ex01() {
    // 1차원 배열의 advanced - for 문
    int[] a = {10, 20, 30};
    
//    for(배열요소를 저장할 변수 : 배열명) {
//      }
    for(int number : a) {
      System.out.print(String.format("%4d", number));
    }
  }
  public static void ex02() {
   // advanced-for문을 사용하지 못하는 대표적인 경우 : 배열요소의 값이 변하는 경우 
    int[] a = {10, 20, 30};
    
    //모든 배열요소를 1씩 증가시키기
//    for(int number : a) {
//      number++;
//    }
//    System.out.println(Arrays.toString(a));     // [11, 21, 31] 으로 변하지 않는다.
//    }
    
    // 일반 for문
    for(int i = 0; i < a.length; i++) {
      a[i]++;
    }
    }
  public static void ex03() {
   // 2차원 배열의 advanced-for문
    int[][] a = {
       {10, 20},
       {30, 40},
       {50, 60}
   };
   for(int[] b : a) {
     for(int number : b) {
       System.out.print(String.format("%4d", number));
     }
     System.out.println();
   }
  }
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
  }

}
