public class MathGame {
    private int a;
    private int b;
    private int c;
    private int d;
    private int e;
    private int f;
    public MathGame(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public void systemOfEquations() {
        this.d = (int)(Math.random()*201-100);
        this.e = (int)(Math.random()*201-100);
        this.f = (int)(Math.random()*201-100);

        System.out.println("Solve for x and y.\n");
        String equation1 = a + "x ";
        if (b >0) {
            equation1 += "+ " + b;
        } else if (b < 0){
            equation1 += b;
        }
        equation1 += "y = " + c;

        String equation2 = d + "y ";
        if (e >0) {
            equation2 += "+ " + e;
        } else if (e < 0) {
            equation2 += e;
        }
        equation2 += "x = " + f;

        System.out.println(equation1 + "\n" + equation2);
    }
    public double systemAnswerX() {
        return Math.round(((double)(c*d-b*f)/(a*d-b*e))*100)/100.0;
    }
    public double systemAnswerY() {
        return Math.round(((double)(a*f-e*c)/(a*d-b*e))*100)/100.0;
    }
    public void checkSystem(double x, double y) {
        if (x == systemAnswerX() && y == systemAnswerY()) {
            System.out.println("Correct! x = " + systemAnswerX() + ", y = " + systemAnswerY());
        } else {
            System.out.println("Incorrect. x = " + systemAnswerX() + ", y = " + systemAnswerY());
        }
    }
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
        return Math.round(((double)(c - b)/a)*100)/100.0;
    }
    public void checkLinear(double answer) {
        if (answer == linearAnswer()) {
            System.out.println("Correct! x = " + linearAnswer());
        } else {
            System.out.println("Incorrect. x = " + linearAnswer());
        }
    }
    public void triangleArea() {
        System.out.println("What is the area of a triangle with length " + Math.abs(a) + " and height " + Math.abs(b) + "?");
    }
    public double areaTriangle() {
        return Math.round((Math.abs(a*b)/2.0)*100)/100.0;
    }
    public void checkTri(double answer) {
        if (answer == areaTriangle()) {
            System.out.println("Correct! The answer is " + areaTriangle());
        } else {
            System.out.println("Incorrect. The answer is " + areaTriangle());
        }
    }
    public void trapezoidArea() {
        System.out.println("What is the area of a trapezoid with base lengths of " + Math.abs(a) + " and " + Math.abs(b) + " and height " + Math.abs(c) + "?");
    }
    public double areaTrapezoid() {
        return Math.round((((((Math.abs(a)+Math.abs(b))*c/2.0))*100)))/100.0;
    }
    public void checkTrap(double answer) {
        if (answer == areaTrapezoid()) {
            System.out.println("Correct! The answer is " + areaTrapezoid());
        } else {
            System.out.println("Incorrect. The answer is " + areaTrapezoid());
        }
    }
    public void prismVolume() {
        System.out.println("What is the volume of a rectangular prism with length " + Math.abs(a) + ", width " + Math.abs(b) + ", and height " + Math.abs(c));
    }
    public double volumePrism() {
        return Math.abs(a*b*c);
    }
    public void checkPrism(double answer) {
        if (answer == volumePrism()) {
            System.out.println("Correct! The answer is " + volumePrism());
        } else {
            System.out.println("Incorrect. The answer is " + volumePrism());
        }
    }

    public void pyramidVolume() {
        System.out.println("Find the volume of a square pyramid with base length " + Math.abs(a) + " and height " + Math.abs(b));
    }

    public double volumePyramid() {
        return Math.round((Math.abs(((Math.pow(a, 2)))*b)/3)*100)/100.0;
    }

    public void checkPyramid(double answer) {
        if (answer == volumePyramid()) {
            System.out.println("Correct! The answer is " + volumePyramid());
        } else {
            System.out.println("Incorrect. The answer is " + volumePyramid());
        }
    }
}
