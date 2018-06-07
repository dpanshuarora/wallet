import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
s
public class WalletTest {
  private Wallet wallet;

  @Before
  public void setUp() {
    wallet = new Wallet();
  }

  @Test
  public void checkCredit() {
    wallet.credit(200);
    assertEquals(200, wallet.getBalance());
  }

  @Test
  public void checkDebit() {
    wallet.credit(300);
    wallet.debit(200);
    assertEquals(100, wallet.getBalance());
  }

  @Test
  public void checkDebitWhenBalanceInsufficient() {
    wallet.credit(200);
    wallet.debit(550);
    assertEquals(200, wallet.getBalance());
  }  

  @Test
  public void checkDebitWhenNegativeAmountEnteredByOwner() {
    owner.addMoney(100);
    owner.buy(-900);
    assertEquals(100, owner.getWalletBalance());
  }
}