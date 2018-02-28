import java.util.Scanner;

public class Scenarios {
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
       System.out.print("how tall are you");
       int height = input.nextInt();
       
       if(height > 150) {
          System.out.println("You may pass");
        } 
     
       if(height < 150) {
          System.out.println("You shall not pass");
        }
  }
}
