package page.object;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
public class LocatorsQuestions {
    public static final String URL = "https://qa-scooter.praktikum-services.ru/";
    private final WebDriver webDriver;

    //Локаторы раздела Вопросы о важном
    private String idQuestion;
    private String idAnswer;

    //Локатор класса последнего вопроса для скролла
    private final By LastQuestion = By.className("accordion__heading");
    //Определение вопросов в блоке Вопросы о важном
    private By someQuestion = By.xpath(".//div[@id = '" + idQuestion + "']");


    //Определение ответов в блоке Вопросы о важном
    private By someAnswer = By.xpath(".//div[@id = '" + idAnswer + "']");

    //Геттеры локаторов
    private By getSomeQuestionLocator() {return By.xpath(".//div[@id = '" + idQuestion + "']"); }
    private By getSomeAnswerLocator()
    {
        return By.xpath(".//div[@id = '" + idAnswer + "']");
    }


    public LocatorsQuestions(WebDriver webDriver) {this.webDriver = webDriver; }

    public LocatorsQuestions open() {
        webDriver.get(URL);
        return this;
    }

    public LocatorsQuestions scrollToTheLastQuestionFromQuestionsImportant() {
        WebElement questionsAboutImportant = webDriver.findElement(LastQuestion);
        ((JavascriptExecutor) webDriver).executeScript("arguments[0].scrollIntoView();", questionsAboutImportant);
        return this;
    }

    public LocatorsQuestions clickOnTheQuestion(String idQuestion) {
        this.idQuestion = idQuestion;
        webDriver.findElement(getSomeQuestionLocator()).click();
        return this;
    }

    public String getAnswer(String idAnswer) {
        this.idAnswer = idAnswer;
        WebElement answerElement = webDriver.findElement(getSomeAnswerLocator());
        System.out.println(answerElement.getText());
        return answerElement.getText();
    }
}


