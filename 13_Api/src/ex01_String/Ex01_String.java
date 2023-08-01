package ex01_String;

public class Ex01_String {

  public static void ex01() {
    
    // 문자열 리터럴
    // 표현 방법 : 큰 따옴표로 문자를 묶는다.
    String name1 = "tom";
    String name2 = "tom";
    // 문자열 리터럴은 Java에 의해서 최적화되기 때문에 
    // 동일한 리터럴이 2번 이상 나타나면 기존 리터럴을 재사용한다.
    
    
    // 문자열 리터럴 비교
    // name1과 name2의 참조값이 동일하다.
    boolean isEqual = name1 == name2;
    System.out.println(isEqual);
  }
  
  public static void ex02() {
    
    // 문자열 객체 
    String name1 = new String("tom");
    String name2 = new String("tom");
//    문자열 객체는 항상 새로 생성된다.
    
//    문자열 객체 비교
//    name1과 name2의 참조값이 다르다.
    boolean isEqual = name1 == name2;
    System.out.println(isEqual);
  }
  
  public static void ex03() {

    
    // equals 메소드
    // 문자열이 동일하면 true 아니면 false
    
    String name1 = new String("tom");
    String name2 = new String("tom");
    String name3 = new String("Tom");
    
    
    boolean isEqual = name1.equals(name2);
    System.out.println(isEqual);
    
    // 대소문자도 일치해야 동일한 문자열로 인식한다.
    boolean isEqual2 = name1.equals(name3);
    System.out.println(isEqual2);
    
    // 대소문자를 무시하고 문자열을 비교한다.
    boolean isEqaul3 = name1.equalsIgnoreCase(name3);
    System.out.println(isEqaul3);
  }
  
  public static void ex04() {
    
    // toUpperCase 메소드 : 모두 대문자로 변환
    // toLowerCase 메소드 : 모두 소문자로 변환

    String name = "Tom";
    
    System.out.println(name.toUpperCase());
    System.out.println(name.toLowerCase());
    
  }
  
  public static void ex05() {
    
    // length 메소드 : 문자열의 길이를 반환
    String name = "Tom cruise\n";
    int length = name.length();
    System.out.println(length);
  }
  
  public static void ex06() {
    
    // charAt 메소드
    // 문자열의 특정 인덱스의 문자를 반환
    
    String name = "tom";
    System.out.println(name.charAt(0));
    System.out.println(name.charAt(1));
    System.out.println(name.charAt(2));
  }
  
  public static void ex07() {
    
    // substring 메소드
    // 문자열의 일부 문자열을 반환
    
    // substring 사용법
    // 1. substring(int begin) : 인덱스 begin부터 끝까지 반환
    // 2. substring(int begin, int end) : 인덱스 begin부터 end 이전까지 반환(begin <= x <end )
    
    String name  = "tom cruise";
    String firstName = name.substring(0, 3);
    String lastName = name.substring(4);
    
    System.out.println(firstName);
    System.out.println(lastName);
  }
  
  public static void ex08() {
    
    // indexOf 메소드
    // 1. 특정 문자열의 인덱스를 반환
    // 2. 특정 문자열이 2개 이상 존재하는 경우 발견된 첫 번째 문자열의 인덱스를 반환
    // 3. 발견되지 않으면 -1을 반환
    
    // indexzOf 사용법
    // 1. indexOf(Stirng str) : 인덱스 0부터 str을 검색
    // 2. indexOf(String str, int index) : 인덱스 index 부터 str을 검색
    
    String statement = "걱정한다고 걱정이 없어지면 걱정이 없겠네";
    
    int idx1 = statement.indexOf("걱정");
    int idx2 = statement.indexOf("걱정", idx1 + 1);
    int idx3 = statement.indexOf("걱정", idx2 + 1);
    int idx4 = statement.indexOf("tom");
    
    System.out.println(idx1);
    System.out.println(idx2);
    System.out.println(idx3);
    System.out.println(idx4);
    
  }
  
  public static void ex09() {
  
    // lastIndexOf 메소드
    // 1. 발견된 마지막 문자열의 인덱스를 반환
    // 2. 나머지 특징은 indexOf와 동일함
    
    String statement = "걱정한다고 걱정이 없어지면 걱정이 없겠네";
    int idx = statement.lastIndexOf("걱정");
    System.out.println(idx);
  }
  
  public static void ex10() {
    
    // contains 메소드 
    // 지정된 CharSequence(String, char[] 등)가 포함되어 있으면 true 반환 아니면 false
    
    String email = "admin@naver.com";
    
    // @가 포함되어 있는가?
    if(email.contains("@")) {
      System.out.println("@가 포함되어 있다.");
    }else {
      System.out.println("@가 포함되어 있지 않다.");
      
    }
   
  }
  
  public static void ex11() {
    
    // isEmpty 메소드
    // 1. 빈 문자열이면 true 반환 아니면 false
    // 2. 빈 문자열 : "" 처럼 문자열의 길이가 0인 문자열
    
    String name = " ";
    if(name.isEmpty()) {
      System.out.println("이름이 없다.");
    }else {
      System.out.println("이름이 있다.");
    }
    
    // isBlank 메소드
    // 1. 빈 문자열이거나, 공백 문자러 구성되었다면 true 아니면 false
    // 2. JDK 11 이후 버전에서 사용 가능
    if(name.isBlank()) {
      System.out.println("이름이 없다.");
    }else {
      System.out.println("이름이 있다.");
    }
  }
  
  public static void ex12() {
    
    // format 메소드
    // 1. 문자열을 지정한 형식으로 반환
    // 2. 클래스 메소드이므로 String 클래스를 이용해서 호출함
    
    // 숫자형식
    
    int number = 100;
    
    // 8진수로 표시
    System.out.println(String.format("%o", number));
    // 10진수로 표시
    System.out.println(String.format("%d", number));
    // 16진수로 표시 (0 ~ 9, a ~ f)
    System.out.println(String.format("x", number));
    // 16진수로 표시 (0 ~ 9, A ~ F)
    System.out.println(String.format("X", number));
    
    // 문자열 형식
    // %s : 문자열로 표시
    String str = "hello";
    System.out.println(String.format("%s", str));
    
    // 출력폭 조정
    // 5자리 10진수로 표시, 오른쪽 정렬 처리
    System.out.println(String.format("%5d", number));
    // 5자리 10진수로 표시, 왼쪽 정렬 처리
    System.out.println(String.format("%-5d", number));
    
    // 5자리 10진수로 표시, 오른쪽 정렬 처리, 빈자리를 0으로 채움
    System.out.println(String.format("%05d", number));
    
    // 10자리 문자열 표시, 문자열 오른쪽 정렬 처리
    System.out.println(String.format("%10s", str));
    
    // 10자리 문자열 표시, 문자열 왼쪽 정렬 처리
    System.out.println(String.format("%-10s", str));
    
  }
  
  public static void ex13() {
    
    // 정규식을 활용한 메소드
    // 1. startsWith : 지정된 정규식 패턴으로 시작하면 true 반환
    // 2. endsWith   : 지정된 정규식 패턴으로 끝나면 true 반환
    // 3. matches    : 지정된 정규식 패턴을 포함하면 true 반환
    // 4. replaceAll : 지정된 정규식 패턴을 만족하는 부분을 다른 문자열로 변환
    // 5. split      : 지정된 정규식 패턴으로 문자열을 분리하여 분리된 String 배열을 반환
    
    String ip = "192.168.0.101";
    // 정규식 패턴에서 .는 모든 문자를 의미한다. 그래서 []로 묶어준다.
    String str = ip.replaceAll("[.]", "_");
    System.out.println(str);
  }
  
  public static void ex14() {
    
    // replace 메소드
    // 1. 지정된 문자열을 다른 문자열로 변환
    // 2. 발견된 모든 문자열을 변환
    
    String ip = "192.168.0.101";
    String str = ip.replace(".", "_");
    System.out.println(str);
  }
  public static void ex15() {
    // strip 메소드
    // 앞 뒤에 포함된 공백 문자 제거
    String name = "\n tom \n";
    String str1 = name.strip();
    int length = str1.length();
    System.out.println(length);
    
    
    // trim 메소드
    // 앞 뒤에 포함된 공백 문자 제거
    String str2 = name.trim();
    System.out.println(str2.length());
  }
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
//    ex05();
//    ex06();
//    ex07();
//    ex08();
//    ex09();
//    ex10();
//    ex11();
//    ex12();
//    ex13();
//    ex14();
//    ex15();
    
  }

}
