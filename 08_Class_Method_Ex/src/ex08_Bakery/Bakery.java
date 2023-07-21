package ex08_Bakery;


// 1가지 빵만 파는 빵집

public class Bakery {
  private int count;  // 빵 갯수
  private final int PRICE = 2000;  // 빵 가격
  private int money;  // 빵집의 가계상황
  
  public Bakery(int count, int money) {
    this.count = count;
    this.money = money;
  }
  /**
   *  Bakery에서 빵을 파는 메소드
   *  
   * @param money 빵을 산 총 가격
   *  money / PRICE 빵을 산 갯수
   */
  public void sell(int money) {
    //  빵가격보다 적은돈을 냈을때
    if(money < PRICE) {
      System.out.println("돈이 부족합니다.\n");
      return;
    }
    
    
    count -= money / PRICE;
    this.money += money;
    this.money -= money % PRICE;
  }
  
  
  public void setCount(int count) {
    this.count = count;
  }
  public void setMoney(int money) {
    this.money = money;
  }
  
  
  
  public int getCount() {
    return count;
  }
  public int getPrice() {
    return PRICE;
  }
  public int getMoney() {
    return money;
  }
}
