import java.util.Scanner;
class Pattern3
  {
    public static void main(String[] args)
    {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a value:");
      int n = 6;
      for(int i=1; i<=n; i++)
      {
        for(int j=1; j<=i; j++)
        {
          System.out.print(i + " ");
        }
        System.out.println();
      }
    }

  }
