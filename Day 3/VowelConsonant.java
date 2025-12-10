import java.util.Scanner;

public class VowelConsonant {

    public static void check(char ch)
    {
        if(ch== 'a'|| ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("It is a vowel");
        }else{
            System.out.println("It is a Consonant");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please Enter the Char: ");
        char ch = sc.next().toLowerCase().charAt(0);
        check(ch);
        sc.close();
    }
}
