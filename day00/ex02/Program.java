import  java.util.Scanner;

public class Program {
    private static boolean  isPrime(int nbr) {
        if (nbr < 2) {
            System.err.println("theIllegalArgument");
            System.exit(-1);
        }
        for (int i = 2; i * i <= nbr; ++i)
            if (nbr % i == 0)
                return false;
        return true;
    }

    public static void  main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int cnt = 0, sum = 0;
        while (scan.hasNextInt()) {
            int nbr = scan.nextInt();
            if (nbr == 42)
                break;
            while (nbr > 0) {
                sum += nbr % 10;
                nbr /= 10;
            }
            if (isPrime(sum))
                ++cnt;
        }
        System.out.println("Count of coffee-request - "+ cnt);
        scan.close();
    }
}