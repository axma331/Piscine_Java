import  java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int nbr = scan.nextInt();
        if (nbr < 2) {
            System.err.println("theIllegalArgument");
            System.exit(-1);
        }
        int ctr = 1;
        for (int i = 2; i * i <= nbr; ++i) {
            if (nbr % i == 0) {
                System.out.println("false " + ctr);
                System.exit(0);
            }
            ++ctr;
        }
        System.out.println("true " + ctr);
        scan.close();
    }
}