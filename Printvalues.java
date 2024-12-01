import java.util.Scanner;
class Printvalues
{
    public static void main(String[] args) 
    {
        System.out.println("x:");
        System.out.println("y:");
        Scanner sc=new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        for (int i = 1; i <=3; i++)
        {
        System.out.println(x);
        }
    }
}
