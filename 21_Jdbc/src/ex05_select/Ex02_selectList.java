package ex05_select;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import connect.DB_Connect;
import dto.UserDto;

public class Ex02_selectList {

  // select 결과 행이 여러 개인 경우
  
  public static void main(String[] args) {

    // Connection 객체 선언 (DB 접속)
    Connection con = null;
    
    PreparedStatement ps = null;
    
    ResultSet rs = null;
    
    try {
      con = DB_Connect.getConnection();
      String sql = "";
      
      sql += "SELECT USER_NO, USER_ID, USER_NAME, JOINED_AT";
      sql += "  FROM USER_T";
      sql += " ORDER BY USER_NO";
      
      
      ps = con.prepareStatement(sql);
      
      rs = ps.executeQuery();
      
      // 검색 결과를 저장할 List<UserDto> 생성
      List<UserDto> users = new ArrayList<UserDto>();
      
      // while 문
      
      while(rs.next()) {
        UserDto user = new UserDto();
        user.setUser_no(rs.getInt("USER_NO"));
        user.setUser_id(rs.getString("USER_ID"));
        user.setUser_name(rs.getString("USER_NAME"));
        user.setJoined_at(rs.getDate("JOINED_AT"));
        users.add(user);
      }
      
      for(UserDto user : users) {
        System.out.println(user);    
      }
    } catch (Exception e) {
      e.printStackTrace();
    } finally {
      try {
        if(rs != null) rs.close();
        if(ps != null) ps.close();
        if(con != null) con.close();
      }catch (Exception e) {
        e.printStackTrace();
      }
    }
  
  }

}
