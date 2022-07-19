import  java.util.Scanner;

public class Program {
    private static void resPrint(long res) {
        int nbr = 0;
        for(int weekNum = 0;res > 0;) {
            nbr = (int)(res % 10);
            res /= 10;
            System.out.print("Week " + ++weekNum + " ");
            while (nbr-- != 0)
                System.out.print('=');
            System.out.println('>');
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = "";
        int weekNum = 0, nbr = 0;
        long res = 0, multiplier = 1;
        for (int cnt = 0; cnt < 18; ++cnt) {
            input = scan.next();
            if (input.equals("42"))
                break;
            if (!input.equals("Week") || scan.nextInt() != ++weekNum) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            int min = 9;
            for (int i = 0; i < 5; ++i) {
                nbr = scan.nextInt();
                min = nbr < min ? nbr : min;
            }
            res +=  multiplier * min;
            multiplier *= 10;
        }
        resPrint(res);
        scan.close();
    }
}