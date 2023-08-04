package ex01_mkdirs;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 현재 날짜와 시간을 이용하여 디렉터리를 만드시오
    // C:/2023/08/03/14
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH");
    String strDate = sdf.format(date);
    
    File dir = new File("C:/" + strDate);
    if(!dir.exists()) {
      dir.mkdirs();
    }
    System.out.println(dir.getPath() + " 디렉터리 생성 완료");
    
    
    
    
  }

}
