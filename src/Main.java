import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Hello, and welcome to the brain game party pack!!!");
        System.out.println("You can pick between a trivia game, a math quiz, or placeholder!");
        System.out.print("Select one now (trivia, math, or placeholder): ");
        String selectedChoice = scan.nextLine();

        if (selectedChoice.toLowerCase().equals("trivia")){
            System.out.print("You selected the Trivia game! Select your category: history, computer science, or movies? ");
            scan.nextLine();
            String type = scan.nextLine();
            Trivia trivia = new Trivia(type);
        }
    }
}