package ex03_Bus;

import java.util.ArrayList;
import java.util.List;

public class Bus {
  private List<Seat> seats;
  private final int LIMIT = 25; // 25인승
  
  
  public Bus() {
    seats = new ArrayList<Seat>();
    for(int i = 0; i < LIMIT; i++) {
      seats.add(new Seat());
    }
  }
  public List<Seat> getSeats() {
    return seats;
  }

  public void setSeats(List<Seat> seats) {
    this.seats = seats;
  }
  
  public void getOn(int number, Person person) {
    if(number < 1 || number > LIMIT) {
      System.out.println("존재하지 않는 좌석 번호 입니다.");
      return;
    }
    if(seats.get(number - 1).getPerson() != null) {
      System.out.println("이미 점유된 좌석 번호 입니다.");
      return;
    }
    seats.get(number - 1).setPerson(person);
    System.out.println(String.format("%-2d", number) + "번 좌석에 " + person + "님이 착석했습니다.");
  }


  public void getOff(int number) {
    if(number < 1 || number > LIMIT) {
      System.out.println("존재하지 않는 좌석 번호 입니다.");
      return;
    }
    if(seats.get(number - 1).getPerson() == null) {
      System.out.println("이미 비어있는 좌석 번호 입니다.");
      return;
    }
    System.out.println(String.format("%-2d", number) + "번 좌석에 " + seats.get(number - 1) + "님이 하차했습니다.");
    seats.get(number - 1).setPerson(null);
  }

  public void info() {
    int number = 1;
    System.out.println("\n== 좌석 현황 ==\n");
    for(Seat s : seats) {
      System.out.println(String.format("%-2d", number++) + "번 좌석 " + s);
    }
  }
}
