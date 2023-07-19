package ex02_return;

public class MainWrapper2 {
    // void의 return
  public static void main(String[] args) {
    positivePrint(10);
    positivePrint(-10);
    
  }
  public static void positivePrint(int a) {
    if(a < 0) {     // 코딩 스타일상 if로 끝나는게 안좋기 때문에 반대조건을 return으로 종료 해준다.
      return;
    }
    System.out.println(a);  //  else로 끝내지 않는다.
  }
}
