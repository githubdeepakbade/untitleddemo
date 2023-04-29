import java.util.Scanner;
public class FibonacciSeries1
{
    public static void main(String[] args)
    {
        int term, a=0,b=1,c;
        System.out.println("Enter the your team");
        Scanner sc= new Scanner(System.in);
           term = sc.nextInt();
        for (int i = 1; i<=term; i++)
        {
            c = a+b;
            System.out.println(c);
               a=b;
               b=c;
        }
    }
}
