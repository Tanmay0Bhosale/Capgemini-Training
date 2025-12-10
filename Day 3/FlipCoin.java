import java.util.Scanner;
class FlipCoin
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tell me how many times we want to flip the coin");
        int n = sc.nextInt();

        if(n<=0)
        {
            System.out.println("Please enter a positive number");
            return;
        }

        int heads = 0;
        int tails = 0;

        for(int i=0;i<n;i++)
        {
            double random = Math.random();

            if(random < 0.5)
            {
                tails++;
            }else
            {
                heads++;
            }
        }

        double hPercentage = (heads * 100) /n;
        double tPercentage = (tails * 100) /n;

        System.out.println("Heads Percentage : "+ hPercentage +"% Number of Heads : " + heads + "");
        System.out.println("Tails Percentage : "+ tPercentage +"% Number of Tails : " + tails + "");

        sc.close();
    }
}