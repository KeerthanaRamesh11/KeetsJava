import java.util.Scanner;
class CountDivisors
{
    public static void main(String[] Args)
    {
        System.out.println("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for(int i=1; i*i<=N; i++)
        {
            if(N%i == 0)
            {
                if(i%3 == 0)
                {
                count++;
                }
                if(i != (N/i) && (N/i)%3 == 0)
                {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
