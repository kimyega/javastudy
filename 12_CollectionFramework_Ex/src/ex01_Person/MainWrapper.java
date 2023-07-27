package ex01_Person;

import java.util.*;

public class MainWrapper {

  public static void main(String[] args) {
    
    List<Person> family = new ArrayList<Person>();
    

    family.add(new Person("엄마", 40));
    family.add(new Person("아빠", 43));
    family.add(new Person("나"  , 18));
    family.add(new Person("동생", 15));
    
    for(Person p : family) {
      System.out.println(p);
      System.out.println("이름: " + p.getName());
      System.out.println("나이: " + p.getAge());
    }
    
  }

}
