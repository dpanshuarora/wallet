public class Wallet {

  private int balance;

  public void debit(int amount) {
    try {
      validateAmount(amount);
      if(balance < amount) {
        System.out.println("The wallet balance is lower than " + amount);
      }

      else {
        balance -= amount;
      }
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  public void credit(int amount) {
    try {
      validateAmount(amount);
      balance += amount;
    } catch(Exception e) {
      System.out.println(e.getMessage());
    }
  }

  private void validateAmount(int amount) {
    if(amount < 0) {
      throw new IllegalArgumentException("Error! The amount entered is negative.");
    }
  }

  public int getBalance() {
    return balance;
  }
}