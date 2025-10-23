package banking;

abstract class AccountDecorator implements Account {
    protected final Account account;
    protected AccountDecorator(Account account) { this.account = account; }
    public void open() { account.open(); }
    public void close() { account.close(); }
}

class InsuranceDecorator extends AccountDecorator {
    public InsuranceDecorator(Account account) { super(account); }
    public void open() { super.open(); System.out.println("→ Insurance added to account."); }
}

class TaxOptimizerDecorator extends AccountDecorator {
    public TaxOptimizerDecorator(Account account) { super(account); }
    public void open() { super.open(); System.out.println("→ Tax optimization enabled."); }
}

class RewardPointsDecorator extends AccountDecorator {
    public RewardPointsDecorator(Account account) { super(account); }
    public void open() { super.open(); System.out.println("→ Reward points system activated."); }
}
