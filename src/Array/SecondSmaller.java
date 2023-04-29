package Array;

public class SecondSmaller
{
    public static void main(String[] args)
    {
        int[]a={6,8,1,2,4,7,9,5,6};
        int temp;
        for (int i = 0; i <a.length; i++)
        {
            for (int j =i+ 1; j <a.length; j++)
            {
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }
        }
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+",");
        }
        System.out.println("second smaller number"+a[1]);
    }
}
