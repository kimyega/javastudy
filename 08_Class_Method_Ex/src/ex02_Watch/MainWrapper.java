package ex02_Watch;

public class MainWrapper {

  public static void main(String[] args) {
   Watch watch = new Watch();
   
   watch.setHour(9);
   watch.addMinute(40);
   watch.addSecond(30);
   
   // 증가
   watch.addHour(25);     // 1일 1시간
   watch.addMinute(61);    // 1시간 1분
   watch.addSecond(3661);   // 1시간 1분 1초
   
   System.out.println("시: " + watch.getHour());         // 시: 12
   System.out.println("분: " + watch.getMinute());       // 분: 42
   System.out.println("초: " + watch.getSecond());       // 초: 31

  }

}
