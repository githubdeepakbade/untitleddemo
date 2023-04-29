package Array;

public class SelectionStringSort1
{
    public static void main(String[] args)
    {
        String[] a={"rahu","nihal","mohit","geet"};
                int min;
        String Temp="";
        for (int i = 0; i <a.length ; i++)
        {
            min=i;
            for (int j = i+1; j <a.length-1-i ; j++)
            {
                if (a[j] .compareTo(a[min])<0)
                {
                    min=j;
                }
                Temp=a[i];
                a[i]=a[min];
                a[min]=Temp;
            }
        }
              for (int i = 0; i <a.length ; i++)
            {
             System.out.print(a[i]+",");
            }
    }
}
