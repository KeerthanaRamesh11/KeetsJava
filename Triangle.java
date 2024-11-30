import java.util.Scanner;
class Triangle
{
    public static void main(String[] args)
    {
        System.out.println("Enter an input:");
        Scanner sc = new Scanner(System.in);
        int angle1 = sc.nextInt();
        int angle2 = sc.nextInt();
        int angle3 = sc.nextInt();
        int triangle = angle1 + angle2 + angle3;
        if (triangle == 180)
        {
            System.out.println("Triangle can be formed");
        } 
        else 
        {
            System.out.println("Triangle cannot be formed");
        }
    }
}
