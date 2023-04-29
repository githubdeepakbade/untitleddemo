package Array;

public class DuplicteElementWay1
{
    public static void main(String[] args)
    {
        int[]a={4,5,9,3,5,8,3,9,};//rute force method//
        for (int i = 0; i <a.length-1 ; i++)
        {
            for (int j = i+1; j <a.length ; j++)
            {
                if (a[i]==a[j] && (i!=j))
                {
                    System.out.print(a[i]+",");
                }
            }
        }
    }
}
