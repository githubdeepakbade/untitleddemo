package Array;

public class MaxSubSumArray
{
    public static void main(String[] args)
    {
        int[]a={4,-3,-3,4,-1,-2,1,5,-3};
        int max_so_for=Integer.MIN_VALUE;
        int max_endind_here=0;
        for (int i = 0; i <a.length ; i++) {
            max_endind_here = max_so_for + a[i];
            if (max_so_for < max_endind_here) {
                max_so_for = max_endind_here;
            }
            if (max_endind_here < 0) ;
            {
                max_endind_here = 0;
            }
        }
        System.out.println(max_so_for);

    }
}
