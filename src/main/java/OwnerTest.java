class OwnerTest {

  public static void main(String[] args) {

  	Wallet wallet = new Wallet();
  	Owner owner = new Owner();

  	owner.addMoney(500, wallet);
    owner.addMoney(200, wallet);
    owner.buy(1000,wallet);
    owner.buy(20,wallet);
  }
}