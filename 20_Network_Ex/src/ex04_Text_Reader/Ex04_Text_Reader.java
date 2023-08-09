package ex04_Text_Reader;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class Ex04_Text_Reader {

  public static void main(String[] args) {

    // 텍스트 파일 읽기
//    주소
    
    String spec = "http://www.kma.go.kr/weather/forecast/mid-term-rss3.jsp?stnId=108";
    URL url = null;
    HttpURLConnection con = null;
    BufferedReader br = null;
    BufferedWriter bw = null;
    try {
      url = new URL(spec);
      con = (HttpURLConnection)url.openConnection();
      int responseCode = con.getResponseCode();
      if(responseCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responseCode + " 발생");
      }
      br = new BufferedReader(new InputStreamReader(con.getInputStream()));

      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, "weather.xml");
      bw = new BufferedWriter(new FileWriter(file));
      StringBuilder sb = new StringBuilder();
      String line = null;
      while((line = br.readLine()) != null) {
        bw.write(line.replace("<br />", "\n"));
        sb.append(line);
      }

    }catch(Exception e) {
      System.out.println(e.getMessage());
    }
    
    
  }

}
