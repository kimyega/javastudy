package ex03_operator;

public class MainWrapper {
	// ex01 메소드 만들기 (메소드 정의)
	
	public static void ex01() {
		
//		정수 연산
		int a = 5;
		int b = 2;
		int add = a + b;
		int sub = a - b;
		int mul = a * b;
		int mok = a / b;			// 몫
		int mod = a % b;			// 나머지
		System.out.println("a + b = " + add);
		System.out.println("a - b = " + sub);
		System.out.println("a * b = " + mul);
		System.out.println("a / b = " + mok);
		System.out.println("a % b = " + mod);
		
//		실수 연산
		double x = 5;
		double y = 2;
		double addResult = x + y;
		double subResult = x - y;
		double mulResult = x * y;
		double modResult = x % y;
		double divResult = x / y;	// 나누기
		
		System.out.println("x + y = " + addResult);
		System.out.println("x - y = " + subResult);
		System.out.println("x * y = " + mulResult);
		System.out.println("x % y = " + modResult);
		System.out.println("x / y = " + divResult);
		
		int i = 5;
		int j = 2;
		double result = (double) i / j;
		System.out.println("5 나누기 2 = " + result);
		
		
	}

	// ex02 메소드 정의 
	public static void ex02() {

//		증감 연산 (++, --)
		
		
//		전위 연산 (먼저 증감)
		int a = 10;
		System.out.println("++a = " + ++a);	// a를 증가후 출력
//		후위 연산 (나중에 증감)		
		int b = 10;
		System.out.println("b++ = " + b++); 	// b를 출력후 증가
		System.out.println("b = " + b);
	}
	// ex03 메소드 정의 
	public static void ex03() {
//		대입 연산
		int a = 10;
		int b = a;
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		
//		복합 연산 (복합 대입 연산)
		int x = 10;
		int y = 1;
		y += x;			// y = y + x
		System.out.println("y = " + y);
		System.out.println("x = " + x);
	}	
	// ex04 메소드 정의
	public static void ex04() {
//		관계 연산 (크기 비교)
		int a = 3;
		int b = 5;
		
		boolean result1 = a > b;
		boolean result2 = a >= b;
		boolean result3 = a < b;
		boolean result4 = a <= b;
		boolean result5 = a == b;
		boolean result6 = a != b;
		
		System.out.println("a >  b = " + result1);
		System.out.println("a >= b = " + result2);
		System.out.println("a <  b = " + result3);
		System.out.println("a <= b = " + result4);
		System.out.println("a == b = " + result5);
		System.out.println("a != b = " + result6);
		System.out.println();
//		논리연산
//		1. 논리 AND : && , 모든 조건이 만족하면 true 아니면 false
//		2. 논리 OR  : || , 하나의 조건이라도 만족하면 true 아니면 false
//		3. 논리 NOT : !  , 조건결과가 true 이면 false 조건결과가 false 이면 true
		int x = 10;
		int y = 20;
		boolean andResult =  (x == 10) && (y == 10);
		boolean orResult  =  (x == 10) || (y == 10);
		boolean notResult = !(x == 10);
		
		System.out.println(" (x == 10) && (y == 10) = " + andResult);
		System.out.println(" (x == 10) || (y == 10) = " + orResult);
		System.out.println("!(x == 10) = " + notResult);
		System.out.println();
//		Short Circut Evaluation
//		1. 논리 AND : 결과가 false인 조건이 나타나면 더 이상 조건을 체크하지 않는다. 최종결과가 false로 정해졌기 때문이다.
//		2. 논리 OR  : 결과가 true인 조건이 나타나면 더 이상 조건을 체크하지 않는다. 최종결과가 true로 정해졌기 때문이다.
		int i = 10;
		int j = 10;
		
		boolean andSceResult = (++i == 10) && (++j == 10);
		
		System.out.println(" (++i == 10) && (++j == 10) = " + andSceResult);
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		System.out.println();
		
		boolean orSceResult = (j++ == 10) || (i++ == 10);
		System.out.println(" (j++ == 10) || (i++ == 10) = " + orSceResult);
		System.out.println(" i = " + i);
		System.out.println(" j = " + j);
		
		
	}
	// ex05 메소드 정의
	public static void ex05() {
//		조건 연산자(3개의 항을 사용하므로 삼항 연산이라고도 한다.)
//		조건식 ? true인 경우 결과 : false인 경우 결과
		
		int score = 100;
		
		String result = (score >= 60) ? "합격" : "불합격";
		System.out.println("합격 여부 : " + result);

	}
	// ex06 메소드 정의
	public static void ex06() {
//		문자열 연결
		String str1 = "구디" + "아카데미";
		String str2 = 4 + "달라";
		String str3 = 1 + 2 + "번지";
		
//		정수 -> 문자열
//		실수 -> 문자열
		String str4 = 100 + "";	// 빈 문자열 ("")을 더해주면 된다.
		String str5 = 1.5 + "";
//		참고. 문자열로 변환하는 메소드가 있다.
		String str6 = String.valueOf(100);
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str5);
		System.out.println(str6);
		
	}
	
	public static void main(String[] args) {
	// ex01 메소드 실행 부탁 (메소드 호출)	
//		ex01();		// 먼저 실행
//		ex02();		// 메소드 호출
//		ex03();
//		ex04();
//		ex05();
		ex06();
	}

}
