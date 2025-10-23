package banking;

public interface Account {
    void open();
    void close();
}

class SavingsAccount implements Account {
    public void open() { System.out.println("Savings Account opened."); }
    public void close() { System.out.println("Savings Account closed."); }
}

class InvestmentAccount implements Account {
    public void open() { System.out.println("Investment Account opened."); }
    public void close() { System.out.println("Investment Account closed."); }
}
