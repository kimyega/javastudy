package ex02_convert_type;

public class MainWrapper {

	public static void main(String[] args) {
		/*
		 * 자동 변환 (promotion)
		 * 1. 작은 크기 -> 	큰 크기
		 * 2. 정수		->	 실수
		 */

		byte num1 = 127;
		int  num2 = num1;
		System.out.println(num2);
		
		double addResult = 1.5 + 5;
	    System.out.println(addResult);
	    /*
	     * 강제 변환 (casting)
	     * 1. 큰 크기 -> 작은 크기
	     * 2. 실수	  -> 정수
	     */
	    int bigNum = 256;
	    byte smallNum = (byte)bigNum;
	    System.out.println(smallNum);		// 정보 훼손 가능
	    
	    double pct = 0.5;
	    int iPct = (int)pct;
	    System.out.println(iPct);
	    
	    /*
	     * 구문 분석 (parsing)
	     * 1. 문자열 -> 정수 (int, long)
	     * 2. 문자열 -> 실수 (double)
	     */
	    String strScore = "100";
	    int score = Integer.parseInt(strScore);
	    
	    String strMoney = "10000000000";
	    long money = Long.parseLong(strMoney);
	    
	    String strComm = "0.5";
	    double comm = Double.parseDouble(strComm);
	    
	    System.out.println(score);		// 컨트롤 + 알트 + 방향키 위 or 아래 = 복사됨
	    System.out.println(money);
	    System.out.println(comm);
	    
	    String chrNum = "54";
	    int number = Integer.parseInt(chrNum);
	    
	    String chrDoll = "359305930859530";
	    long dollar = Long.parseLong(chrDoll);
	    
	    String chrPro = "24.6";
	    double progress = Double.parseDouble(chrPro);
	    
	    System.out.println(number);
	    System.out.println(dollar);
	    System.out.println(progress);
	    
	    
	    
	}

}
