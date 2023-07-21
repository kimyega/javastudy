package ex06_Member;

public class Contact {
  private String homeTel;
  private String moblie;
  private Address address;
  
  public void setHomeTel(String homeTel) {
    this.homeTel = homeTel;
  }
  public void setMobile(String mobile) {
    this.moblie = mobile;
  }
  public void setAddress(Address address) {
    this.address = address;
  }
  
  public String getHomeTel() {
    return homeTel;
  }
  public String getMoblie() {
    return moblie;
  }
  public Address getAddress() {
    return address;
  }
  
}
