package safari.ali.java;

public class RootsOfQuadraticEq {
    /*
    * The standard form of a quadratic equation is:
        ax2 + bx + c = 0, where
        a, b and c are real numbers and
        a ≠ 0
        *
        * The term b2-4ac is known as the determinant of a quadratic equation. The determinant
        * tells the nature of the roots.
        If determinant is greater than 0, the roots are real and different.
        If determinant is equal to 0, the roots are real and equal.
        If determinant is less than 0, the roots are complex and different.
    */

    public static void main(String[] args) {

        double a = 5, b = 40, c = 5.6;
        double root1, root2;

        double determinant = Math.pow(b,2) - 4 * a * c;

        // condition for real and different roots
        if(determinant > 0) {
            root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            root2 = (-b - Math.sqrt(determinant)) / (2 * a);

            System.out.format("root1 = %.2f and root2 = %.2f", root1 , root2);
//          System.out.printf("root1 = %.2f and root2 = %.2f", root1 , root2);
        }
        // Condition for real and equal roots
        else if(determinant == 0) {
            root1 = root2 = -b / (2 * a);

            System.out.format("root1 = root2 = %.2f;", root1);
//          System.out.printf("root1 = root2 = %.2f;", root1);

        }
        // If roots are not real
        else {
            double realPart = -b / (2 *a);
            double imaginaryPart = Math.sqrt(-determinant) / (2 * a);

            System.out.format("root1 = %.2f+%.2fi and root2 = %.2f-%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
        }
    }
}
