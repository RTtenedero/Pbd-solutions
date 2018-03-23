import java.util.Scanner;
public class Count {
    public static void main(String[] args) {
     Scanner Cal = new Scanner(System.in);
    
  System.out.println("Type in a message and I'll display it five times");
  System.out.print("Message: ");
  String message = Cal.nextLine();
   
   for(int x = 1; x < 11; x+= 1) {
     System.out.println(x + ". " + message);
   }
  }
}
