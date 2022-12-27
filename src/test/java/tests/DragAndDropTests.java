package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.DragAndDropPage;

import static com.codeborne.selenide.Configuration.browserSize;

public class DragAndDropTests {

    DragAndDropPage dragAndDropPage = new DragAndDropPage();

    @BeforeAll
    public static void setUp() {
        browserSize = "1920x1080";
    }

    @Test
    public void DragAndDropTest() {
        dragAndDropPage.openDragAndDropPage()
                .moveLeftColumnToRightColumn()
                .checkDragAndDropOperation();
    }
}
