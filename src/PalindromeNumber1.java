import java.io.InputStream;
import java.util.Scanner;

public class PalindromeNumber1
{
    public static void main(String[] args)
    {
        int no ,rev=0, rem =0 ;
        Scanner sc=new Scanner(System.in);
        System.out.println(" enter your no");
          no = sc.nextInt();
          int temp =no;
          while (temp!=0)
        {
            rem = temp % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }
        if(no==rev)
        {
            System.out.printf(no+"  palindromNumber no");
        }
        else
        {
            System.out.printf( no+"   not a palindromanumber no");

        }
    }
}
