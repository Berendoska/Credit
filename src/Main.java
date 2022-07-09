public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double stake = 0.008_325;
        int period = 12;


        int payment = service.calculate(credit, stake, period, a);
        System.out.println(payment);
    }
}
}
