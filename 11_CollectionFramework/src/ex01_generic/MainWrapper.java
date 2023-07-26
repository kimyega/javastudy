package ex01_generic;

public class MainWrapper {

  public static void main(String[] args) {
    // String을 저장하는 box1
    Box<String> box1 = new Box<String>();

    box1.setItem("Hello world!");
    System.out.println(box1.getItem());
    
    // int 오류남.
    // 오직 참조타입만 Generic 처리에서 사용할 수 있다.
    // int 의 참조타입인 Integer를 사용한다.
    Box<Integer> box2 = new Box<Integer>();
    box2.setItem(40);
    System.out.println(box2.getItem());

    
    Box<Person> box3 = new Box<Person>();   //생성자쪽 타입은 생략가능 JDK 1.7부터
    box3.setItem(new Person("이창섭"));
    System.out.println(box3.getItem());
    
    /*
     * 기본타입   참조타입
     * 
     * boolean    Boolean
     * char       Character
     * byte       Byte
     * int        Integer
     * long       Long
     * double     Double
     */
    
  }

}
