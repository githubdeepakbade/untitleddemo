package Array;

public class BinarySearch
{
    public static void main(String[] args)
    {
        int [] a ={2,5,7,9,12,14,16,17,19,20,28};
        int Srch=9;
        int li=0;
        int hi=a.length-1;
        int mi=(li+hi)/2;
        while (li<=hi)
        {
            if (a[mi] == Srch)
            {
                System.out.println("element is present at" + mi + "index position");
            } else if (a[mi] < Srch)
            {
                li = mi + 1;
            }
            else
            {
                hi = mi - 1;
            }
            mi=(li+hi)/2;
        }
        if (li>hi)
        {

            System.out.print("element is not found");
        }

    }
}
