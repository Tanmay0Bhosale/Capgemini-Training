import java.util.Scanner;

public class LargestAmongThreeNumbers {
    public static void check(int a,int b, int c)
    {
        int largest=a;
        if(b> largest){
            largest = b;
        }
        if(c>largest){
            largest = c;
        }

        System.out.println("Largest Number : " + largest);
    }
    public static void main(String[] args) {
        System.out.println("Entere three Numbers:");
        Scanner sc = new Scanner(System.in);
        System.out.println("A : ");
        int a = sc.nextInt();
        System.out.println("B : ");
        int b = sc.nextInt();
        System.out.println("C : ");
        int c = sc.nextInt();

        check( a, b, c);
        sc.close();
    }
}
