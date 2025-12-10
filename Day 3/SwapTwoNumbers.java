import java.util.Scanner;

public class SwapTwoNumbers {
    public static void swap(int a, int b){
        int temp = a;
        a = b;
        b = temp;
        System.out.println("A--> " + a + " B--> " + b +"");

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the two numbers for swapping");
        System.out.println("Enter A:");
        int a = sc.nextInt();
        System.out.println("Enter B:");
        int b = sc.nextInt();
        swap(a,b);
    }
}
