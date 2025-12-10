import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want the sequence of the Harmonic Number");
        int n = sc.nextInt();
        float harmonicNumber = 0.0f;
        for(int i=1; i<=n;i++)
        {   
            harmonicNumber += 1.0/i;
            System.out.println(harmonicNumber);
        }
    sc.close();
    }

}
