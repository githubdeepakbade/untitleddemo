package Array;

public class FindFirstDuplicateElement
{
    public static void main(String[] args)
    {
         int temp=0;
        int[]a={1,4,1,4,7,10,2};
        for (int i = 0; i <a.length ; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j] && (i != j)) {
                    temp = temp + 1;
                    System.out.println("first duplicate elelement"+a[i]+ " ");
                    break;
                }
            }
            if (temp > 0) {
                break;
            }
        }
    }
}
