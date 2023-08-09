package ex05_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import connect.DB_Connect;

public class Ex01_selectOneP {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    System.out.println("조회할 아이디 입력 >>>");
    int user_id = sc.nextInt();
    
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;
    
    try {
      con = DB_Connect.getConnection();
      String sql = "";
      sql += "SELECT USER_NO, USER_ID, USER_NAME, JOINED_AT";
      sql += "  FROM USER_T";
      sql += " WHERE USER_ID = ?";
      
      ps = con.prepareStatement(sql);
      
      ps.setInt(1, user_id);
      
      rs = ps.executeQuery();
      
      
      
    }catch(Exception e) {
      e.printStackTrace();
    }finally {
      try {
        if(ps != null) ps.close();
        if(con != null) con.close();
      }catch(Exception e){
        e.printStackTrace();
      }
    }
    
    
    
    
    
    
  }

}
