package ex01_branch;

public class MainWrapper {
  public static void ex01() {
    //점수에 따른 학점(if문)
    int score = 35;
    char grade = 0;  // 'A', 'B', 'C', 'D', 'F'
   if(score / 10 == 9 || score / 10 == 8 || score == 100) {
     grade = 'A';
     System.out.println(score + "점은 " +grade + " 학점입니다.");
   }
   else if(score / 10 == 7 || score / 10 == 6) {
     grade = 'B';
     System.out.println(score + "점은 " +grade + " 학점입니다.");
   }
   else if(score / 10 == 5 || score / 10 == 4) {
     grade = 'C';
     System.out.println(score + "점은 " +grade + " 학점입니다.");
   }
   else if(score / 10 == 3 || score / 10 == 2) {
     grade = 'D';
     System.out.println(score + "점은 " +grade + " 학점입니다.");
   }
   else if(score / 10 == 1 || score / 10 == 0) {
     grade = 'F';
     System.out.println(score + "점은 " +grade + " 학점입니다.");
   }
   else {
     System.out.println("학점이 없습니다.");
   } 
  }
  public static void ex02() {
    
    //점수에 따른 학점(switch문)
    int score = 100;
    char grade = 0;  // 'A', 'B', 'C', 'D', 'F'
    switch(score / 10) {
    case 10: case 9:
      grade = 'A';
      break;
    case  8:
      grade = 'B';
      break;
    case  7:
      grade = 'C';
      break;
    case  6:
      grade = 'D';
      break;
    case  5:
      grade = 'F';
      break;
    default:
      System.out.println("학점이 없습니다.");   
    }
    System.out.println(score + "점은 " +grade + " 학점입니다.");
    
    
        
  }
  public static void ex03() {
  //점수와 학년에 따른 학점
    //1~3학년 : 60점 이상 합격, 아니면 불합격
    //4~6학년 : 70점 이상 합격, 아니면 불합격
    int score = 76; // 점수
    int scYear = 3;  // 학년
    String pass = "";  // "합격", "불합격"
    if(scYear < 4) {
     if(score >= 60) {
       pass = "합격";
     }else {
       pass = "불합격";
     }
    
    }else if(scYear >= 4 && scYear <= 6 ) {
      if(score >= 70) {
        pass = "합격";
      }else {
        pass = "불합격";
      }
    }else {
      System.out.println("학년이 없습니다.");
    }
    System.out.println(scYear + "학년 " + score + "점 " + pass);
    
    
    
    
   
  }
  public static void ex04() {
    //메뉴에 따른 가격
    //아메리카노 : 2000
    //카페라떼 : 2500
    //밀크티 : 3000
    //기타 : 5000
    String order = "아메리카노";
    int price = 0;
    switch(order) {
    case "아메리카노":
      price = 2000;
      break;
    case "카페라떼":
      price = 2500;
      break;
    case "밀크티":
      price = 3000;
      break;
    case "기타":
      price = 5000;
      break;
    default:
    
    }
   System.out.println("주문하신 " + order + "는(은) : " + price + "원입니다.");
  }
  public static void ex05() {
    //월에 따른 계절
    //3 ~ 5 : 봄
    //6 ~ 8 : 여름
    //9 ~ 11: 가을
    //12 ~ 2: 겨울
    int month = 7;
    String season;  // "봄", "여름", "가을", "겨울"
    
    if(month > 1 && month < 6) {
      season = "봄";
    }else if(month > 5 && month < 9){
      season = "여름";
    }else if(month > 8 && month < 12) {
      season = "가을";
    }else {
      season = "겨울";
    }
    System.out.println(month + "월은 " + season + " 계절");
    
      
  }
  public static void ex06() {
  //월에 따른 분기
    //1 ~ 3 : 1분기
    //4 ~ 6 : 2분기
    //7 ~ 9 : 3분기
    //10 ~ 12 : 4분기
    int m = 7;
    int s = 0;
    for(int n = 1; n <= m ; n++) {
      for(int i = 0;i <= n / 3;i++)
        s += 1;
      }
    }
    System.out.println(m + "월은 " + s + "분기");
       
  }
  public static void ex07() {
  //10일 후 요일은?
    int day = 13;  // 13일은 목요일
    int nDay = 10;  // 10일
    String weekname;  // "월", "화", "수", "목", "금", "토", "일" 
    nDay % 7 == ;
    
    
    
         
    }

  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
//    ex05();
    ex06();
//    ex07();
    
  }

}
