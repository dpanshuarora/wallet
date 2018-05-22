public class Owner {

  private Wallet wallet;

  public Owner() {
    wallet = new Wallet();
  }

  public void addMoney(int amt) {
    wallet.credit(amt);
    System.out.println("Wallet Balance: " + wallet.getBalance());
  }

  public void buy(int amt) {
    wallet.debit(amt);
    System.out.println("Wallet Balance: " + wallet.getBalance());
  }
}
