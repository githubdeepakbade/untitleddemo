package Array;

public class kthSmalestEelement
{
    public static void main(String[] args)
    {
        int[]a={5,8,12,7,6,2,1};
        int k=4;
        int temp;
        for (int i = 0; i <a.length ; i++)
        {
            for (int j = i+1; j <a.length ; j++)
            {
                if (a[i]>a[j])
                {
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }

            }if (i==k-1)
            {
                System.out.println(k+"smalest element"+a[i]);
            }
        }
        for (int i = 0; i <a.length ; i++)
        {
            System.out.print(a[i]+",");
        }
    }
}
