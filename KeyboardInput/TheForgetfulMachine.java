import java.util.Scanner;

public class TheForgetfulMachine {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Give me a word! ");
        String word = input.next();
        
        System.out.print("Give me a second word! ");
        String second = input.next();
    
        System.out.println("         ");
        
        System.out.print("Great, now your favorite number? ");
        int number = input.nextInt();
        
        System.out.print("And your second-favorite number... ");
        int numbertwo = input.nextInt();
        
        System.out.println("          ");
        
        System.out.println("Whew! Wasn't that fun?");
     }
}
