import java.util.Scanner;
class Main
{
    public static void main(String[] args)
    {
        System.out.println("Enter an input");
        Scanner sc = new Scanner(System.in);
        int num=sc.nextInt();
        String word=sc.next();
        char letter=sc.next().charAt(0);
        System.out.println("Number is: " + num);
        System.out.println("Word is: " + word);
        System.out.println("Letter is: " + letter);
    }
}
