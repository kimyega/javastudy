package ex04_Singer;

public class Song {

  private String title;
  private String genre;
  private double playtime;
  
  public void Title() {
    System.out.print("제목: " + title + ", ");
  }
  public void Genre() {
    System.out.print("장르: " + genre + ", ");
  }
  public void PlayTime() {
    System.out.println("재생시간: " + playtime + "분");
  }
  public void info() {
    Title();
    Genre();
    PlayTime();
  }
  public void setTitle(String title) {
    this.title = title;
  }
  public void setGenre(String genre) {
    this.genre = genre;
  }
  public void setPlayTime(double playtime) {
    this.playtime = playtime;
  }
  public String getTitle() {
    return title;
  }
  public String getGenre() {
    return genre;
  }
  public double getPlayTime() {
    return playtime;
  }
  
}
