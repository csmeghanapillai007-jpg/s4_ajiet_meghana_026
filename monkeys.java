import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner mn = new Scanner(System.in);

        int n = mn.nextInt();
        int k = mn.nextInt();
        int j = mn.nextInt();
        int m = mn.nextInt();
        int p = mn.nextInt();

      
        if(n < 0 || k <= 0 || j <= 0 || m < 0 || p < 0)
        {
            System.out.println("please enter the correct input");
        }
        else
        {
            int banana = m / k;

            int peanut = p / j;

            int total = banana + peanut;
            int remain = n - total;

            System.out.println(" Monkeys remaining on the tree:" + remain);
        }
    }
}
