package ex05_log_file;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class MainWrapper {

  public static void main(String[] args) {
    @SuppressWarnings("resource")  // sc.close()를 생략해도 경고 메시지를 보이지 말라.
    Scanner sc = new Scanner(System.in);

    while(true) {
      
      try {
        
        System.out.print("첫 번째 정수를 입력하세요 >>> ");
        int n1 = sc.nextInt();
        
        System.out.print("연산자를 입력하세요(+-*/%) >>> ");
        String op = sc.next();
        
        System.out.print("두 번째 정수를 입력하세요 >>> ");
        int n2 = sc.nextInt();
        
        int result = 0;
        switch(op) {
        case "+" : result = n1 + n2; break;
        case "-" : result = n1 - n2; break;
        case "*" : result = n1 * n2; break;
        case "/" : result = n1 / n2; break;
        case "%" : result = n1 % n2; break;
        default: throw new RuntimeException("invalid operator " + op);
        }
        
        System.out.println(n1 + op + n2 + "=" + result);
        
      } catch(Exception e) {
        
        sc.nextLine();
        
        // 문제. 예외가 발생할때마다 예외가 발생한 시간과 예외 메시지(message)를 C:/storage/log.txt 파일에 기록하시오.
        // C:/storage/log.txt 파일 내용 예시)
        // 2023-08-04 15:10:30    / by zero
        // 2023-08-04 15:11:23    invalid operator ++
        // 2023-08-04 15:12:52    null
        
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a h:mm:ss");
        String strDate = sdf.format(date);
        String message = strDate + "    " + e.getMessage() + " " + e.getClass().getName();
        File dir = new File("C:/storage");
        if(dir.exists() == false) {
          dir.mkdirs();
        }
        File file = new File(dir, "log.txt");
        BufferedWriter bw = null;
        
        
        
        try {
          bw = new BufferedWriter(new FileWriter(file, true));
         
          bw.write(message);
          bw.newLine();
          System.out.println(file.getPath() + " 파일에 예외처리 완료");
        }catch (IOException e1) {
          e1.printStackTrace();
        }finally {
          try {
            if(bw != null) bw.close();                     
          }catch(IOException e1) {
            e1.printStackTrace();
          }
        }
        
        
      }
      
    }
  }

}
