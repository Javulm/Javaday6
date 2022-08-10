package junittesting;

import java.util.Scanner; 

class utilityMonthlyPay{

    Scanner sc = new Scanner(System.in);  // create object

    public utilityMonthlyPay() {

        System.out.println("thank-you for using me to calculate monthly payment of your loan.");

        System.out.print("Enter your principle loan amount : ");

        int pLoanAmount = sc.nextInt();

        System.out.print("Enter loan period : ");

        int loanPeriod = sc.nextInt();

        System.out.print("Enter interest on loan amount : ");

        double interestLoan = sc.nextInt();

        double r = interestLoan/(12*100);

        int n = 12*loanPeriod;

        double payment = pLoanAmount *r/(1-(Math.pow((1+r),-n)));

        System.out.println("Payment of load per month is : " + payment);

    }
}
public class MonthlyPay {
    public static void main(String[] args) {
        utilityMonthlyPay payment = new utilityMonthlyPay();

    }
}
