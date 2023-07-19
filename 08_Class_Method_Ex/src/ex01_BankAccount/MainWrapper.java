package ex01_BankAccount;

public class MainWrapper {

  public static void main(String[] args) {
    BankAccount my = new BankAccount();
    
    my.setAccNo("031-21-9874-321");
    
    my.balanceIn(50000);
    
    my.balanceOut(1000);
    
    my.inquiry();
    
    BankAccount you = new BankAccount();
    
    you.setAccNo("032-51-2366-355");
    
    // 내가 너에게 3만원 이체하기
    
//    my.transfer(you, 30000);
    
  }

}
