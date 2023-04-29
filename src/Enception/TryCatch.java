package Enception;

public class TryCatch
{
    public static void main(String[] args)
    {
        try
        {
            int a=100,b=0,c;
            c=a/b;
            System.out.println(c);
        }
        catch (Exception e)
        {
         //   System.out.println(e);//
          //  e.printStackTrace();//
          //  System.out.println(e.toString());//
            System.out.println(e.getMessage());
        }
    }
}
