package ex03_date_time;

public class Ex01_System {

  public static void ex01() {
    /*
     * Timestamp(타임스탬프)
     * 1. 현재 시간을 long 타입의 값으로 가지고 있는데 그걸 타임스탬프라고 한다.
     * 2. 1970년 1월 1일 0시부터 1/1000 초마다 1씩 증가하고 있는 값이다.
     */
    
    long timestamp = System.currentTimeMillis();
    System.out.println(timestamp);
    System.out.println(Long.MAX_VALUE);
  }
  
  public static void ex02() {
    
    /*
     * 시간 단위 
     * 
     * second > ㎳(밀리 세컨드) > ㎲(마이크로 세컨드) > ㎱(나노 세컨드) > ㎰(피코 세컨드) 
     *          10^-3               10^-6                 10^-9             10^-12
     *          currentTimeMillis()                     nanoTime()
     */
    
    // 나노초
    // 어떤 작업 수행시간을 정밀하게 계산할 때 사용하는 시간
    
    String s1 = "";
    StringBuilder s2 = new StringBuilder();
    
    long start = System.nanoTime();
    for(char ch = 'A'; ch <= 'Z'; ch++) {
//      s1 += ch;         //56399㎱ (String의 + 연산)
        s2.append(ch);    // 7701㎱ (StringBuilder의 append 메소드)
    }
    long end = System.nanoTime();
    
    System.out.println("수행시간: " + (end - start) + "㎱");
  }
  public static void main(String[] args) {
//    ex01();
    ex02();
    
  }

}
