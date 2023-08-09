package ex05_Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Company {
  private List<Employee> employees = new ArrayList<Employee>();
  private Scanner sc = new Scanner(System.in);
  
  public Company() {

  }
  
  public void addEmployee() throws RuntimeException{
    System.out.println("===== 고용 =====");
    System.out.println("고용 형태 선택(1. 정규 2. 프리랜서) >>> ");
    int type = sc.nextInt();
    if(type != 1 || type != 2) {
      throw  new RuntimeException("잘못된 번호 입니다.");
    }
    System.out.println("사원명 입력 >>> ");
    String name = sc.next();
    Employee emp = new Employee("0001", name);
    employees.add();
    
    System.out.println("기본급 입력 >>> ");
    int salary = sc.nextInt();
    
    System.out.println("사원 등록이 완료되었습니다. 현재 등록된 사원은 1명입니다.");
    
  }
  
  public void dropEmployee() {
    System.out.println("===== 해고 =====");
    
  }
  
  public void findEmployee() {
    System.out.println("===== 조회 =====");
    
  }
  
  public void printAllEmployee() {
    System.out.println("===== 전체조회 =====");
    
  }
  
  public void manage() {
    System.out.println("===== 사원관리프로그램 시작 =====");
    while(true) {
      try {
        System.out.print("\n1.고용 2.해고 3.조회 4.전체조회 0.종료 >>> ");
        String choice = sc.next();
        switch(choice) {
        case "1": addEmployee(); break;
        case "2": dropEmployee(); break;
        case "3": findEmployee(); break;
        case "4": printAllEmployee(); break;
        case "0": System.out.println("===== 사원관리프로그램 종료 ====="); break;
        default: throw new RuntimeException("잘못된 요청입니다. 다시 시도하세요.");
        }
      } catch(Exception e) {
        System.out.println(e.getMessage());
      }
    }
  }
}
