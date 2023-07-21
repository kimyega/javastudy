package exam;

public class MainWrapper {

  // main
  public static void main(String[] args) {
//    q1();
//    q2();
//    q3();
//    q4();
//    q5();
//    q6();
//    q7();
//    q8();
//    q9();
//    q10();
//    q11();
//    q12();
//    q13();
    q14();
    
  }
  
  // q1. 절대값 구하기
  // int number에 저장된 절대값을 계산하여 int absNumber에 저장하고 출력하시오.
  // 예시)
  // -5의 절대값은 5입니다.
  public static void q1() {
    int number = -5;
    int absNumber;
    if(number < 0) {
      absNumber = number * -1;
    }else {
      absNumber = number;
    }
    System.out.println(number + "의 절댓값은 " + absNumber + "입니다.");
  }
  
  // q2. 나이에 따른 구분하기
  // 0 ~ 7    : 미취학아동
  // 8 ~ 13   : 초등학생
  // 14 ~ 16  : 중학생
  // 17 ~ 19  : 고등학생
  // 20 ~ 100 : 성인
  // 이외값   : 잘못된 나이
  // 예시)
  // 30살은 성인입니다.
  public static void q2() {
    String strAge = "30";
    int age = Integer.parseInt(strAge);
    System.out.print(age + "살은 ");
    if(age >= 0 && age <= 7) {
      
      System.out.print("미취학아동");
    } else if(age <= 13) {
      System.out.print("초등학생");
    } else if(age <= 16) {
      System.out.print("중학생");
      
    } else if(age <= 19) {
      System.out.print("고등학생");
      
    } else if(age <= 100) {
      System.out.print("성인");
      
    } else {
      System.out.print("잘못된 나이");
    }
    System.out.print("입니다.");
  }
  
  // q3. 너비가 int width, 높이가 int height인 삼각형의 넓이를 계산하여 double area에 저장한 뒤 출력하시오.
  // 예시)
  // 너비가 3, 높이가 3인 삼각형의 넓이는 4.5입니다.
  public static void q3() {
    int width = 3;
    int height = 3;
    double area;
    area = (double)width * height * 0.5;
    System.out.println("너비가 " + width + ", 높이가 " + height + "인 삼각형의 넓이는 " + area + "입니다.");
  }
  
  // q4. int month에 저장된 월의 계절과 해당 월이 며칠까지 있는지 출력하시오.
  // 항상 2월은 28일까지만 있는 것으로 처리하시오.(윤년은 고려하지 않는다는 의미이다.) 
  // 예시1)
  // 5월은 봄입니다.
  // 5월은 31일까지 있습니다.
  // 예시2)
  // 13월은 잘못된 정보입니다.
  public static void q4() {
    int month = 5;
    String[] season = {"겨울", "봄", "여름", "가을"};
    int[] lastDay = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    
    String curSeason = season[(month % 12)/3];
    System.out.println(month + "월은 " + curSeason + "입니다.");
    int curDay = lastDay[month];
    System.out.println(month + "월은 " + curDay + "까지 있습니다.");
    if(month < 1 || month > 12) {
      System.out.println(month + "월은 잘못된 정보 입니다.");
      return;
    }
    
  }
  
  // q5. int a, b에 저장된 값 중에서 정수 10과 더 가까운 값을 출력하시오.
  // 예시)
  // 8, 11중 10과 가까운 수는 11입니다.
  public static void q5() {
    int a = 8;
    int b = 11;
    int diffA = (10 > a) ? 10 - a : a - 10;
    int diffB = (10 > b) ? 10 - b : b - 10;
    int answer = (diffA > diffB) ? b : a;
    System.out.println(a + ", " + b + "중 10과 가까운 수는 " + answer + "입니다.");
    
    
    
    
  }
  
  // q6. int money를 오만원권, 만원권, 천원권, 오백원 동전, 백원 동전, 오십원 동전, 십원 동전, 오원 동전, 일원 동전이 각각 몇 개로 변환되는지 출력하시오.
  // 예시)
  // 75832원은 다음과 같습니다.
  // 50000원 짜리 : 1개
  // 10000원 짜리 : 2개
  // 5000원 짜리 : 1개
  // 500원 짜리 : 1개
  // 100원 짜리 : 3개
  // 10원 짜리 : 3개
  // 1원 짜리 : 2개
  public static void q6() {
    int money = 75832;
    int[] unit = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
    int[] count = new int[unit.length];
    
    for(int i = 0; i < unit.length; i++) {
        count[i] = money / unit[i];
        money %= unit[i];
        if(count[i] == 0) {
          continue;
        }
      System.out.println(unit[i] + "원 짜리 : " + count[i] + "개");
       
    }
    
    
    
  }
  
  // q7. int second에 저장된 초를 시/분/초로 변환하여 출력하시오.
  // 1분이 넘는 경우 '분'까지 표시하고, 1시간이 넘는 경우 '시'까지 표시하시오.
  // 예시1)
  // 40초는 40초입니다.
  // 예시2)
  // 90초는 1분 30초입니다.
  // 예시3)
  // 3690초는 1시간 1분 30초입니다.
  public static void q7() {
    int second = 3690;
//    second % 60 = 초
    
    
    
  }
  
	// q8. int number의 첫 번째 글자가 1,3,5이면 "남자", 2,4,6이면 "여자"를 출력하시오.
	// int number의 첫 번째 글자는 항상 1 ~ 6 사이의 정수라고 가정한다.
	// 예시
	// 남자입니다.
	public static void q8() {
		int number = 1234567;
		if(number / 1000000 % 2 == 1) {
		  System.out.println("남자입니다.");
		}else {
		  System.out.println("여자입니다.");
		}
		
	}
	// 카프리카 수 판별하기
	// 2자리(10 ~ 99) 또는 4자리수(1000 ~ 9999) 대상
	// 앞 뒤로 숫자를 분리 -> 각 숫자를 더함 -> 더한 수의 제곱을 구함 -> 자신과 같은가?
	// 81 -> 8 1로 분리    ->   9            ->    9 * 9              ->  81
	
	// q9. 구구단을 모두 출력하지 말고 5 x 5 = 25까지만 출력하시오.
	// 예시
	// 2 x 1 = 2
	// 2 x 2 = 4
	// ...
	// 5 x 5 = 25
	

	
	public static void q9() {
		outer:
	  for(int n = 2; n <= 9; n++) {
		  for(int dan = 1; dan <= 9; dan++) {
		    System.out.println(n + " x " + dan + " = " + n * dan);
		    if(n == 5 && dan == 5) {
		      break outer;          // 바로 나가게 해주는 outer
		    }
		  }
		}
	  
	  
	  
	}
	
	// q10. begin부터 end 사이의 모든 정수들의 평균을 출력하시오.
	// 단, 항상 begin은 end보다 작거나 같은 상태이다.
	// 예시
	// 1부터 6사이 모든 정수의 평균은 3.5입니다.
	public static void q10() {
		int begin = 1;
		int end = 6;
		int total = 0;
		
		for(int n = begin; n <= end; n++) {
		  total += n;
		}
		System.out.println(begin + "부터 " + end + "사이 모든 정수의 평균은 " + (double)total/(end - begin + 1) + "입니다.");
		
	}
	
	// q11. 1부터 100 사이의 모든 3의 배수를 더한 결과를 출력하시오.
	// 예시
	// 모든 3의 배수 합은 1683입니다.
	public static void q11() {
		int total = 0;
		
		for(int n = 1; 3 * n < 100; n++) {
		  total += 3 * n;
		}
		System.out.println("모든 3의 배수의 합은 " + total + "입니다.");
		
	}
	
	// q12. 배열에 저장된 모든 정수를 모두 더하시오.
	// 단, 0보다 작은 값은 더하지 마시오.
	// 예시
	// 합계는 6입니다.
	public static void q12() {
		int total = 0;
		int[] a = {1, -1, -2, 2, 3, -3};
		
		for(int i = 0; i < a.length; i++) {
		  if(a[i] < 0) {
		    continue;
		  }
		  total += a[i];
		}
		System.out.println("합계는 " + total + "입니다.");
		
	}
	
	// q13. 제시된 배열 a에 상수 TARGET과 동일한 문자가 몇 개 포함되어 있는지 갯수를 구해서 출력하시오.
	// 예시
	// 배열에 포함된 h는 2개입니다.
	public static void q13() {
		final char TARGET = 'h';
		char[] a = {'a', 'h', 'e', 'h', 'p'};
		int total = 0;
		for(int i = 0; i < a.length; i++) {
		  if(TARGET == a[i]) {
		    total += 1; 
		  }
		}
		System.out.println("배열에 포함된 " + TARGET + "는 " + total + "개입니다.");
		
		
	}
	
	// q14. 점수에 따라 가져갈 수 있는 모든 사은품을 출력하시오.
	// 점수가 60점 이상인 경우 : "행주"
	// 점수가 70점 이상인 경우 : "행주도마"
	// 점수가 80점 이상인 경우 : "행주도마식칼"
	// 점수가 90점 이상인 경우 : "행주도마식칼냄비"
	// 예시
	// 행주도마
	public static void q14() {
		String strScore = "75";
		String[] a = {"행주", "도마", "식칼", "냄비"};
		for(int i = 0; i < a.length ; i++) {
		  System.out.print(a[i]);
		}
	}

}
