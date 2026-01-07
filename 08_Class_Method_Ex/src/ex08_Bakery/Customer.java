package ex08_Bakery;

public class Customer {

  private int count;   // 빵 구매 개수
  private int money;      // 구매자의 현재금액
  
  
  public Customer(int money) {
    this.money = money;
  }
  /**
   * 빵을 구매하는 메소드
   * 
   * @param bakery 빵집 이름
   * @param money 빵을 산 총 가격
   */
  public void buy(Bakery bakery, int money) {
    
    // 계좌에 돈이 부족한 경우
    if(this.money < money) {
      System.out.println("계좌에 돈이 부족합니다.\n");
      return;
    }
    // 빵이 수량이 부족한 경우
    if(bakery.getCount() < money / bakery.getCount()) {
      System.out.println("빵이 부족합니다.\n");
      return;
    }
    
    
    bakery.sell(money);
    this.count += money / bakery.getPrice();
    this.money -= money;
    this.money += money % bakery.getPrice();
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
  public int getMoney() {
    return money;
  }
  
  
  
}
