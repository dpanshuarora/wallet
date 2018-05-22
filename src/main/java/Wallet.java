public class Wallet {

  private int balance;

  public void debit(int amt) {
    if(balance - amt < 0) {
      System.out.println("The wallet balance is lower than " + amt);
    }
    else {
      balance -= amt;
    }
  }

  public void credit(int amt) {
  	balance += amt;
  }

  public int getBalance() {
    int bal = balance;
    return bal;
  }
}