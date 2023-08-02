package ex04_Libarary;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Library {

  private List<Book> books;
  private Scanner sc;
  
  public Library() {
    books = new ArrayList<Book>();
    sc = new Scanner(System.in);
  }
  
  /**
   * 등록<br>
   */
  private void addBook() throws InputMismatchException, RuntimeException{
    System.out.println("=== 등록 ===");
    System.out.println("책 제목 입력");
    String title = sc.next();
    
    if(title.isEmpty()) {
      throw new RuntimeException("책의 제목이 입력되지 않았습니다.");
    }
    System.out.println("책 가격을 입력해주세요.");
    int price = sc.nextInt();
    
    if(price < 0) {
      throw new RuntimeException("잘못된 가격입니다.");
    }
    books.add(new Book(title, price));
    System.out.println("\""+ title + "\" 책이 등록되었습니다.");
  }
  /**
   * 삭제<br>
   */
  private void deleteBook() throws RuntimeException{
    System.out.println("=== 삭제 ===");
    if(books.isEmpty()) {
      throw new RuntimeException("도서관에 등록된 책이 없습니다.");
    }
    System.out.println("책 제목을 입력해주세요.");
    String title = sc.next();
    if(title.isEmpty()) {
      throw new RuntimeException("삭제할 책의 제목이 입력되지 않았습니다.");
    }
//    for(Book book : books) {
//      if(title.equals(book.getTitle())) {
//        books.remove(book);
//        System.out.println(book + " 책이 삭제되었습니다.");
//        return;
//      }
//    }
//    System.out.println(title + " 제목을 가진 책이 없습니다.");
    
    for(int i = 0, size = books.size(); i < size; i++) {
      if(title.equals(books.get(i).getTitle())) {
        books.remove(i);
        System.out.println("\"" + title + "\" 책이 삭제되었습니다.");
        return;
      }else {
        throw new RuntimeException("일치하는 책이 존재하지 않습니다.");
      }
    }
    
  }
  /**
   * 수정<br>
   */
  private void modifyBook() throws RuntimeException, InputMismatchException{
    System.out.println("=== 수정 ===");
    if(books.isEmpty()) {
      throw new RuntimeException("도서관에 등록된 책이 없습니다.");
    }
    System.out.println("수정하고싶은 책 제목 입력해주세요.");
    String title = sc.next();
    if(title.isEmpty()) {
      throw new RuntimeException("수정할 책의 제목이 입력되지 않았습니다.");
    }
    
//    for(Book book : books) {
//      if(title.equals(book.getTitle())) {
//        System.out.println(title + "\"책이 확인 되었습니다.");
//         continue;
//      }else {
//        System.out.println("\""+ title + "\" 책이 존재하지 않습니다.");
//        return;
//      }
//    }
//    
//    System.out.println("수정할 책 제목을 입력해주세요.");
//    String modTitle = sc.next();
//    if(modTitle.isEmpty()) {
//      throw new RuntimeException("책의 제목이 입력되지 않았습니다.");
//    }
//    System.out.println("수정할 책 가격을 입력해주세요.");
//    int modPrice = sc.nextInt();
//    if(modPrice < 0) {
//      throw new RuntimeException("잘못된 가격입니다.");
//    }
//    
//    for(int i = 0, size = books.size(); i < size; i++) {
//      if(title.equals(books.get(i).getTitle())) {
//        int price = books.get(i).getPrice();
//        books.set(i, new Book(modTitle, modPrice));
//        System.out.println(" 책이름이 \"" + title + "\"에서 \"" + modTitle + "\"로, 가격이 \"" + price + "원\"에서  \"" + modPrice + "원\"으로 수정되었습니다."); 
//        return;
//      }
//    }
    
    for(Book book : books) {
      if(title.equals(book.getTitle())) {
        System.out.println("수정할 책 제목을 입력해주세요.");
        String modTitle = sc.next();
        if(modTitle.isEmpty()) {
          throw new RuntimeException("책의 제목이 입력되지 않았습니다.");
        }
        System.out.println("수정할 책 가격을 입력해주세요.");
        int modPrice = sc.nextInt();
        if(modPrice < 0) {
          throw new RuntimeException("잘못된 가격입니다.");
        }
        int price = book.getPrice();
        book.setPrice(modPrice);
        book.setTitle(modTitle);
        System.out.println(" 책이름이 \"" + title + "\"에서 \"" + modTitle + "\"로, 가격이 \"" + price + "원\"에서  \"" + modPrice + "원\"으로 수정되었습니다."); 
         return;
      }
    }
    System.out.println("\""+ title + "\" 책이 존재하지 않습니다.");
    
    
  }
  
  
  /**
   * 조회<br>
   */
  private void queryBook() throws RuntimeException{
    System.out.println("=== 책 조회 ===");
    if(books.isEmpty()) {
      throw new RuntimeException("도서관에 등록된 책이 없습니다.");
    }
    System.out.println("조회하고 싶은 책 제목을 입력해주세요.");
    String title = sc.next();
    if(title.isEmpty()) {
      throw new RuntimeException("조회할 책의 제목이 입력되지 않았습니다.");
    }
    int size = books.size();
    
    for(int i = 0; i < size; i++) {
      if(title.equals(books.get(i).getTitle())) {
        System.out.println("조회결과: "+ (i + 1) + "번째 도서: " + books.get(i));
        return;
      }else {
        throw new RuntimeException("일치하는 책이 존재하지 않습니다.");
        
      }
    }
    
    
  }
  
  /**
   * 전체조회<br>
   */
  private void queryAllBook() throws RuntimeException{
    System.out.println("=== 전체 조회 ===");
    int size = books.size();
    System.out.println("현재 전체 보유 도서 권수: " + size + "권");
    if(books.isEmpty()) {
      throw new RuntimeException("도서관에 등록된 책이 없습니다.");
    }
    for(int i = 0; i < size; i++) {
      System.out.println((i + 1) + "번째 도서: " + books.get(i));
    }
    
  }
  
  /**
   * 운영<br>
   */
  public void manage() {
    // 사용자가 종료 명령을 내릴때까지 프로그램은 종료되지 않는다.
    while(true) {
        
      try {
        System.out.println("1.등록 2.삭제 3.수정 4.조회 5.전체조회 0.종료");
        String choice = sc.next();
        switch(choice) {
        case "1": addBook();      break;
        case "2": deleteBook();   break;
        case "3": modifyBook();   break;
        case "4": queryBook();    break;
        case "5": queryAllBook(); break;
        case "0": System.out.println("도서관리프로그램을 종료합니다."); return;
        default: System.out.println("잘못된 입력입니다.");
        
      }
      }catch(Exception e) {
       System.out.println(e.getMessage()); 
      }
      
      
      
      
    
  }
  } 
  
}
