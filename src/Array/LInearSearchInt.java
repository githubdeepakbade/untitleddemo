package Array;

public class LInearSearchInt
{
    public static void main(String[] args)
    {
        int item=2;
        int temp=0;
        int [] arr={4,7,2,9,5,8};
        for (int i = 0; i <arr.length ; i++)
        {
            if (arr[i] == item)
            {
                System.out.println("item is present at" + i + "index position");
                temp=temp+1;
            }
        }
        if (temp == 0)
        {
            System.out.println("item not present in the list");
        }
    }
}
