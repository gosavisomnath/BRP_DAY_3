public class CarLoan {
    public static void main(String[] args) {
        double P = Integer.parseInt(args[0]);
        double Y = Integer.parseInt(args[1]);
        double R = Integer.parseInt(args[2]);

        double n = 12 * Y;
      
        double r = R / (12 * 100);

        double payment = (P * r) / (1 - Math.pow(1 + r, -n));
        double interest = payment * n - P;

        System.out.println("Monthly payments is :  " + payment);
        System.out.println("Total interest is :  " + interest);

    }
}