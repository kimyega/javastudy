package ex02_return;

import java.util.Arrays;

public class MainWrapper1 {

  public static void main(String[] args) {
    String gn = getName();
    int ga = getAge();
    boolean isa = isAlive();
    String[] gh = getHobbies();
    System.out.println("이름: " + gn);
    System.out.println("나이: " + ga + "살");
    System.out.println("쏴라 있니?: " + isa);
    System.out.println("취미: " + Arrays.toString(gh));
  }
  public static String getName() {
    String name = "김예가";
    return name;
  }
  public static int getAge() {
    int age = 500;
    return age;
  }
  public static boolean isAlive() {
    boolean isAlive = getAge() <= 100;
    return isAlive;
  }
  public static String[] getHobbies() {
    String[] hobbies = {"여행", "수영", "영화"};
    return hobbies;
  }
  
}
