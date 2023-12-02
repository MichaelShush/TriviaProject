import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean testComplete = false;

        System.out.println("Hello, and welcome to the brain game party pack!!!");
        System.out.println("You can pick between a history trivia, a math quiz, or hangman!");
        System.out.print("Select one now (history, math, or hangman): ");
        String selectedChoice = scan.nextLine();

        if (selectedChoice.toLowerCase().equals("history")){
            System.out.println("Welcome to the history trivia!");
            System.out.println();
            System.out.println("You will be able to pick questions from 5 difficulties, and completing a question of each difficulty gives you more points per difficulty increase.");
            System.out.println("Remember, spelling WILL be important for this trivia.");
            System.out.println("Good luck!");
            Trivia history = new Trivia();
            int questionNumber = 0;
            int pointsEarned = 0;

            while (questionNumber < 5){
                questionNumber++;
                int randomOneToFour = (int)(Math.random() * 5);
                System.out.print("What difficulty would you like to select?(1 through 5) ");
                int selectedDifficulty = scan.nextInt();
                System.out.println("Question number " + questionNumber + ".");
                System.out.println("Difficulty level: " + selectedDifficulty);
                System.out.println("Your question is: " + history.getQuestion(selectedDifficulty - 1, randomOneToFour));
                System.out.print("Answer here: ");
                scan.reset();
                String answer = scan.nextLine();
                if (history.checkAnswer(selectedDifficulty - 1, randomOneToFour, answer)){
                    System.out.println("Correct! You get " + (selectedDifficulty * 100 + " points."));
                    pointsEarned += (selectedDifficulty * 100);
                    System.out.println();
                } else{
                    System.out.println("Wrong. The correct answer was: \"" + history.getAnswer(selectedDifficulty - 1, randomOneToFour) + "\".");
                    System.out.println();
                }
            }
        } else if(selectedChoice.toLowerCase().equals("math")){
            System.out.print("Welcome to the math quiz!");
        } else if(selectedChoice.toLowerCase().equals("hangman")){
            System.out.print("Welcome to hangman!");
        }
    }
}