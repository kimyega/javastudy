package ex04_text_copy;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class MainWrapper {
  public static void ex01() {
    
    // 문제1. 다음과 같이 알파벳 대문자가 입력된 C:/storage/alphabet.txt 파일을 만드시오.
    // ABCDEFGHIJKLMNOPQRSTUVWXYZ
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    File file = new File(dir, "alphabet.txt");
    FileOutputStream fout = null;
    
    try {
      fout = new FileOutputStream(file);
      
      String alp = "";
      for(int n = 'A'; n <= 'Z'; n++) {
        alp += (char)n;
      }
      byte[] b = alp.getBytes();
      
      fout.write(b);
      System.out.println("파일 생성 완료.");
    } catch(IOException e) {
      e.printStackTrace();
    }finally {
      try {
        if(fout != null) { fout.close();}
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
  }
  
  public static void ex02() {
    
    // 문제2. C:/storage/alphabet.txt 파일을 복사하여 C:/storage/alphabet2.txt 파일을 만드시오.
    
    File dir = new File("C:/storage");
    if(dir.exists() == false) {
      dir.mkdirs();
    }
    
    File file = new File(dir, "alphabet2.txt");
    
    BufferedReader br = null;
    BufferedWriter bw = null;
    System.out.println(file.getName() + " 파일 생성 완료");
    try {
      
      br = new BufferedReader(new FileReader("C:/storage/alphabet.txt"));
      bw = new BufferedWriter(new FileWriter(file));
      
      String line = null;
      StringBuffer sb = new StringBuffer();
      while((line = br.readLine()) != null) {
        bw.write(line);
        sb.append(line);
      }
      
      System.out.println(sb.toString() + "의 내용이 " + file.getName() + " 파일으로 복사되었습니다.");
    }catch(IOException e){
      e.printStackTrace();
    }finally {
      try {
        if(br != null) { br.close(); }
        if(bw != null) { bw.close();}
      } catch(IOException e){
        e.printStackTrace();
      }
    }
    
    
    
  }
  
  public static void main(String[] args) {
    ex01();
    ex02();
    
    
  }

}
