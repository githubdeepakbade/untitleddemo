package Array;

public class InsertElementinArray
{
    public static void main(String[] args)
    {
        int[] a={10,20,30,40,50};
        int pos=3;
        int element=100;
        for (int i = a.length-1; i>pos; i--)
        {
            a[i]=a[i-1];
        }
            a[pos]=element;
        for (int i = 0; i <a.length ; i++)
        {
            System.out.println(a[i]+"");
        }
    }
}
