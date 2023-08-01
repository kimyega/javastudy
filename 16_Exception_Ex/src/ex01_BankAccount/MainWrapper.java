package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    BankAccount acc = new BankAccount(10000, "1234");
    BankAccount acc2 = new BankAccount(10000, "5678");
    try {
      acc.deposit(1000);
      acc2.withdrawal(5000);
      acc.transfer(acc2, 7000);
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
    acc.inquiry();
    acc2.inquiry();
  }

}
