public class SavingsAccount {
    private double savingsBalance;
    private static double annualInterestRate;

    public SavingsAccount(double savingsBalance) {
        if (savingsBalance < 0.0) {
            throw new IllegalArgumentException("O saldo inicial não pode ser negativo.");
        }
        this.savingsBalance = savingsBalance;
    }

    public static double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public static void setAnnualInterestRate(double interestRate) {
        if (interestRate < 0.0) {
            throw new IllegalArgumentException("A taxa de juros não pode ser negativa.");
        }
        annualInterestRate = interestRate;
    }

    public void calculateMonthlyInterest() {
        double taxaMensal = Math.pow(1 + annualInterestRate / 100.0, 1.0 / 12.0);
        savingsBalance *= taxaMensal;
    }

    public double getSavingsBalance() {
        return savingsBalance;
    }
}
