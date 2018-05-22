public class Wallet {

  private int balance;

  protected void debit(int amt) {
    if(balance - amt < 0) {
      System.out.println("The wallet balance is lower than " + amt);
    }
    else {
      balance -= amt;
    }
  }

  protected void credit(int amt) {
  	balance += amt;
  }

  protected int getBalance() {
    return balance;
  }
}