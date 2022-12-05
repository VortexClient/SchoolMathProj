
import java.util.Scanner;

public class Main {
    public static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static int binomialCoefficient(int n, int k) {
        return factorial(n) / (factorial(k) * factorial(n - k));
    }

    public static double geometricSeries(double firstTerm, double commonRatio, int n) {
        return firstTerm * (1 - Math.pow(commonRatio, n)) / (1 - commonRatio);
    }

    public static void quadraticRoots(double a, double b, double c) {
        double determinant = b * b - 4 * a * c;
        if (determinant > 0) {
            double root1 = (-b + Math.sqrt(determinant)) / (2 * a);
            double root2 = (-b - Math.sqrt(determinant)) / (2 * a);
            System.out.println("The roots are: " + root1 + " and " + root2);
        } else if (determinant == 0) {
            double root = -b / (2 * a);
            System.out.println("The root is: " + root);
        } else {
            System.out.println("The equation has no real roots.");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a value for n: ");
        int n = sc.nextInt();
        System.out.println("Enter a value for k: ");
        int k = sc.nextInt();
        System.out.println("Enter a value for the first term of the geometric series: ");
        double firstTerm = sc.nextDouble();
        System.out.println("Enter a value for the common ratio of the geometric series: ");
        double commonRatio = sc.nextDouble();
        System.out.println("Enter the number of terms in the geometric series: ");
        int numTerms = sc.nextInt();
        System.out.println("Enter the coefficients of the quadratic equation (a, b, c): ");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();

        System.out.println("The factorial of " + n + " is: " + factorial(n));
        System.out.println("The binomial coefficient is: " + binomialCoefficient(n, k));
        System.out.println("The sum of the geometric series is: " + geometricSeries(firstTerm, commonRatio, numTerms));
        quadraticRoots(a, b, c);
    }
}