package Array;

public class FindSingleRepeated
{
    public static void main(String[] args)
    {
        int[]a={1,2,3,5,9,1,2,3};
        int res=a[0];
        for (int i = 1; i <a.length ; i++)
        {
            for (int j = 0; j <a.length ; j++)
            {
                res=res^a[i];
            }
            System.out.println(""+res);
        }
    }
}
