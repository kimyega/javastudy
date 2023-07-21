package ex07_Car;

public class MainWrapper {

  public static void main(String[] args) {
    Driver driver = new Driver();
    
    driver.setName("안유진");
    driver.setCareer(20);
    
    Car myCar = new Car();
    
    myCar.setDriver(driver);
    myCar.setFuel(1000);
    myCar.engineStart();    // 시동이 걸렸습니다. 시동이 걸리지 않았습니다.
    myCar.drive();      // 자동차가 움직였슴돠. 자동차가 움직이지 않았습니다.
    myCar.accel(50);    // 기존 속도에 50이 추가 
    System.out.println(myCar.getSpeeed());
    
    myCar.accel(60);    // 60추가 최대 100
    System.out.println(myCar.getSpeeed());
    myCar.brake(50);    // 기존 속도가 50만큼 감속, 현재 속도는 50입니다.
    myCar.brake(60);    // 60 감속 현재속도 0
    
    
  }

}
