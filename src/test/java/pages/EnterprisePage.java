package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;

public class EnterprisePage {

    SelenideElement
            title = $(".application-main h1");

    public void checkEnterprisePageOpen() {
        title.shouldHave(text("Build like the best"));
    }
}
