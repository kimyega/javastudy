package ex03_Bakerycopy;

public class Customer {

  private int count;   // 빵 구매 개수
  private int money;      // 구매자의 현재금액
  private Bakery bakery;
  
  
  public Customer(int money) {
    this.money = money;
  }
  /**
   * 빵을 구매하는 메소드
   * 
   * @param bakery 빵집 이름
   * @param money 빵을 산 총 가격
   */
  public void buy(Bakery bakery, int money)throws RuntimeException{
    
    // 구입 가격이 0이거나 음수인경우
    if(money <= 0) {
      throw new RuntimeException("인식할 수 없는 액수입니다.");
    }
    
    // 계좌에 돈이 부족한 경우
    if(this.money < money) {
      throw new RuntimeException("계좌에 돈이 부족합니다.\n");
    }
    // 빵이 수량이 부족한 경우
    if(bakery.getCount() < money / bakery.getCount()) {
      throw new RuntimeException("빵이 부족합니다.\n");
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
