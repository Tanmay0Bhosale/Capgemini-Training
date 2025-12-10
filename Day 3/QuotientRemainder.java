import java.util.Scanner;

public class QuotientRemainder
{
    public static void calc(int dividend,int divisor)
    {
        int quotient = dividend/divisor;
        System.out.println(quotient + "---->Quotient");
        int remainder = dividend%divisor;
        System.out.println(remainder+"---->Remainder");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Dividend:");
        int dividend = sc.nextInt();
        System.out.println("Please Enter the Divisor:");
        int divisor = sc.nextInt();
        calc(dividend,divisor);
        sc.close();
    }
}