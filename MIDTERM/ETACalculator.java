import java.util.Scanner;

public class ETACalculator {

   static double totalDistance = 0, dHours;
   static int min;
   static int hr;
   
   public static void main(String[]args) {
      Scanner scan = new Scanner(System.in);
      int x, y, z;
      
      System.out.println("Estimate Time Of Arrival");
      System.out.println("Enter Speed: ");
      x = scan.nextInt();
      
      System.out.println("Is The Route Through Baliri Available?");
      System.out.println("(1) Yes \t (2) No");
      y = scan.nextInt();
      
      System.out.println("Cebu City\t(Emall)");
      System.out.println("Route 1\t\t(Minglanilla)");
      System.out.println("Route 2\t\t(San Fernando)");
      System.out.println("Route 3\t\t(Carcar)");
      
      if (y == 1) {
         System.out.println("Route 4.1\t(Barili)");
         System.out.println("Route 4.1.1\t(Dumanjug)");
         System.out.println("Route 4.1.2\t(Alcantara)");
         RouteBaliri(x);
      }
      else if (y == 2) {
         System.out.println("Is Dumanjug obstructed? ");
         System.out.println("(1) No\t(2) Yes");
         z = scan.nextInt();
         
         switch (z) {
            case 1:
               System.out.println("Route 4.2\t(Sibonga)");
               System.out.println("Route 4.2.1\t(Dumanjug)");
               System.out.println("Route 4.2.2\t(Alcantara)");
               RouteDumanjug(x);
               break;
            case 2:
               System.out.println("Route 5\t\t(Argao)");
               System.out.println("Route 5.1\t(Ronda)");
               System.out.println("Route 5.2\t(Alcantara)");
               RouteArgao(x);
               break;
         }
      scan.close();
      }
   }
   public static void RouteBaliri(int speed) {
      totalDistance = 84.9;
      
      dHours = totalDistance / speed; // Calculate hours as a double
      hr = (int) dHours; // Get the integer part as full hours
      min = (int) ((dHours - hr) * 60); // Calculate remaining minutes
      
      printOut(speed);
   }
   public static void RouteDumanjug(int speed) {
      totalDistance = 96.2;
      
      dHours = totalDistance / speed;
      hr = (int) dHours; 
      min = (int) ((dHours - hr) * 60);
      
      printOut(speed);
   }
   public static void RouteArgao(int speed) {
      totalDistance = 102.4;
      
      dHours = totalDistance / speed;
      hr = (int) dHours; 
      min = (int) ((dHours - hr) * 60);
      
      printOut(speed);
   }
   public static void printOut(int speed) {
      System.out.println("\nSpeed: " + speed + " kmph");
      System.out.println("Total Distance: " + totalDistance + " km");
      System.out.println("Est. Time of Arrival: " + hr + " Hour(s) " + min + " Minute(s)");
   }
}