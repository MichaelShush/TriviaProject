public class MathGame {

    private int a;
    private int b;
    private int c;

    public MathGame(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
//    String[][] quadratics =  {
//            {"3x^2 + x = 0", "-3x^2 + x + 4 = 0", "x^2 + 5x - 14 = 0"},
//            {"0",}
//    }

    public void linearEquations() {
        String equation = "Solve for x: ";
        equation += a + "x ";
        if (b>0) {
            equation += "+ " + b;
        } else if (b < 0) {
            equation += b;
        }
        equation += " = " + c;
        System.out.println(equation);
    }

    public double linearAnswer() {
        return (double)(c - b)/a;
    }

    public void checkLinear(double answer) {
        if (answer == linearAnswer()) {
            System.out.println("Correct! x = " + linearAnswer());
        } else {
            System.out.println("Incorrect. x = " + linearAnswer());
        }
    }


    public void triangleArea() {
        System.out.println("What is the area of a triangle with length" + a + " and height " + b + "?");
    }

    public double areaTriangle() {
        return (a*b)/2.0;
    }

    public void checkTri(double answer) {
        if (answer == areaTriangle()) {
            System.out.println("Correct! The answer is " + areaTriangle());
        } else {
            System.out.println("Incorrect. The answer is " + areaTriangle());
        }
    }

    public void trapezoidArea() {
        System.out.println("What is the area of a trapezoid with base lengths of " + a + " and " + b + " and height " + c + "?");
    }
    public double areaTrapezoid() {
        return ((a+b)/2.0)*c;
    }

    public void checkTrap(double answer) {
        if (answer == areaTrapezoid()) {
            System.out.println("Correct! The answer is " + areaTrapezoid());
        } else {
            System.out.println("Incorrect. The answer is " + areaTrapezoid());
        }
    }
}
