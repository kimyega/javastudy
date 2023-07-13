package ex;

public class MainWrapper {

	public static void main(String[] args) {
		// 초 -> 분/초
	    int second = 90;
	    int m = second / 60;  // 1
	    int s = second % 60;  // 30
	    System.out.println("분/초 : " + m + "/" + s);
	    
	    // x와 y값을 교환
	    int x = 10;
	    int y = 20;
	    int temp = x;
	    x = y;
	    y = temp;
	    System.out.println("x : " + x);
	    System.out.println("y : " + y);
	    
//	    
//	    // 5% 이자는 얼마?(소수 이하는 버림)
	    long balance = 123456L;  // 통장잔액
	    double pct = 0.05;  // 5%
	    long inter = (long)++pct * balance;		// pct타입이 double로 안맞기때문에 강제타입 변환시켜줘야 한다.
	    int Inter = (int)inter;
	    System.out.println("5% 이자후 통장잔액 : " + Inter);
	    
	    
//	    // 90점대 점수이면 true, 아니면 false
	    int score1 = 95;
	    double result1 = score1 / 10;  // true
	    int score2 = 75;
	    double result2 = score2 / 10;  // false
	    
	    boolean TrFa1 = result1 == 9;
	    boolean TrFa2 = result2 == 9;
	    System.out.println("90점대 점수 여부:" + TrFa1);
	    System.out.println("90점대 점수 여부:" + TrFa2);
	    

//	    // n의 "짝수", "홀수" 여부 출력
	    int n = 3;
	    String res1 = (n % 2 == 0) ? "짝수" : "홀수";  // "홀수"
	    System.out.println("숫자의 짝수홀수 여부 : " + res1);

//	    // num의 "짝수", "홀수", "3의배수" 여부 출력
	    int num = 0;
	    String res2 = (num % 2 == 0) ? "짝수" : "홀수";
	    String res3 = (num % 3 == 0) ? "3의 배수" : "3의배수가 아니다" ;  // "3의배수"
	    System.out.println("숫자 "+ num + "은(는) " + res2 + "입니다.");
	    System.out.println("숫자 "+ num + "은(는) " + res3 + "입니다.");
	    // 0의 배수도 고려해서 만든다.
	    
	    String res4 =  (num != 0) && (num % 3 == 0) ? "3의 배수" : ((num % 2 == 0) ? "짝수" :"홀수") ;
	    
	    System.out.println(res4);
	    
	
	
	}

}
