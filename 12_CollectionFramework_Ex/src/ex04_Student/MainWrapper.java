package ex04_Student;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 교실의 학생 정보를 저장하는 HashMap
    // Key   : 학번(ex:  10101)
    // Value : Student 객체
    
    Map<String, Student> class1 = new HashMap<String, Student>();
    
    class1.put("230728", new Student("이종석", new Exam(80, 70, 60)));
    class1.put("230230", new Student("김준수", new Exam(90, 40, 100)));
    class1.put("230401", new Student("이나은", new Exam(70, 30, 90)));
    class1.put("230723", new Student("백설양", new Exam(40, 50, 100)));
    class1.put("230122", new Student("상호준", new Exam(90, 90, 100)));
    
    String[] stuNo = {"230728", "230230", "230401", "230723", "230122"};
    for(int i = 0; i < stuNo.length; i++) {
      
      Student student = class1.get(stuNo[i]);
      System.out.println("이름: " + student.getName());
      System.out.println("점수: " + student.getExam());
    }
    
    
    for(Entry<String, Student> entry : class1.entrySet()) {
      String stuNo1  = entry.getKey();
      String name   = entry.getValue().getName();
      int kor       = entry.getValue().getExam().getKor();
      int eng       = entry.getValue().getExam().getEng();
      int math      = entry.getValue().getExam().getMath();
      System.out.println("학번: " + stuNo1 + " 이름: " + name + " 시험점수 영어: " + eng + " 국어: " + kor + " 수학: " + math);
    }
  }

}
