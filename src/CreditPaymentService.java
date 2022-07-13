public class CreditPaymentService {


    public int calculate(int credit, double stake, int period) {
        int result;
        {

            {
                result = (int) (((stake * (Math.pow((1 + stake), period)))
                        / (Math.pow((1 + stake), period) - 1)) * credit);

                {
                    return result;
                }
            }
        }
    }
}




