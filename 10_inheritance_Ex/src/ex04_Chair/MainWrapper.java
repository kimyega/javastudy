package ex04_Chair;

public class MainWrapper {

  public static void main(String[] args) {
    Chair chair1 = new Chair();
    chair1.setPerson(new Student("대하니", "연세대학교"));
    chair1.getPerson().info();
    
    Chair chair2 = new Chair();
    chair2.setPerson(new Alba("배수지", "서울대학교", "롯데리아"));
    chair2.getPerson().info();

  }
}
