package ex05_BankAccount;

public class BankMember {
  private String memName;
  private BankAccount bankAcc;
  public BankMember(String memName, BankAccount bankAcc) {
    this.memName = memName;
    this.bankAcc = bankAcc;
    
  }
  public BankMember() {
    
  }
  public void info() {
    System.out.println("고객명: " + memName);
    bankAcc.info();
  }
  // 입금
  public void balanceIn(long money) {
    bankAcc.balanceIn(money);
  }
  
  // 출금
  public long balanceOut(long money) {
    return bankAcc.balanceOut(money);
  }
  
  
  // 이체
  
  public void transfer(BankMember bankMem, long money) {
    bankMem.balanceIn(balanceOut(money));
  }
  
  
  
  
  public void setMemName(String memName) {
    this.memName = memName;
  }
  public void setBankAcc(BankAccount bankAcc) {
    this.bankAcc = bankAcc;
  }
  public BankAccount getBankAcc() {
    return bankAcc;
  }
  public String getMemName() {
    return memName;
  }
}
