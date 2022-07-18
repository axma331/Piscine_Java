import  java.util.Scanner;

public class Program {
    private static boolean isPrime(int nbr) {
        if (nbr < 2) {
            System.err.println("theIllegalArgument");
            System.exit(-1);
        }
        int ctr = 0;
        for (int i = 2; i * i <= nbr ; i++) {
            ++ctr;
            if (nbr % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int ctr = 0;
        while (true) {
            int nbr = scan.nextInt();
            if (nbr == 42) {
                break;
            }
            int sum = 0;
            while (nbr > 0) {
                sum += nbr % 10;
                nbr /= 10;
            }
            if (isPrime(sum)) {
                ++ctr;
            }
        }
        System.out.println(ctr);
        scan.close();
    }
}