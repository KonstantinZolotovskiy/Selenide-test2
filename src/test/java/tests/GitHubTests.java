package tests;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import pages.EnterprisePage;
import pages.GitHubPage;

import static com.codeborne.selenide.Configuration.*;

public class GitHubTests {

    @BeforeAll
    public static void setUp() {
        browserSize = "1920x1080";
    }

    GitHubPage gitHubPage = new GitHubPage();
    EnterprisePage enterprisePage = new EnterprisePage();

    @Test
    public void hoverTest() {
        gitHubPage.openGitHubPage()
                .hoverToMenuItemByText("Solutions")
                .clickOnDropDownMenuItemByText("Enterprise");
        enterprisePage.checkEnterprisePageOpen();
    }
}
