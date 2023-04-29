package Array;

public class MinSearch
{
    public static void main(String[] args)
    {
        int [] a={4,5,1,8,9,18};
        int max=a[0];
        for (int i = 0; i <a.length ; i++)
        {
            if (max>a[i])
            {
                max=a[i];
            }
        } System.out.println("max is"+max);
    }
}
