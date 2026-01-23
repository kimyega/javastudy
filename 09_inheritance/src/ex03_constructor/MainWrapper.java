package ex03_constructor;

/*
 * 상속 관계의 생성자
 * 1. 자식 클래스는 반드시 부모 클래스를 먼저 생성해야 한다.
 * 2. 서브 클래스는 반드시 슈퍼 클래스를 먼저 생성해야 한다.
 * 3. 서브 클래스의 생성자가 호출될 때는 반드시 슈퍼 클래스의 생성자를 먼저 호출해야 한다.
 * 4. 만약 서브 클래스의 생성자에서 슈퍼 클래스의 생성자를 호출하지 않으면 Java에 의해서 슈퍼 클래스의 디폴트 생성자가 호출된다.
 * 5. 서브 클래스의 생성자에서 슈퍼 클래스의 생성자르 호출하는 방법은 super() 이다.
 */





public class MainWrapper {

  public static void main(String[] args) {
    Student st = new Student();

    System.out.println(st.getName());   // 부모객체가 자동으로 먼저 만들어 진다.
    System.out.println(st.getSchool());


    Student st2 = new Student("가산대학교");
    System.out.println(st2.getName());
    System.out.println(st2.getSchool());


    Student st3 = new Student("수소문", "가산대학교");
    System.out.println(st3.getName());
    System.out.println(st3.getSchool());
  }

}
