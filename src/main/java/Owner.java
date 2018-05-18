public class Owner {

  public void addMoney(int amt, Wallet wallet) {	
  wallet.balance += amt;
  
  System.out.println("Wallet Balance: " + wallet.balance);
  }

  public void buy(int amt, Wallet wallet) {
  if(wallet.balance - amt < 0) {
    System.out.println("The wallet balance is lower than " + amt);
  }
  else {
    wallet.balance -= amt;
    System.out.println("Wallet Balance: " + wallet.balance);
  }
  }
}