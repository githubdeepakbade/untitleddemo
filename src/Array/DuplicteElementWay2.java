package Array;

import java.util.Set;
  import java.util.HashSet;

public class DuplicteElementWay2
{
    public static void main(String[] args)
    {
        System.out.println("duplicat element:-");
        int[]a={1,2,3,7,5,7,6,1};
        Set<Integer>s=new HashSet<>();
        for (int no:a)
        {
            if (s.add(no) == false)
            {
                System.out.print(no+",");
            }
        }

    }
}
