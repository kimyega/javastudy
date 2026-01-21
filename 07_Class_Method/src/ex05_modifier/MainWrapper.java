package ex05_modifier;

public class MainWrapper {

  public static void main(String[] args) {
   User u = new User();
   
   u.setId("a");
   u.setAge(20);
   System.out.println(u.getId());
   System.out.println(u.getAge());
   u.inputId("김연아", 28);
   System.out.println(u.getId());

  }
}
