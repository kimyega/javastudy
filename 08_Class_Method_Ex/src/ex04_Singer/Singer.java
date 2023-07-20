package ex04_Singer;

public class Singer {
  private Song titleSong;
  private String name;
  
  public Singer() {
    titleSong = new Song();
  }
  public void setTitleSong(Song titleSong) {
    this.titleSong = titleSong;
  }
  public void Name() {
    System.out.println("이름: " + name);
  }
  
  public void setName(String name) {
    this.name = name;
  }
  
  public void info() {
    Name();
    titleSong.info();
    
  }
}
