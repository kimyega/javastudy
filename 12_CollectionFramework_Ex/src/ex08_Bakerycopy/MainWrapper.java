package ex08_Bakerycopy;

public class MainWrapper {

  public static void main(String[] args) {
   
    Bakery bakery = new Bakery(100,10000);
    
   Customer cus = new Customer(10004424);
   
    cus.buy(bakery, 3525000);
    System.out.println("빵집 정보");
    System.out.println("빵집 money: " + bakery.getMoney() + "원");
    System.out.println("빵집 빵: " + bakery.getCount() + "개");
    
    System.out.println("\n고객 정보");
    
    System.out.println("고객 money: " + cus.getMoney() + "원");
    System.out.println("고객 빵: " + cus.getCount() + "개");

  }

}
