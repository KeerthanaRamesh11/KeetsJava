import java.util.Scanner;
class Forloop 
{
    public static void main(String[] args) 
  {
        System.out.println("Enter a value:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        for (int i = 100; i <= 1000; i += 100)
        {
            System.out.println(i);
        }
    }
}
