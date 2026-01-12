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
    
    if(month > 2 && month < 6) {
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
    int m = 12;
    int s = 0;
    for(int n = 1; n <= m ; n += 3) {
        s += 1;
    }
    System.out.println(m + "월은 " + s + "분기");
       
  }
  public static void ex07() {
  //10일 후 요일은?
    int day = 1;    // 현재 일수
    int nDay = 10;  // 지날 일수
    int ncDay = 0;  // 지난 일수
    ncDay = day + nDay;
    
    String weekname = "";   // 요일                 // "월", "화", "수", "목", "금", "토", "일" 
    int month = 7;          // 현재 달수
    int maxDay  = 0;        // 현재 달의 최대 일수
    int year  = 2023;       // 현재 년도


    switch(month) {
    case 1: case 3: case 5: case 7: case 8: case 10: case 12: 
      maxDay = 31;
      break;
    case 4: case 6: case 9: case 11:
      maxDay = 30;
    break;
    case 2:
      if(year % 4 == 0 && year % 100 != 0) {
        maxDay = 29;
      }else if(year % 400 == 0){
        maxDay = 29;
      }else {
        maxDay = 28;
      }
      break;
      default:
    }
    
    
    
    
    switch(ncDay % 7) {
    case 0 :
      weekname = "금";
      break;
    case 1 :
      weekname = "토";
      break;
    case 2 :
      weekname = "일";
      break;
    case 3 :
      weekname = "월";
      break;
    case 4 :
      weekname = "화";
      break;
    case 5 :
      weekname = "수";
      break;
    case 6 :
      weekname = "목";
      break;
      default:
    }
    System.out.println( nDay + "일후 요일은 " + month + "월 " + ncDay + "일 " + weekname + "요일");    
    }
    public static void ex08() {
      // 아스키 코드
      char ch = 'A';
      if(ch >= 'A' && ch <= 'Z') {
        ch += 32;
      } else if(ch >= 'a' && ch <= 'z'){
        ch -= 32;
      }
      
      System.out.println(ch);
    
    }
  
  
  
  public static void main(String[] args) {
//    ex01();
//    ex02();
//    ex03();
//    ex04();
//    ex05();
//    ex06();
//    ex07();
    ex08();
    
  }

}
