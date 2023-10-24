import java.util.Scanner;

public class StudentActivity {
   public static void main(String[]args) {
      Scanner scan = new Scanner(System.in);
      Student stud = new Student();
      String firstName, middleName, lastName, suffix, fullName; 
      
      System.out.print("First Name: ");
      firstName = stud.setFirstName(scan.nextLine());
      System.out.print("Middle Name: ");
      middleName = stud.setMiddleName(scan.nextLine());
      System.out.print("Last Name: ");
      lastName = stud.setLastName(scan.nextLine());
      System.out.print("Suffix Name: ");
      suffix = stud.setSuffix(scan.nextLine());
      System.out.print("Full Name: " + stud.getFirstName() + " " + stud.getMiddleName()+ " " + stud.getLastName() + " " + stud.getSuffix());
   }
}

class Student {
   String firstName, middleName, lastName, suffix, fullName;
   
   public String setFirstName(String firstName){
      return this.firstName = firstName;
   }
   public String setMiddleName(String middleName){
      return this.middleName = middleName;
   }
   public String setLastName(String lastName){
      return this.lastName = lastName;
   }
   public String setSuffix(String suffix){
      return this.suffix = suffix;
   }
   
   public String getFirstName(){
      return firstName;
   }
   public String getMiddleName(){
      return middleName;
   }
   public String getLastName(){
      return lastName;
   }
   public String getSuffix(){
      return suffix;
   }
 
}