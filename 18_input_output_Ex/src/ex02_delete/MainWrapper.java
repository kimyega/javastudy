package ex02_delete;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainWrapper {

  public static void ex01() {
    
    // C:/2023 디렉터리를 삭제하시오.
    // 비어있는 디렉터리만 삭제할 수 있다.
    
    Date date = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd/HH");
    String strDate = sdf.format(date);
    
    File dir = new File("C:/" + strDate);
    
    
    if(dir.exists()) {
      new File("C:/2023/08/03/15").delete();
      new File("C:/2023/08/03").delete();
      new File("C:/2023/08/").delete();
      new File("C:/2023").delete();
      System.out.println("C:/2023 디렉터리 삭제 완료.");
    }else {
      dir.mkdirs();
      System.out.println("C:/2023/08/03/15 디렉터리 생성 완료.");
      
    }
  }
  
  public static void ex02() {
    
    File dir = new File("C:/storage");
    File[] files = dir.listFiles();
    if(files != null) {
      for(File file : files) {
        System.out.println(file.getPath() + "파일삭제");
        file.delete();
      }
    }
    System.out.println(dir.getPath() + "디렉터리 삭제");
    dir.delete();
  }
  
  public static void main(String[] args) {
//    ex01();
    ex02();
  }

}
