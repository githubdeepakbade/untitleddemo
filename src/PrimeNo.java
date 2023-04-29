public class PrimeNo
{
    public static void main(String[] args)
    {
        int no=7,Temp=0;
        for (int i=2;i<=no-1;i++)
        {
            if(no%i==0)
            {
                Temp=Temp+1;
            }
        }
          if(Temp>0)
          {
              System.out.println("PrimeNo");
          }
              else
          {
              System.out.println("not ");
          }
    }
}
