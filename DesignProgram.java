import java.util.*;

class DesignProgram
 {
   public static void main(String agrs[])
   {
     int n;
     
     n = Integer.parseInt(agrs[0]);
    
     for(int i = 1; i<=n; i++)
     {
       for(int j = 1; j<=i; j++)
      {
        System.out.print(j);
      }
      System.out.println();
     }

     int k = n;

     while(k>=1)
    {
     for (int j = k-1 ; j>=1; j--)
     {
       System.out.print(j);
     }
     k--;
     System.out.println();
    }
    }
 }