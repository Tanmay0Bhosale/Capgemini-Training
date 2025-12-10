import java.util.Scanner;

public class OddEven {
    public static void OddEven(int n )
    {
        if(n%2 == 0){
            System.out.println("The number is Even");
        }else{
            System.out.println("It is odd");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number :");
        int n = sc.nextInt();
        OddEven(n);
        sc.close();
    }
}
