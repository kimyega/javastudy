package ex01_BankAccount;

public class BankAccount {

  private long balance;
  private String accNo;
  public BankAccount(long balance, String accNo) {
    super();
    this.balance = balance;
    this.accNo = accNo;
  }
  
  // 조회 메소드 
  public void inquiry() {
    System.out.println("계좌번호: " + accNo);
    System.out.println("통장잔액: " + balance + "원");
  }
  
  
  // 입금 메소드
  public void deposit(long money) throws RuntimeException{
      if(money <= 0) {
        throw new RuntimeException(money + "원 입금 불가");
      }
      balance += money;
  }
  
  // 출금 메소드
  public long withdrawal(long money) throws RuntimeException{
    long retVal = 0;
      if(money <= 0) { 
        throw new RuntimeException(money + "원 출금 불가");
      }else if(money > balance) {
        throw new RuntimeException("잔액 부족");
      } else {
        balance -= money;
        retVal = money;
      }
    return retVal;
    
  }
  
  // 이체 메소드
  public void transfer(BankAccount account,int money) throws RuntimeException{
      account.deposit(withdrawal(money));
  }
  
  
}  
