import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Create a Scanner to STDIN
        var s = new Scanner(System.in);

        s.next();  // Read and discard the next token
        double S1 = s.nextDouble();  // Read the first double value
        s.next();  // Read and discard the next token
        double c = s.nextDouble();  // Read the second double value
        s.next();  // Read and discard the next token
        double g = s.nextDouble();  // Read the third double value

        // first order with sigma

        System.out.println("S(n) = "+c+"^(n-1) * "+S1+"+ sigma("+c+"^(n-i) * "+g);
        int n = 10;  // Number of terms to calculate
        for (int i = 1; i <= n; i++) {
            double sum = 0;
            //loop for sigma
            for (int j = 2; j <= i; j++) {
                double fiTimesG = Math.pow(c, i - j) * g;
                sum += fiTimesG;
            }
            //solving the term
            double Sn = Math.pow(c, i - 1) * S1 + sum;
            System.out.println("S(" + i + ") = " + Sn);
        }
    }
}
