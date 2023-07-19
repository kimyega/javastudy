package ex06_access_modifier;

public class MainWrapper {

  public static void main(String[] args) {
   User u = new User();
   u.setId("이태준");
   System.out.println(u.getId());
   
   u.setAge(34);
   System.out.println(u.getAge());
  }

}
