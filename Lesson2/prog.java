import java.util.Scanner;
import java.util.Date;  
    
public class prog{
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in); 
    Date date = new Date();
    System.out.print("Name:");
    String Name = input.next();
    System.out.print("Surname:");
    String Surname = input.next();
    System.out.println(Name + " " + Surname + ", lesson 2 is finished.");
    System.out.println(date);   
    }
}