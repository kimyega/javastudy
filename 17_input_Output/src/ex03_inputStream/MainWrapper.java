package ex03_inputStream;

import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

import ex02_OutputStream.Student;



public class MainWrapper {

  /*
   * java.io.InputStream 클래스
   * 1. 바이트 기반의 입력스트림이다.
   * 2. 입력단위
   *    1) int
   *    2) byte[]
   *    
   */
  
  public static void ex01() {
    
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex01.dat");
    
    FileInputStream fin = null;
    try {
      
      // 파일입력스트림 생성
      fin = new FileInputStream(file);
      
      // 입력되 데이터 저장 변수
      int c = 0;
      
      /*
       * read() 메소드
       * 1. 1개의 데이터를 읽어서 반환한다.
       * 2. 읽은 내용이 없으면 -1을 반환한다.
       */
      // 1개씩 읽은 데이터를 누적할 StringBuilder
      StringBuilder sb = new StringBuilder();
      // 반복문 : 읽은 내용이  -1이 아니면 계속 읽는다.
      
      while((c = fin.read()) != -1) {
        sb.append((char)c);
      }
      
      // 결과확인
      System.out.println(sb.toString());
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(fin != null) {
          fin.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void ex02() {
    
    
    // 바이트 기반 스트림은 원래 한글 처리가 안 된다.
    
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex02.dat");
    
    FileInputStream fin = null;
    try {
      
      // 파일입력스트림 생성
      fin = new FileInputStream(file);
      
      // 입력되 데이터 저장 변수
      byte[] b = new byte[6];
      
      // 실제로 읽은 바이트 수 저장 변수
      int readByte = 0;
      
      // 1개씩 읽은 데이터를 누적할 StringBuilder
      StringBuilder sb = new StringBuilder();
      /*
       * read(byte[] b) 메소드
       * 1. 파라미터로 전달된 byte[] b에 읽은 내용을 저장한다.
       * 2. 실제로 읽은 byte수를 반환한다.
       * 3. 읽은 내용이 없으면 -1을 반환한다.
       */
      
      
      // 반복문 : read()의 반환값이  -1이 아니면 계속 읽는다.
      while((readByte = fin.read(b)) != -1) {
        sb.append(new String(b, 0, readByte));    // 배열 b의 인덱스 0부터 readByte개 데이터를 String으로 변환한다.
      }
      
      // 결과확인
      System.out.println(sb.toString());
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(fin != null) {
          fin.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  public static void ex03() {
    /*
     * java.io.BufferedInputStream 클래스
     * 1. 내부 버퍼를 가지고 있는 입력스트림이다.
     * 2. 많은 데이터를 한 번에 입력받기 때문에 속도 향상을 위해서 사용한다.
     * 3. 보조스트림이므로 메인스트림과 함계 사용한다.
     */
    
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex03.dat");
    
    BufferedInputStream bin = null;
    try {
      
      // 파일입력스트림 생성
      bin = new BufferedInputStream(new FileInputStream(file));
      
      // 입력되 데이터 저장 변수
      byte[] b = new byte[4];
      
      // 실제로 읽은 바이트 수 저장 변수
      int readByte = 0;
      
      // 1개씩 읽은 데이터를 누적할 StringBuilder
      StringBuilder sb = new StringBuilder();
      /*
       * read(byte[] b) 메소드
       * 1. 파라미터로 전달된 byte[] b에 읽은 내용을 저장한다.
       * 2. 실제로 읽은 byte수를 반환한다.
       * 3. 읽은 내용이 없으면 -1을 반환한다.
       */
      
      
      // 반복문 : read()의 반환값이  -1이 아니면 계속 읽는다.
      while((readByte = bin.read(b)) != -1) {
        sb.append(new String(b, 0, readByte));    // 배열 b의 인덱스 0부터 readByte개 데이터를 String으로 변환한다.
      }
      
      // 결과확인
      System.out.println(sb.toString());
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(bin != null) {
          bin.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void ex04() {
    
    // DataOutputStream과 DataInputStream을 사용하면
    // 바이트 기반 입출력에서도 한글 처리가 가능하다. (writeUTF, readUTF 메소드 이용)
    
    /*
     * java.io.DataInputStream 클래스
     * 1. int, double, String등의 변수를 그대로 입력받는 입력스트림
     * 2. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex04.dat");
    
    DataInputStream din = null;
    try {
      
      // 파일입력스트림 생성
      din = new DataInputStream(new FileInputStream(file));
      
      // 순서대로 입력 받기
      char ch1 = din.readChar();    //  't'
      char ch2 = din.readChar();    //  'o'
      char ch3 = din.readChar();    //  'm'
      int age = din.readInt();
      double height = din.readDouble();
      String school = din.readUTF();
      
      
      // 결과확인
      System.out.println(""+ ch1 + ch2 + ch3);    // 따옴표를 넣지 않으면 코드값이 나온다.
      System.out.println(age);
      System.out.println(height);
      System.out.println(school);
      
    }catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(din != null) {
          din.close();
        }
      }catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  
  public static void ex05() {
    /*
     * java.io.ObjectInputStream 클래스
     * 1. 객체를 그대로 입력받는 입력스트림이다.
     * 2. 직렬화된 객체를 입력받을 수 있다.
     * 3. 보조스트림이므로 메인스트림과 함께 사용한다.
     */
    File dir = new File("C:/storage");
    
    File file = new File(dir, "ex05.dat");
    
    ObjectInputStream oin = null;
    try {
      
      // 파일입력스트림 생성
      oin = new ObjectInputStream(new FileInputStream(file));
      
      
      // 객체 순서대로 입력 받기
      
      Student s = (Student)oin.readObject();
      
      
      
      // 결과확인
      System.out.println(s);    // 따옴표를 넣지 않으면 코드값이 나온다.
      
    }catch(IOException | ClassNotFoundException e) {
      e.printStackTrace();
    }finally {
      try {
        if(oin != null) {
          oin.close();
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
