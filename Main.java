package main;
import banking.BankingFacade;

public class Main {
    public static void main(String[] args) {
        BankingFacade facade = new BankingFacade();
        facade.openAccountWithBenefits();
        facade.investWithSafetyMode();
        facade.closeAccount();
    }
}
