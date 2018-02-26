

import java.util.Scanner;
 
class LargestOfThreeNumbers {
   public static void main(String args[]) {
      int x, y, z;
      System.out.println("Enter three integers ");
      Scanner in = new Scanner(System.in);
 
      x = in.nextInt();
      y = in.nextInt();
      z = in.nextInt();
 
      if ( x > y && x > z )
         System.out.println("1st numbers is largest.");
      else if ( y > x && y > z )
         System.out.println("2nd numbers is largest.");
      else if ( z > x && z > y )
         System.out.println("3rd numbers is largest.");
      else   
         System.out.println("Entered numbers are not distinct.");

      if ( x < y && x < z )
         System.out.println("1st numbers is smallest.");
      else if ( y < x && y < z )
         System.out.println("2nd numbers is smallest.");
      else if ( z < x && z < y )
         System.out.println("3rd numbers is smallest.");
      else   
         System.out.println("Entered numbers are not distinct.");
 
   }
}