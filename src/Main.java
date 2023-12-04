import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean run = true;
        boolean math = false;
        boolean trivia = false;
        boolean hangman = false;
        boolean win = false;

        boolean testComplete = false;

        while (run) {
            System.out.println("Hello, and welcome to the brain game party pack!!!");
            System.out.println("You can pick between a history trivia, a math quiz, or hangman!");
            System.out.print("Select one now (history, math, or hangman, or 'quit' to exit): ");
            String selectedChoice = scan.nextLine();
            if (selectedChoice.toLowerCase().equals("history")){
                trivia = true;

            } else if(selectedChoice.toLowerCase().equals("math")){
                math = true;
            } else if(selectedChoice.toLowerCase().equals("hangman")){
                hangman = true;
                System.out.println();
                System.out.print("Welcome to hangman!");
            } else if (selectedChoice.toLowerCase().equals("quit")) {
                run = false;
            }
            while (trivia) {
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
                    int selectedDifficulty = Integer.parseInt(scan.nextLine());
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
                System.out.println("Game over.");
                System.out.println("Score: " + pointsEarned);
                System.out.println("-------------------------------\n");
                trivia = false;
            }
            while (math) {
                int a,b,c;
                a = (int)(Math.random()*201-100);
                b = (int)(Math.random()*201-100);
                c = (int)(Math.random()*201-100);
                MathGame m = new MathGame(a, b, c);
                System.out.println();
                System.out.println("---------------------------");
                System.out.println("1. Linear Equations");
                System.out.println("2. System of Equations");
                System.out.println("3. Area of Triangles");
                System.out.println("4. Area of Trapezoids");
                System.out.println("5. Volume of Rectangular Prisms");
                System.out.println("6. Volume of Square-Based Pyramids");
                System.out.println("---------------------------");
                System.out.println("REMEMBER! All answers are rounded to the nearest HUNDREDTH");
                System.out.println("Select a problem type. (ex: 1 or 'one')");
                String mathChoice = scan.next();
                if (mathChoice.equals("1") || mathChoice.equals("one")) {
                    m.linearEquations();
                    double answer = scan.nextDouble();
                    m.checkLinear(answer);
                } else if (mathChoice.equals("2") || mathChoice.equals("two")) {
                    m.systemOfEquations();
                    System.out.println("Enter x value: ");
                    double answerX = scan.nextDouble();
                    System.out.println("Enter y value: ");
                    double answerY = scan.nextDouble();
                    m.checkSystem(answerX, answerY);
                } else if (mathChoice.equals("3") || mathChoice.equals("three")) {
                    m.triangleArea();
                    double answer = scan.nextDouble();
                    m.checkTri(answer);
                } else if (mathChoice.equals("4") || mathChoice.equals("four")) {
                    m.trapezoidArea();
                    double answer = scan.nextDouble();
                    m.checkTrap(answer);
                } else if (mathChoice.equals("5") || mathChoice.equals("five")) {
                    m.prismVolume();
                    double answer = scan.nextDouble();
                    m.checkPrism(answer);
                } else if (mathChoice.equals("6") || mathChoice.equals("six")) {
                    m.pyramidVolume();
                    double answer = scan.nextDouble();
                    m.checkPyramid(answer);
                }
                System.out.println("Play again? y/n");
                String replayMath = scan.next();
                if (replayMath.equals("n")) {
                    math = false;
                }
            }

            while (hangman) {
                Hangman hangmanGame = new Hangman();

                System.out.println();
                System.out.println("You can pick from 3 difficulties, each corresponding with the amount of letters in the word.");
                System.out.println("Your attempts will scale with difficulty.");
                System.out.println("An attempt will not be used if the letter you have selected is in the word.");
                System.out.print("Select now: 4, 5, or 6 ");
                scan.reset();
                int difficulty = Integer.parseInt(scan.nextLine());
                hangmanGame.setWord(difficulty);
                int attempts = 0;
                String progress = hangmanGame.revealed;
                String usedLetters = "";
                String input = "";
                System.out.println();

                while(attempts != (difficulty + 3)){
                    System.out.println("Your progress: " + hangmanGame.revealed);
                    System.out.println("You have " + ((difficulty + 3) - attempts) + " attempts remaining.");
                    System.out.print("Please input any letter: ");
                    scan.reset();
                    input = scan.nextLine();
                    hangmanGame.checkLetter(input);
                    if (progress.equals(hangmanGame.revealed)){
                        attempts++;
                    }
                    progress = hangmanGame.revealed;
                    System.out.println();
                    if (progress.equals(hangmanGame.getWord())){
                        attempts = difficulty + 3;
                        win = true;
                        System.out.println("Your progress: " + hangmanGame.revealed);
                    }
                }
                if (win){
                    System.out.println("Congratulations. You win!");
                    System.out.println();
                } else{
                    System.out.println("The word was: " + hangmanGame.getWord() + ".");
                    System.out.println("You lost. Better luck next time!");
                    System.out.println();
                }
                System.out.print("Would you like to play again? (y/n)");
                String replayHangman = scan.nextLine();
                if (replayHangman.equals("n")){
                    hangman = false;
                }
            }
        System.out.println("Thank you for playing!");
        System.out.println();
        }
    }
}