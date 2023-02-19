public class CreditPaymentService {
    public int calculate(int sumKred, int peritd) {

        double per;
        double perMonth;
        double bid;
        int n;
        perMonth = (double) (9.99 / (100 * 12));
        bid = (1 + perMonth);
        n = -peritd;
        per = (double) Math.pow(bid, n);
        double pay = (double) (sumKred * (perMonth / (1 - per)));

        return (int) pay;
    }

}
