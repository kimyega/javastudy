package ex07_ScoreHandler;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ScoreHandler {

  private List<Map<String, Object>> students;
  

  public ScoreHandler() {
    students = new ArrayList<Map<String,Object>>();
  }
  
  
  public void addScore(Map<String, Object> map) {
    students.add(map);
  }
  
  public Map<String, Number> get() {
    int max , min, total; 
    max = min = total = (int)(students.get(0).get("score"));
    for(int i = 1, length = students.size(); i < length; i++) {
      int score = (int)(students.get(i).get("score"));
      if(max < score) {
        max = score;
      }
      if(min > score) {
        min = score;
      }
      total += score;
    }
    
    Map<String, Number> map = new HashMap<String, Number>();
    map.put("max", max);
    map.put("min", min);
    map.put("total", total);
    map.put("average", (double) total / students.size());
    return map;
  }
//  public int getMin() {
//    int min = (int)(students.get(0).get("score"));
//    for(int i = 1, length = students.size(); i < length; i++) {
//      int score = (int)(students.get(i).get("score"));
//      if(min > score) {
//        min = score;
//      }
//      
//    }
//    return min;
//  }
//  public int getTotal() {
//    int total = (int)(students.get(0).get("score"));
//    for(int i = 1, length = students.size(); i < length; i++) {
//      int score = (int)(students.get(i).get("score"));
//      
//        total += score;
//      
//      
//    }
//    return total;
//  }
//  public double getAverage() {
//    double avg = getTotal() / students.size();
//    return avg;
//  }
  
  
  
  
  
}
