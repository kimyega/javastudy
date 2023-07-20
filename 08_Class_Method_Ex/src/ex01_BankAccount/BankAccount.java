package ex01_BankAccount;

/**
 *  입금, 출금, 계좌조회, 이체기능
 *  @author 김예가
 *  @since 2023.07.19
 *  @version 1.0.0
 */
public class BankAccount {
/**
 *  long balance 이 필드는 계좌 잔액이다.
 *  초깃값으로 0 저장.
 */
  private long balance;
  /**
  *  String accNo 이 필드는 계좌 번호이다.
  *  초깃값으로 null 저장.
  */
  private String accNo;
  /**
   * 계좌번호와 통장잔액을 조회하는 메소드
   */
  public void inquiry() {
    System.out.println("계좌번호: " + accNo);
    System.out.println("통장잔액: " + balance + "원");
  }
  /**
   * 입금 메소드<br>
   *  파라미터가 0보다 작거나 같으면 동작하지 않는다.
   * @param money 입금할 금액
   */
  public void balanceIn(long money) {
    if(money <= 0) {
      System.out.println("동작하지 않습니다.");
      return;
    }
    balance += money;
  }
  /**
   * 출금 메소드<br>
   * 파라미터가 0보다 작거나 같으면 동작하지 않는다.
   * 파라미터가 통장잔액보다 크면 출금된 금액이 없으므로 0 반환 
   * @param money 출금할 금액
   * @return 실제로 출금하는 금액
   */
  public long balanceOut(long money) {
    long retVal = 0;
    if(money <= 0 || money > balance)  {
      retVal = 0;
    }else {
    balance -= money;
    retVal = money;
    }
    return retVal;
  }
  /**
   *  이체 메소드<br>
   *  다른 계좌로 이체하는 메소드
   *  내 계좌 출금 --> 상대 계좌 입금
   * @param you 이체할 계좌명
   * @param money 이체할 금액
   */
  public void transfer(BankAccount you, long money) {
    you.balanceIn(balanceOut(money));
   }
  
  
  
  public long getBalance()  {
    return balance;
  }
  public String getAccNo() {
    return accNo;
  }
  public void setBalacne(int balance) {
    this.balance = balance;
  }
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
}
