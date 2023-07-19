package ex06_access_modifier;
/*
 * 접근 제어 지시자
 * 1. private   : 같은 클래스 내부에서만 접근할 수 있다.
 * 2. default   : 동일한 패키지에서만 접근할 수 있다. (access modifier를 작성하지 않는 경우)
 * 3. protected : 동일한 패키지 or 다른 패키지에 있느 상속관계의 클래스만 접근할 수 있다.
 * 4. public    : 어디서든 접근할 수 있다.
 */

/*
 * 정보 은닉
 * 1. 객체가 가진 내부 정보(필드)를 외부에 직접 노출하지 않는다.
 * 2. 외부로부터 내부 정보(필드)를 숨김으로써 정보를 안전하게 관리할 수 있다.
 * 3. Java 에서는 정보 은닉을 위해서 필드는 private 처리하고, 메소드는 public 처리한다.
 * 4. Java 에서는 메소드를 통해서 필드를 접근가능하다. (직접접근 X)
 */


/*
 * Getter와 Setter
 * 1. Getter
 *    1) 필드값을 외부로 반환하는 메소드이다.
 *    2) "get + 필드명" 형식의 이름을 가지는 메소드이다.
 *    3) 메소드 이름을 마음대로 바꾸면 안된다.
 * 2. Setter 
 *    1) 외부로부터 받아온 값을 필드에 저장하는 메소드이다.
 *    2) "set + 필드명" 형식의 이름을 가지는 메소드이다.
 *    3) 메소드 이름을 마음대로 바꾸면 안된다.
 * 3. 참고. boolean 타입의 필드는 Getter/Setter의 이름 형식이 다르다.
 */
public class User {

  private String id;
  private int age;
 
  public String getId() {
    return id;
  }
  public int getAge() {
    return age;
  }
  
  public void setId(String setId) {
    id = setId;
  }
  public void setAge(int setAge) {
    age = setAge;
  }
  
}
