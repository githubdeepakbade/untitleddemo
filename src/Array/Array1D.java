package Array;

public class Array1D
{
    public static void main(String[] args)
    {
        int[][] a={{12,13,10},{20,30,15}};
        for (int i = 0; i <a.length ; i++)
        {
            for (int j = 0; j <a[i].length ; j++)
            {
                System.out.print(a[i][j]+",");
            }
            System.out.println();
        }
    }
}
