package ex07_TourGuide;

public class MainWrapper {

  public static void main(String[] args) {
    
    TourGuide g1 = new TourGuide();
    g1.setTour(new HawaiiTour());
    g1.sightseeing();
    g1.leisure();
    g1.meal();
    
    TourGuide g2 = new TourGuide();
    g2.setTour(new JapanTour());
    g2.sightseeing();
    g2.leisure();
    g2.meal();


  }
}
