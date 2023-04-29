public class ArmstongNumber
{
    public static void main(String[] args)
    {

        int no = 121, t1 = no, leng = 0;
        while (t1 != 0)
        {
            leng = leng + 1;
            t1 = t1 / 10;
        }

           {
             int t2 = no, rem, arm = 0;
             while (t2 != 0)
             {
                int mult = 1;
                rem = t2 % 10;

                for (int i = 1; i <= leng; i++)
                {
                    mult = mult * rem;
                }
                    arm = arm + mult;
                      t2 = t2 / 10;
             }
                  if (arm == no)
                  {
                      System.out.println(no + " is no Armstrong Number");
                   }
                  else
                  {
                   System.out.println(no + "is not Armstrong Number");
                   }
        }

    }
}



