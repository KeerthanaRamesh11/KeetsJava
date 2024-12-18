import java.util.Scanner;
class CountingDigitsInNum
{
    public static void main(String[] args)
    {
        System.out.println("Enter a value: ");
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int n = sc.nextInt();
        while(n>0)
        {
            int lD = n%10;
            count = count + 1;
            n = n/10;
        }
        System.out.println("No of digits in the value is: " + count);
    }
}
