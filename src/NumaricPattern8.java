public class NumaricPattern8 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 5; i++) {
            if (i % 2 != 0) {
                for (int j = 1; j <= 3; j++)
                {
                    count = count + 1;
                }
                System.out.print(count + " ");
            }

            else
            {
                    for (int j = 1; j <=3; j++)
                     count=count+1;
                    {
                        System.out.print(count+"");
                    }
            }
            System.out.println();
        }
    }
}

