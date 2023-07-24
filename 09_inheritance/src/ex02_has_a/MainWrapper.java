package ex02_has_a;

public class MainWrapper {

  public static void main(String[] args) {
    
    Tv tv = new Tv();
    tv.setCh(60);
    tv.setVol(3);
    
    tv.upCh();
    tv.downVol();
    
    System.out.println(tv.getVol());
    System.out.println(tv.getCh());
    

  }

}
