package ex01_weather;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import javax.net.ssl.HttpsURLConnection;

public class MainWrapper {

  public static void ex01() {
    
    // 1시간마다 갱신되는 전국 날씨 정보
    String spec = "http://www.kma.go.kr/XML/weather/sfc_web_map.xml";
    
    // C:/storage/sfc_web_map.xml 파일로 저장하기
    
    URL url = null;
    HttpURLConnection con = null;
    
    // 입력
    BufferedReader br = null;
    // 출력
    BufferedWriter bw = null;
    
    try {
      url = new URL(spec);
      con = (HttpURLConnection) url.openConnection();
      br = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      String fileName = spec.substring(spec.lastIndexOf("/"));
      bw = new BufferedWriter(new FileWriter(dir.getPath() + fileName));
      
      String line = null;
      
      
      while((line = br.readLine()) != null) {
        bw.write(line);
        bw.newLine();
      }
      
      System.out.println("파일 생성완료!");
      
    } catch(MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    }finally{
      try {
        if(br != null) { br.close(); }
        if(bw != null) {bw.close(); }
        if(con != null) { con.disconnect();}
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
  }
  public static void main(String[] args) {
    ex01();
    
    
  }

}
