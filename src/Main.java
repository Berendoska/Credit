public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();
        int credit = 1_000_000;
        double stake = 9.99 / 12 / 100;
        int period = 12;



        int payment = service.calculate(credit, stake, period);
        int second = service.calculate(credit, stake, period*2);
        int past = service.calculate(credit, stake, period*3);

        System.out.println(payment);
        System.out.println(second);
        System.out.println(past);




    }
}


