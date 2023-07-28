package ex06_BinaryNumber;

import java.util.ArrayList;
import java.util.List;

public class BinaryNumber {
  
  @SuppressWarnings("unused")
  private int number;           // 10 진수
  private List<Integer> binary; // 2  진수
  public BinaryNumber(int number) {
    super();
    if(number < 0) {
      return;
    }
    this.number = number;
    binary = new ArrayList<Integer>();
    if(number == 0) {
      binary.add(0);
    }else {
      while(number > 0) {
        binary.add(number % 2);
        number /= 2;
      }    
    }
    
  }
  
  // BinaryNumber bn = new BinaryNumber(32);
  // syso(bn); // 100000
   @Override
  public String toString() {
    String n = "";
   for(int i = 0, length = binary.size(); i < length; i++) {
     n += binary.get(length - i - 1);
   }
     return n;
  }
  
  
  
}
