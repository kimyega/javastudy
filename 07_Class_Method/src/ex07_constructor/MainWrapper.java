package ex07_constructor;

public class MainWrapper {

  public static void main(String[] args) {
    // myCom 객체 선언
    Computer myCom;
    
    // 객체 생성
    myCom = new Computer();       // public Computer(){} 생성자 호출
    
    myCom.setModel("gram");
    System.out.println("myCom: " + myCom.getModel());
    
    // yourCom 객체 생성
    Computer yourCom;
    yourCom = new Computer("mac");    // 인수 있는 생성자 호출 Setter의 역할을 한다.
    System.out.println("yourCom: " + yourCom.getModel());
  }

}
