package ex07_Car;

public class Car {
  private Driver driver;
  private int speed;
  private int fuel;
  private final int MAX_SPEED = 100;
  public void setDriver(Driver driver) {
    this.driver = driver;
  }
  public Driver getDriver() {
    return driver;
  }
  public void setSpeed(int speed) {
    this.speed = speed;
  }
  public int getSpeeed() {
    return speed;
  }
  public void setFuel(int fuel) {
    this.fuel = fuel;
  }
  public int getFuel() {
    return fuel;
  }
  
  public void engineStart() {
    if(fuel == 0) {
      System.out.println("시동이 걸리지 않았습니다.");
    } else {
        System.out.println("시동이 걸렸습니다.");
    }
  }
  
  
  public void drive() {
    if(fuel == 0 || driver == null) {
      System.out.println("자동차가 움직이지 않았습니다.");
    }else {
      System.out.println("자동차가 움직였습니다.");
    }
  }
  
  public void accel(int speed) {
    for(int n = 0; n < speed; n++) {
      if(this.speed == MAX_SPEED || fuel == 0) {
        return;
      }
      this.speed++;
      fuel--;
    }
    
  }
  public void brake(int speed) {
    for(int n = 0; n < speed; n++) {
      if(this.speed == 0) {
        System.out.println("현재 속도는 " + this.speed + "입니다.");
        return;
      }
      this.speed--;
    }
    System.out.println("현재 속도는 " + this.speed + "입니다.");
  }
  
  
  
  // boolean 타입의 getter setter이름에 is가 있으면 삭제한다.
 
  
  
}
