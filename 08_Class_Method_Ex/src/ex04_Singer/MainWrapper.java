package ex04_Singer;

public class MainWrapper {

  public static void main(String[] args) {
    Song song = new Song();
    
    song.setTitle("홀로");
    song.setGenre("발라드");
    song.setPlayTime(3.5);
    
    song.info();
    
    Singer singer = new Singer();
    
    singer.setName("이하이");
    singer.setTitleSong(song);
    
    singer.info();

  }

}
