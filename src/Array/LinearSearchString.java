package Array;

public class LinearSearchString
{
    public static void main(String[] args)
    {
        String [] arr={"deepak","mohit","geeta","rasmi"};
        String item="rasmi";
        int temp=0;
        for (int i = 0; i <arr.length; i++)
        {
            if (arr[i].equals(item))
            {
                System.out.println("item is present at" + i + "index position");
                temp=temp+1;
            }
        }
        if (temp==0)
        {
            System.out.println("item is not present");
        }
    }
}
