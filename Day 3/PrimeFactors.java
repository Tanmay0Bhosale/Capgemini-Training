import java.util.Scanner;

public class PrimeFactors {
    public static void calculatePrimeFactors(int n)
    {
        while(n%2 == 0)
        {
            System.out.println(2+"");
            n /= 2;
        }

        for(int i=3;i<=Math.sqrt(n);i+=2)
        {
            while(n%i == 0){
                System.out.println(i + "");
                n /= i;
            }
        }

        if(n>2)
        {
            System.out.println(n + "");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the number for which you want the Prime Factors for!");
        int n = sc.nextInt();
        calculatePrimeFactors(n);
        sc.close();
    }
}
