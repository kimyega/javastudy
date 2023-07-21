package ex07_Car;

public class Driver {
  private String name;
  private int career;
  private boolean bestDriver;     // career >= 10 ture
  
  public void setName(String name) {
    this.name = name;
  }
  public String getName() {
    return name;
  }
  public void setCareer(int career) {
    this.career = career;
    setBestDriver(career >= 10);
  }
  public int getCareer() {
    return career;
  }
  private void setBestDriver(boolean bestDriver) {
    this.bestDriver = bestDriver;
  }
  public boolean isBestDriver() {       // boolean의 getter이름은 get대신에 is로 대체한다.
    return bestDriver;
  }
}
