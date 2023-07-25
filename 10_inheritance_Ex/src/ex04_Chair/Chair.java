package ex04_Chair;

public class Chair {
  // Person 하위 객체 모두 저장 가능
  private Person person;
  
  public Chair() {
    
  }
  public Chair(Person person) {
    this.person = person;
  }
  public Person getPerson() {
    return person;
  }
  public void setPerson(Person person) {
    this.person = person;
  }
  
  
  
}
