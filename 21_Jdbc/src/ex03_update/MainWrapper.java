package ex03_update;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

import connect.DB_Connect;
import dto.UserDto;

public class MainWrapper {

  public static void main(String[] args) {
   Scanner sc = new Scanner(System.in);
   System.out.print("수정할 USER_NO >>> ");
   int user_no = sc.nextInt();
   sc.nextLine();
   System.out.print("수정할 USER_NAME >>> ");
   String user_name = sc.next();
   
   UserDto user = new UserDto();
   Connection con = null;
   PreparedStatement ps = null;
   
   try {
     con = DB_Connect.getConnection();
     String sql = "";
     
     sql += "UPDATE USER_T";
     sql += "   SET USER_NAME = ?";
     sql += " WHERE USER_NO = ?";
     
     ps = con.prepareStatement(sql);
     
     int insertResult = ps.executeUpdate();
     
     ps.setString(1, user_name);
     ps.setInt(2, user_no);
     System.out.println(insertResult + "개의 행이 수정되었습니다.");
     
   }catch(Exception e) {
     e.printStackTrace();
   }finally {
     try {
       if(ps != null) ps.close();
       if(con != null)con.close();
     }catch(Exception e) {
       e.printStackTrace();
     }
   }
   
    
  }

}
