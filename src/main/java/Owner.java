public class Owner {

  private Wallet wallet;

  public Owner() {
    wallet = new Wallet();
  }

  public void addMoney(int amount) {
    wallet.credit(amount);
    System.out.println("Wallet Balance: " + wallet.getBalance());
  }

  public void buy(int amount) {
    wallet.debit(amount);
    System.out.println("Wallet Balance: " + wallet.getBalance());
  }

  public int getWalletBalance() {
    return wallet.getBalance();
  }
}
