import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Principal: " );
        int principal = scanner.nextInt();

        System.out.print("Annual Interest Rate: " );
        float annualRate = scanner.nextFloat();
        float monthlyInterestRate = (annualRate /100) /12;

        System.out.print("Period (Years): " );
        int period = scanner.nextInt();
        int numberOfPayments = period * 12;

        double mortgage = principal
                * (monthlyInterestRate * Math.pow (1+ monthlyInterestRate, numberOfPayments))
                / (Math.pow(1+ monthlyInterestRate, numberOfPayments) -1) ;
        System.out.println(mortgage);

    }
}