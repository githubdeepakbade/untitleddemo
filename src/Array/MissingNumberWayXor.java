package Array;

public class MissingNumberWayXor
{
    public static void main(String[] args)
    {
        int[]a={1,2,3,4,6};
        int xor1=a[0];
        for (int i = 1; i <a.length ; i++)
        {
            xor1=xor1+a[i];
        }
        int xor2=a[1];
        for (int i = 2; i <a.length ; i++)
        {
            xor2=xor1+a[i];
        }
        System.out.println("missing no is:"+(xor1^xor2));
    }
}
