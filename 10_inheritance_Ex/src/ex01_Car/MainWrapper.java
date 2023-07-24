package ex01_Car;

public class MainWrapper {

  public static void main(String[] args) {
    Ev ev = new Ev();
    ev.charge();
    ev.drive();
    
    EngineCar enCar = new EngineCar();
    enCar.drive();
    enCar.oiling();
    
    HybridCar hybrid = new HybridCar();
    hybrid.charge();
    hybrid.drive();
    hybrid.oiling();

  }

}
