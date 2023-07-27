package ex02_Coffee;

import java.util.ArrayList;
import java.util.List;

public class Person {
  private List<Cup> tray;
  
  public Person() {
    tray = new ArrayList<Cup>();
  }
  
  public void addCupToTray(Cup cup) {
    tray.add(cup);
  }

  public List<Cup> getTray() {
    return tray;
  }

  public void setTray(List<Cup> tray) {
    this.tray = tray;
  }
  
  public void trayInfo() {
    int n = 1, length = tray.size();
    for(Cup cup : tray) {
      if(n > length) {
        return;
      }
      System.out.println(n++ + "번째 커피  커피이름: " + cup);
    }
    
  }
  
}
