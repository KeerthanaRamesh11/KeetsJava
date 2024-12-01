import java.util.Scanner;
class PrintingName 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter your Firstname:");
        System.out.println("Enter your Lastname:");
        Scanner sc = new Scanner(System.in);
        String firstname = sc.next();
        String lastname = sc.next();
        String fullname = firstname + lastname;
        System.out.println("Enter a value:");
        int n = sc.nextInt();
        for(int i = 1; i <= 5; i++)
        {
        System.out.println("Your Fullname is: " + fullname);
        }
    }
}
