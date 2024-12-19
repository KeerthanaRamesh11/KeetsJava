import java.util.Scanner;
class Palindrome
{
    public static void main(String[] args)
    {
        System.out.println("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        while(n>0)
        {
            int l = n%10;
            sum = sum * 10 + (l);
            n = n/10;
        }
        if (sum==n)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not a Palindrome");
        }
    }
}
