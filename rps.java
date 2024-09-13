import java.util.*;
import java.util.random.*;

public class rps {

     public static void main(String[] args) {
        System.out.println("Enter 0 for Rock , 1 for Paper , 2 for Scissor");

        Scanner sc = new Scanner(System.in);
        int userInput = sc.nextInt();

        Random obj = new Random();

        int computer_choice = obj.nextInt( 3);

        if(userInput == computer_choice)
        {
            System.out.println("Draw");
        }
        else if (userInput == 1 && computer_choice == 0 ||userInput ==2 && computer_choice == 1 || userInput == 0 && computer_choice == 2)
        {
            System.out.println("Win!");
        }
        else
        {
            System.out.println("Lose the game");
            
        }
        System.out.println("Computer choice : "+computer_choice);

     }
}