import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;

public class OwnerTest {
  private Owner owner;

  @Before
  public void setUp() {
    owner = new Owner();
  }

  @Test
  public void checkAddMoney() {
    owner.addMoney(400);
    assertEquals(400, owner.getWalletBalance());
  }

  @Test
  public void checkBuy() {
    owner.addMoney(200);
    owner.buy(100);
    assertEquals(100, owner.getWalletBalance());
  }
}