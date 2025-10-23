package banking;

public class BankingFacade {
    public void openAccountWithBenefits() {
        System.out.println("=== Opening Savings Account with Benefits ===");
        Account acc = new SavingsAccount();
        acc = new RewardPointsDecorator(new InsuranceDecorator(acc));
        acc.open();
        System.out.println();
    }

    public void investWithSafetyMode() {
        System.out.println("=== Investing with Safety Mode ===");
        Account acc = new InvestmentAccount();
        acc = new TaxOptimizerDecorator(new InsuranceDecorator(acc));
        acc.open();
        System.out.println();
    }

    public void closeAccount() {
        System.out.println("=== Closing All Accounts ===");
        System.out.println("All accounts successfully closed.");
    }
}
