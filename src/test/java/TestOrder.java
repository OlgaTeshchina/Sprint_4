import org.example.ChromeRule;
import org.example.FirefoxRule;
import page.object.*;
import org.junit.Rule;
import org.junit.Test;

public class TestOrder {
    //@Rule
    //public FirefoxRule firefoxRule = new FirefoxRule();
  @Rule
  public ChromeRule chromeRule = new ChromeRule();

    @Test
    public void startOrderBlackScooterFromHat() {
        //LocatorsOrder locatorsOrder = new LocatorsOrder(firefoxRule.getWebDriver());
        LocatorsOrder locatorsOrder = new LocatorsOrder(chromeRule.getWebDriver());

        locatorsOrder
                .open()
                .acceptCookies()
                .clickOnButtonOrderScooterStart()
                .generalInformationAboutUser(
                "Ирина",
                "Петрова",
                "ул.Сокольническая Слободка, 18, кв.2",
                "Сокольники",
                "89508976875")
                .clickContinueButton()

                .selectDeliveryDate("05.11.2023", "5-е ноября 2023 г.")
                .selectRentalPeriod("трое суток")
                .chooseCheckBoxBlackColor()
                .setCommentFieldForCourier("Осторожно злая собака")
                .clickButtonOrderScooterFinish()

                .checkTextWantToPlaceOrder()
                .clickOrderConfirmationButton()

                .checkTextOrderIsProcessed();
    }

    @Test
    public void startOrderGreyScooterFromPageSection() {
        //LocatorsOrder locatorsOrder = new LocatorsOrder(firefoxRule.getWebDriver());
        LocatorsOrder locatorsOrder = new LocatorsOrder(chromeRule.getWebDriver());

        locatorsOrder
                .open()
                .acceptCookies()
                .clickOnButtonOrderScooterStartTwo()
                .generalInformationAboutUser(
                        "Ирина",
                        "Петрова",
                        "ул.Сокольническая Слободка, 18, кв.2",
                        "Сокольники",
                        "89508976875")
                .clickContinueButton()

                .selectDeliveryDate("05.11.2023", "5-е ноября 2023 г.")
                .selectRentalPeriod("трое суток")
                .chooseCheckGrayColor()
                .setCommentFieldForCourier("Осторожно злая собака")
                .clickButtonOrderScooterFinish()

                .checkTextWantToPlaceOrder()
                .clickOrderConfirmationButton()

                .checkTextOrderIsProcessed();
    }
}









