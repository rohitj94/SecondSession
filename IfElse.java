import java.util.*;

class IfElse
 {
   public static void main(String args[])

   {
   
   Scanner s = new Scanner(System.in);
 
   System.out.println("Enter Your age");
   
   int a = s.nextInt();
   
   if(a>=18)
   System.out.println("Can Vote");
   else
   System.out.println("Can't Vote");

   }
 }