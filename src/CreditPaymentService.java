public class CreditPaymentService {
    public long calculate(long sum, int time, double percent) {

        double interestRate = percent / 1200; //месячная процентная ставка;
        double a = Math.pow(1 + interestRate, -time); //возведение в степень;
        double b = 1 - a; //знаменатель;
        double c = sum * interestRate / b; //ежемесячный платеж дробный;
        long monthlyPayment = (long) c;
        return monthlyPayment;
    }
}
