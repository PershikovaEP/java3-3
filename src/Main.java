public class Main {
    public static void main(String[] args) {

        CreditPaymentService service = new CreditPaymentService();

        System.out.println("При сумме кредита 1_000_000, сроке 1 год, процентной ставке 9,99% ежемесячный платеж составит");
        System.out.println(service.calculate(1_000_000, 12, 9.99));

        System.out.println();
        System.out.println("При сумме кредита 1_000_000, сроке 2 годa, процентной ставке 9,99% ежемесячный платеж составит");
        System.out.println(service.calculate(1_000_000, 24, 9.99));

        System.out.println();
        System.out.println("При сумме кредита 1_000_000, сроке 3 годa, процентной ставке 9,99% ежемесячный платеж составит");
        System.out.println(service.calculate(1_000_000, 36, 9.99));
    }
}
