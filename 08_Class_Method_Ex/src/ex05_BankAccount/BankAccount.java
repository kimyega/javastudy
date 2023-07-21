package ex05_BankAccount;

public class BankAccount {
  private Bank bank;
  private long balance; 
  private String accNo;
  public BankAccount(Bank bank, String accNo,long balance) {
    this.bank = bank;
    this.balance = balance;
    this.accNo = accNo;
  }
  public BankAccount() {
    
  }
  
  // 입금
 public void balanceIn(long money) {
   if(money <= 0) {
     return;
   }
   balance += money;
 }

 
  // 출금
 public long balanceOut(long money) {
   long retVal = 0;
   if(money > 0 || money <= balance) {
     balance -= money;
     retVal = money;
   }
   return retVal;
 }
  
 // 이체
 public void transfer(BankAccount bankAcc, long money) {
   bankAcc.balanceIn(balanceOut(money));
 }
  
  
  public void info() {
    System.out.println("계좌번호: " + accNo + ", 통장잔액: " + balance);
    System.out.print("개설지점: ");
    bank.info();
    System.out.println();
  }
  public void setBank(Bank bank) {
    this.bank = bank;
  }
  public void setAccNo(String accNo) {
    this.accNo = accNo;
  }
  public void setBalance(long balance) {
    this.balance = balance;
  }
  
  public long getBalance() {
    return balance;
  }
  public String getAccNo() {
    return accNo;
  }
  public Bank getBank() {
    return bank;
  }
}
