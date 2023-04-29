import java.util.Scanner;

public class ArmstongNumber1
{
    public static void main(String[] args)
    {
        int lang=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your no");
         int   no = sc.nextInt();
         int t1=no;
        while (t1!=0)
        {
            t1=t1/10;
            lang=lang+1;
        }    int t2=no,rem,arm=0;
             while (t2!=0)
             {
                 rem = t2 % 10;
                 int multi = 1;
                 for (int i=1;i<=lang;i++)
                 {
                     multi=multi*rem;
                 }
                    arm=arm+multi;
                     t2=t2/10;
             }
                       if (no==arm)
                      {
                      System.out.println("no is armstongNumber");
                     }
                       else
                     {
                        System.out.println("no is not armstongNumber");
                     }
    }
}
