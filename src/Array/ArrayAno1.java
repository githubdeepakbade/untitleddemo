package Array;
public class ArrayAno1
{
    public static void main(String[] args)
    {
        ArrayAno1.sum(new int[][]{{1,2,3,4}});
    }
    static void sum(int[][] no)
    {
        int total = 0;
                for(int[] ii:no)
                {
                    for (int i:ii)
                    {
                        total = total + i;
                    }
                }
                System.out.println("sum is:"+total);
    }
}
