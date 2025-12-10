import java.util.Scanner;
class Poweroftwo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number till where you want the powers of N");
        int n = sc.nextInt();
        for(int i = 0; i< n; i++){
            System.out.println(Math.pow(2, i ) );
        }
        sc.close();
    }
}
