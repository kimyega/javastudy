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
		double result = (double)i / j;
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
		
	}

	public static void main(String[] args) {
	// ex01 메소드 실행 부탁 (메소드 호출)	
//		ex01();		// 먼저 실행
//		ex02();		// 메소드 호출
//		ex03();
		ex04();
	}

}
