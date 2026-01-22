package ex06_Member;

public class MainWrapper {

  public static void main(String[] args) {
    
    // 정보 추가 (Setter 활용)
    Address address = new Address();
    address.setPostCode("15233");
    address.setRoadAddr("꿈터로 42번길");
    address.setJibunAddr("20-15");
    address.setDetailAddr("푸르지오 아파트 301동 1023호");
    
    Contact contact = new Contact();
    contact.setHomeTel("02-2616-0691");
    contact.setMobile("010-8390-9994");
    contact.setAddress(address);
    
    Member member = new Member();
    member.setName("이성경");
    member.setContact(contact);

    
    // Member member 객체 정보확인 (getter 활용)
    System.out.println("이름: " + member.getName());
    System.out.println("집전화: " + member.getContact().getHomeTel() + ", 폰번호: " + member.getContact().getMobile());
    System.out.println("우편번호: " + member.getContact().getAddress().getPostCode());
    System.out.println("도로명 주소: " + member.getContact().getAddress().getRoadAddr() + ", 지번: " + member.getContact().getAddress().getJibunAddr());
    System.out.println("상세주소: " + member.getContact().getAddress().getDetailAddr());
    
    
  }

}
