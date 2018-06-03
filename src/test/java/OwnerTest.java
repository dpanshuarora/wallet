import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class OwnerTest {
  private Owner owner;

  @Test
  public void checkAddMoney() {
    owner = new Owner();
    owner.addMoney(400);
    assertEquals(400, owner.getWalletBalance());
  }

  @Test
  public void checkBuy() {
    owner = new Owner();
    owner.addMoney(200);
    owner.buy(100);
    assertEquals(100, owner.getWalletBalance());
  }

  @Test
  public void checkBuyWhenBalanceInsufficient() {
    owner = new Owner();
    owner.addMoney(100);
    owner.buy(200);
    assertEquals(100, owner.getWalletBalance());
  }

  @Test
  public void checkBuyWhenNegativeAmountEnteredByOwner() {
    owner = new Owner();
    owner.addMoney(100);
    owner.buy(-900);
    assertEquals(100, owner.getWalletBalance());
  }
}