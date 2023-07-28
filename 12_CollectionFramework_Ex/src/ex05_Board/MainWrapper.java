package ex05_Board;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 게시판(제목, 작성자, 조회수)을 저장하는 ArrayList 만들기
    // Map  : 게시글
    // List : 게시글 목록
    
    // 3개 게시글을 만들고, ArrayList에 저장하기
    

    
    Map<String, Object> post1 = new HashMap<String, Object>();
    
        post1.put("title" , "제목1");
        post1.put("writer", "작성자1");
        post1.put("view", 30);
    
    Map<String, Object> post2 = new HashMap<String, Object>();
        
        post2.put("title" , "제목2");
        post2.put("writer", "작성자2");
        post2.put("view", 40);
        
    Map<String, Object> post3 = new HashMap<String, Object>();
        
        post3.put("title" , "제목3");
        post3.put("writer", "작성자3");
        post3.put("view", 50);
        
    List<Map<String, Object>> postlist = new ArrayList<Map<String, Object>>();
          
        postlist.add(post1);
        postlist.add(post2);
        postlist.add(post3);
        
//        for(int i = 0, length = postlist.size(); i < length; i++) {
//          Map<String , Object> post = postlist.get(i);
//          System.out.println("title: " + post.get("title"));
//          System.out.println("writer: " + post.get("writer"));
//          System.out.println("view: " + post.get("view"));
//        }
        for(int i = 0, length = postlist.size(); i < length; i++ ) {
          Set<String> keySet = postlist.get(i).keySet();
          Iterator<String> arm = keySet.iterator();
          
          while(arm.hasNext()) {
            String key = arm.next();
            Object value = postlist.get(i).get(key);
            System.out.println(key + ": " + value);
            
//            for(Entry<String, Object> entry : postlist.get(i).entrySet()) {
//              System.out.println(entry.getKey());
//            }
          }
        }
  }

}
