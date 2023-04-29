import java.awt.font.FontRenderContext;
import java.util.Scanner;

class Factorial {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("enter the no");
        int no = s.nextInt();
        {
            int Fact = 1;

            for (int i = 1; i <= no; i++) {
                Fact = Fact * i;

            }
            System.out.println("Factorial of is" + Fact);
            {
            }
        }
    }
}