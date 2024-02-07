import org.example.ChromeRule;
import org.junit.Rule;
import org.junit.Test;
import page.object.LocatorsOrder;
import static org.junit.Assert.assertTrue;

public class TestStartOrderFromSection {

    // @Rule
  //  public FirefoxRule firefoxRule = new FirefoxRule();
     @Rule
     public ChromeRule chromeRule = new ChromeRule();

    @Test
    public void startOrderFromSectionHomPage(){
      //  LocatorsOrder locatorsOrder = new LocatorsOrder(firefoxRule.getWebDriver());
         LocatorsOrder locatorsOrder = new LocatorsOrder(chromeRule.getWebDriver());

        locatorsOrder
                .open()
                .clickOnButtonOrderScooterStartTwo()
                .checkShownFormaWhoIsTheScooterFor();
    }
}
