package ex02_OutputStream;

import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.charset.StandardCharsets;

public class MainWrapper {

  /*
   * java.io.OutputStream 클래스
   * 1. 바이트 기반의 출력 스트림이다.
   * 2. 출력 단위
   *      1) int
   *      2) byte[]
   */
  
  public static void ex01() {
    
    // 디렉터리를 File 객체로 만들기
    File dir = new File("C:/storage");
    if(!dir.exists()) {
      dir.mkdirs();
    }
    
    // 파일을 File 객체로 만들기
    File file = new File(dir, "ex01.dat");
    
    // 파일출력스트림 선언
    FileOutputStream fout = null;
    
    try {
      
      // 파일출력스트림생성 (반드시 예외 처리가 필요한 코드)
      
      // 1. 생성 모드 : 언제나 새로 만든다. (덮어 쓰기)     new FileOutputStream(file)
      // 2. 추가 모드 : 새로 만들거나 기존 파일에 추가한다. new FileOutputStream(file, true)
      
      fout = new FileOutputStream(file);
      
      // 출력할 데이터 (파일로 보낼 데이터) 
      int c = 'A';          // int
      String s = "pple";    // byte[] : String을 byte[]로 변환
      byte[] b = s.getBytes();
      
      // 출력(파일로 데이터 보내기)
      fout.write(c);
      fout.write(b);
      System.out.println(file.getPath() + "파일 크기 : " + file.length() + "바이트");
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(fout != null) {
          fout.close();      // 출력스트림은 반드시 닫아줘야 한다. (반드시 예외 처리가 필요한 코드)
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
    
    
    
    
    
    
  }
  
  public static void ex02() {
    
    // C:/storage/ex02.dat 파일로 "안녕하세요" 보내기, 파일 크기 확인
    
    File dir = new File("C:/storage");
    if(dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex02.dat");
    
    FileOutputStream fout = null;
    
    try {
      fout = new FileOutputStream(file);
      String hello = "안녕하세요";
      byte[] b = hello.getBytes("UTF-8");
      
      fout.write(b);
      System.out.println(file.getPath() + " 파일 크기 : " + file.length() + "바이트");
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(fout != null) {
          
          fout.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex03() {
    
    /*
     * java.io.BufferedOutputStream 클래스
     * 1. 내부 버퍼를 가지고 있는 출력스트림이다.
     * 2. 많은 데이터를 한 번에 출력하기 때문에 속도 향상을 위해서 사용한다.
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    
    
    // 2줄로 안녕하세요
    //       반갑습니다.
    
    File dir = new File("C:/storage");
    if(dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex03.dat");
    
    // 버퍼출력스트림 선언 
    BufferedOutputStream bout = null;
    
    try {
      bout = new BufferedOutputStream(new FileOutputStream(file));
      
      String n ="안녕하세요";
      String n2 ="\n반갑습니다.";
      byte[] b = n.getBytes("UTF-8");
      
      bout.write(b);
      bout.write(n2.getBytes(StandardCharsets.UTF_8));
      
      System.out.println(file.getPath() + " 파일크기 : " + file.length() + "바이트");
    }catch(IOException e){
      e.printStackTrace();
    }finally {
      try {
        if(bout != null) {
          bout.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void ex04() {
    /*
     * java.io.DataOutPutStream 클래스
     * 1. int, double, String등의 변수를 그대로 출력하는 출력스트림이다.
     * 2. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    
    File dir = new File("C:/storage");
    if(dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex04.dat");
    
    // 버퍼출력스트림 선언 
    DataOutputStream dout = null;
    
    try {
      dout = new DataOutputStream(new FileOutputStream(file));
      
      String name = "tom";
      int age = 50;
      double height = 180.5;
      String school = "가산디지털대학교";
      
      dout.writeChars(name);
      dout.writeInt(age);
      dout.writeDouble(height);
      dout.writeUTF(school);
      
      System.out.println(file.getPath() + " 파일크기 : " + file.length() + "바이트");
    }catch(IOException e){
      e.printStackTrace();
    }finally {
      try {
        if(dout != null) {
          dout.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void ex05() {
    /*
     * java.io.ObjectOutputStream 클래스
     * 1. 객체를 그대로 출력하는 출력스트림이다.
     * 2. 직렬화된 객체를 보낼 수 있다.
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     */

    File dir = new File("C:/storage");
    if(dir.exists()) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "ex05.dat");
    
    // 버퍼출력스트림 선언 
    ObjectOutputStream oout = null;
    
    try {
      oout = new ObjectOutputStream(new FileOutputStream(file));
      
      String name = "tom";
      int age = 50;
      double height = 180.5;
      String school = "가산디지털대학교";
      
      Student student = new Student(name, age, height, school);
      
      oout.writeObject(student);
      
      System.out.println(file.getPath() + " 파일크기 : " + file.length() + "바이트");
    }catch(IOException e){
      e.printStackTrace();
    }finally {
      try {
        if(oout != null) {
          oout.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }

  }
  
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
    ex05();
    
  }

}
