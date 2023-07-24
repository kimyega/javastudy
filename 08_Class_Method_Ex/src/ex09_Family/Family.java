package ex09_Family;

public class Family{
  private int familyCount;
  private Person[] family;  // 배열의 선언
  
  public Family(int familyCount) {
    this.familyCount = familyCount;
    family = new Person[familyCount];     // 길이가 familyCount인 배열의 생성
  }                                       // 현재 모두 null인 상태
  
  public int getFamilyCount() {
    return familyCount;
  }
  public void setFamilyCount(int familyCount) {
    this.familyCount = familyCount;
    Person[] family1 = new Person[familyCount];               // 새로운 배열 만들어
    System.arraycopy(family,0, family1, 0, family.length);    // 복사해 집어넣고
    family = family1;                                         // 다시 원래 배열에 넣는다.
  }
  
  public Person[] getFamily() {
    return family;
  }
  public void setFamliy(Person[] family) {
    this.family = family;
  }
  
}
