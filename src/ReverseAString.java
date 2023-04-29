public class ReverseAString
{
    public static void main(String[] args)
    {
        String name="deepak";
        int leng=name.length();
        String Rev="";
        for(int i=leng-1; i>=0; i--)
        {
            Rev=Rev+name.charAt(i);
        }
        System.out.println("Reverse of "+name+" is"+Rev);
    }
}
