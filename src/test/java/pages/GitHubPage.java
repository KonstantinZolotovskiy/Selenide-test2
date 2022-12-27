package pages;

import com.codeborne.selenide.ElementsCollection;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.*;

public class GitHubPage {

    ElementsCollection
            headerMenuItems = $$(".HeaderMenu-item"),
            dropDownMenuItems = $$(".HeaderMenu-dropdown-link");

    public GitHubPage openGitHubPage() {
        open("https://github.com/");
        return this;
    }

    public GitHubPage hoverToMenuItemByText(String text) {
        headerMenuItems.find(text(text)).hover();
        return this;
    }

    public void clickOnDropDownMenuItemByText(String text) {
        dropDownMenuItems.find(text(text)).should(visible).click();
    }
}
