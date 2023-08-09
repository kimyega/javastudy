package ex03_api;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;

public class MainWrapper {

  public static void main(String[] args) {

    // 문제1. 공공데이터포털(data.go.kr)에서 "한국전력공사_전기차 충전소 운영정보" API를 신청하고
    // 결과를 "C:/storage/한국전력공사_전기차_충전소_운영정보.xml"로 저장하시오.
     /*  1) seviceKey  : 필수, 인코딩된 인증키
      *  2) pageNo     : 필수, 1
    *    3) numOfRows  : 필수, 10
    *    4) addr       : 옵션, 전라남도 나주시 빛가람동 120
    */
    URL url = null;
    HttpURLConnection con = null;
    
    BufferedReader br = null;
    BufferedWriter bw = null;
    
    try {
      
      String spec = "http://openapi.kepco.co.kr/service/EvInfoServiceV2/getEvSearchList";
      String serviceKey = "VJ0lWARlka6Dlh26M5FtIhDBTcxXvi6yqt+LstB5MzcjrkM4CFq9WD8f4Foa+LQmegzq6ByEF+QDLmxI7CDlqA==";
      int pageNo = 1;
      int numOfRows = 10;
      String addr = "전라남도 나주시 빛가람동 120";
      
      StringBuilder sb = new StringBuilder();
      sb.append(spec);
      sb.append("?serviceKey=").append(URLEncoder.encode(serviceKey, "UTF-8"));
      sb.append("&pageNo=").append(pageNo);
      sb.append("&numOfRows=").append(numOfRows);
      sb.append("&addr=").append(URLEncoder.encode(addr, "UTF-8"));
      
      url = new URL(sb.toString());
      con = (HttpURLConnection)url.openConnection();
      
      int responsedCode = con.getResponseCode();
      if(responsedCode != HttpURLConnection.HTTP_OK) {
        throw new RuntimeException(responsedCode + "발생");
      }
      
      
      br = new BufferedReader(new InputStreamReader(con.getInputStream()));
      
      StringBuilder sbuf = new StringBuilder();
      String line = null;
      while((line = br.readLine()) != null) {
        sbuf.append(line + "\n");
      }
      
      File dir = new File("C:/storage");
      if(dir.exists() == false) {
        dir.mkdirs();
      }
      File file = new File(dir, "한국전력공사_전기차_충전소_운영정보.xml");
      
      bw = new BufferedWriter(new FileWriter(file));
      
      bw.write(sbuf.toString());
      
      
    } catch(UnsupportedEncodingException e){
      System.out.println(e.getMessage());
    } catch(MalformedURLException e) {
      System.out.println(e.getMessage());
    } catch(IOException e) {
      System.out.println(e.getMessage());
    } catch(RuntimeException e){
      System.out.println(e.getMessage());
    }finally {
      try {
        if(bw != null) bw.close();
        if(br != null) br.close();
        if(con != null) con.disconnect();
        
      } catch(IOException e) {
        e.printStackTrace();
      }
    }
    
    
   
  }

}
