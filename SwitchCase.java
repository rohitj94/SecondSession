import java.util.*;

class SwitchCase
 {
   public static void main(String args[])
   {

     String a;
     
     Scanner s = new Scanner(System.in);
     System.out.println("Enter Month");
     a = s.next();

     switch(a.toLowerCase())
     {
     case "january" : System.out.println("31");
              break;
     case "february" : System.out.println("28");
              break;
     case "march" : System.out.println("31");
              break;
     case "april" : System.out.println("30");
              break;
     case "may" : System.out.println("31");
              break;
     case "june" : System.out.println("30");
                   break;
     case "july" : System.out.println("31");
                   break; 
     case "august" : System.out.println("31");
                     break;
     case "spetember" : System.out.println("30");
                          break;
     case "october" : System.out.println("31");
                       break;
     case "november" : System.out.println("30");
                       break;
     case "december" : System.out.println("31"); 	
               break;
     default : System.out.println("Please make valid entry");
     }
  }

 }