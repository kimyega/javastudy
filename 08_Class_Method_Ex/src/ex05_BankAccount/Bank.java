package ex05_BankAccount;

public class Bank {
  private String fAccName;
  private String fAccNo;
  private String fTelNo;
  public Bank(String fAccName, String fAccNo) {
    this.fAccName = fAccName;
    this.fAccNo = fAccNo;
  }
  public Bank() {

  }
  public void info() {
    System.out.println(fAccName + "(" + fAccNo + ")");
    System.out.println();
  }
  public void setFAccName(String fAccName) {
    this.fAccName = fAccName;
  }
  public void setFTelNo(String fTelNo) {
    this.fTelNo = fTelNo;
  }
  public String getFAccName() {
    return fAccName;
  }
  public String getFTelNo() {
    return fTelNo;
  }

}
