package ex03_Bus;

public class Seat {
  private Person person;
  
  public Seat() {
  }
  
  public Person getPerson() {
    return person;
  }

  public void setPerson(Person person) {
    this.person = person;
  }

  @Override
  public String toString() {
    String info;
    if(person == null) {
      info = "공석";
    }else {
      info = "" + person;
    }
    return info;
  }

  
  
  
}
