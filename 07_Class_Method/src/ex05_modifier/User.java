package ex05_modifier;




public class User {
  private String id;
  private int age;
  // 데이터를 안전하게 보관하기 위해 private 사용, 아무 클래스나 필드값을 바꿀 수 있음.
  
  public void setId(String setId) {
    if(setId.length() < 4) {
      return;
    }
    id = setId;
  }
  public String getId() {
    return id;
  }
  public void setAge(int setAge) {
    if(setAge < 0 || (int)( Math.log10(setAge)+1 ) > 3) {
      
      return;
    }
    age = setAge;
  }
  public int getAge() {
    return age;
  }
  public void inputId(String inputId,int age) {
    if(age < 30) {
       id = "MZ";
    }else {
      id = "XZ";
    }
    
  }
}
