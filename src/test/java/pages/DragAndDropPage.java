package pages;

import com.codeborne.selenide.SelenideElement;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class DragAndDropPage {

    SelenideElement
            leftColumn = $("#column-a"),
            leftColumnTitle = $("#column-a header"),
            rightColumn = $("#column-b"),
            rightColumnTitle = $("#column-b header");

    public DragAndDropPage openDragAndDropPage() {
        open("https://the-internet.herokuapp.com/drag_and_drop");
        return this;
    }

    public DragAndDropPage moveLeftColumnToRightColumn() {
        leftColumn.dragAndDropTo(rightColumn);
        return this;
    }

    public void checkDragAndDropOperation() {
        leftColumnTitle.shouldHave(text("B"));
        rightColumnTitle.shouldHave(text("A"));
    }
}
