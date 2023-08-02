package ex04_Libarary;

import java.util.Objects;

public class Book {

  private String title;
  private int price;
  
  public Book() {
       
  }

  public Book(String title) {
    this(title,0);
    
  }

  public Book(String title, int price) {
    super();
    this.title = title;
    this.price = price;
  }

  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public int getPrice() {
    return price;
  }

  public void setPrice(int price) {
    this.price = price;
  }

  @Override
  public String toString() {
    return "책이름: " + title + ", 가격: " + price + "원";
  }

  @Override
  public int hashCode() {
    return Objects.hash(price, title);
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Book other = (Book) obj;
    return price == other.price && Objects.equals(title, other.title);
  }
  
  
  
}
