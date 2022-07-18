import  java.util.Scanner;

public class Program {
    private static void print(long res) {

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long res = 0;
        int ctr = 0;
        long multiplyer = 1;

        while (true) {
            String input = scan.next();
            if (input.equals("42")) {
                break;
            }
            if (!input.equals("Week") || scan.nextInt() != ++ctr) {
                System.err.println("IllegalArgument");
                System.exit(-1);
            }
            int min = 9;
            for (int i = 0; i < 5; i++) {
                int nbr = scan.nextInt();
                min = nbr < min ? nbr : min;
            }
//            res = res * 10 + min;
            res +=  multiplyer * min;
            multiplyer *= 10;
            scan.next();
        }

        scan.close();
    }
}



//7 7 7 7 6
// Week 15