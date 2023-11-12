package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;
import utils.WebElementHelper;

import java.io.IOException;

public class AppTests extends BaseTest {
    @Test
    public void mobileTest() throws IOException {
        //1
        logger.info("Fill the form with email and password");
        LoginPage loginPage = new LoginPage();
        loginPage.getEmailElement().sendKeys("ed-domestic@medifastinc.com");
        loginPage.getPasswordElement().sendKeys("Medifast2017**");
        loginPage.getLoginButtonElement().click();
        //2
        DashboardPage dashboardPage = new DashboardPage();
        logger.info("Assert that greeting is displayed");
        Assertions.assertTrue(dashboardPage.greetingPart().getGreetingMessage().isDisplayed());
        logger.info("Assert that rank progress card is displayed");
        Assertions.assertTrue(dashboardPage.rankPart().getRankProgressCardElement().isDisplayed());
        logger.info("Assert that rank FQV card is displayed");
        Assertions.assertTrue(dashboardPage.cardPart().getFQVCardElement().isDisplayed());
        dashboardPage.cardPart().scrollToGOVCard();
        logger.info("Assert that rank G0V card is displayed");
        Assertions.assertTrue(dashboardPage.cardPart().getG0VCardElement().isDisplayed());
        dashboardPage.cardPart().scrollToTGVCard();
        logger.info("Assert that rank TGV card is displayed");
        Assertions.assertTrue(dashboardPage.cardPart().getTGVCardElement().isDisplayed());
        dashboardPage.cardPart().scrollToFirstCard();
        logger.info("Assert that rank coaches sector is displayed");
        Assertions.assertTrue(dashboardPage.coachesPart().getCoachesSectionElement().isDisplayed());
        dashboardPage.logoPart().scrollToLogo();
        logger.info("Assert that rank teams overview sector is displayed");
        Assertions.assertTrue(dashboardPage.teamsOverviewPart().getTeamsOverviewSectionElement().isDisplayed());
        logger.info("Assert that logo is displayed");
        Assertions.assertTrue(dashboardPage.logoPart().getLogoElement().isEnabled());
        //3
        logger.info("Verify rank progress card");
        dashboardPage.rankPart().scrollToRank();
        Assertions.assertTrue(dashboardPage.rankPart().getRankTitleElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.rankPart().getRankDescriptionElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.rankPart().getRankIconElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.rankPart().getRankSeeProgressAndPerformanceElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.rankPart().getRankProgressBarElement().isDisplayed());
        logger.info("Rank progress cars is verified");
        //4
        //FQV-card
        logger.info("Verify FQV card");
        Assertions.assertTrue(dashboardPage.cardPart().getCardTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.cardPart().getCardMainValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.cardPart().getCardInfoIconElement().isEnabled());
        Assertions.assertTrue(dashboardPage.cardPart().getCardProjectedThisMonthTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.cardPart().getCardProjectedThisMonthValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.cardPart().getCardSameTimeLastMonthTitleElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.cardPart().getCardSameTimeLastMonthValueElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.cardPart().getCardLastMonthTotalTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.cardPart().getCardLastMonthTotalValueElement()) >= 0);
        logger.info("FQV card is verified");
        //G0V-card
        logger.info("Scroll to G0V card");
        dashboardPage.cardPart().scrollToGOVCard();
        logger.info("Verify G0V card");
        Assertions.assertTrue(dashboardPage.cardPart().getCardTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.cardPart().getCardMainValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.cardPart().getCardInfoIconElement().isEnabled());
        Assertions.assertTrue(dashboardPage.cardPart().getCardProjectedThisMonthTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.cardPart().getCardProjectedThisMonthValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.cardPart().getCardSameTimeLastMonthTitleElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.cardPart().getCardSameTimeLastMonthValueElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.cardPart().getCardLastMonthTotalTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.cardPart().getCardLastMonthTotalValueElement()) >= 0);
        logger.info("G0V card is verified");
        //TGV-card
        logger.info("Scroll to TGV card");
        dashboardPage.cardPart().scrollToTGVCard();
        logger.info("Verify TGV card");
        Assertions.assertTrue(dashboardPage.cardPart().getCardTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.cardPart().getCardMainValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.cardPart().getCardInfoIconElement().isEnabled());
        Assertions.assertTrue(dashboardPage.cardPart().getCardProjectedThisMonthTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.cardPart().getCardProjectedThisMonthValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.cardPart().getCardSameTimeLastMonthTitleElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.cardPart().getCardSameTimeLastMonthValueElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.cardPart().getCardLastMonthTotalTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.cardPart().getCardLastMonthTotalValueElement()) >= 0);
        logger.info("TGV card is verified");
        //5
        logger.info("Scroll to coaches sector");
        dashboardPage.coachesPart().scrollToCoachesNewOrganizationValue();
        logger.info("Verify coaches elements");
        Assertions.assertTrue(dashboardPage.coachesPart().getCoachesTitleElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.coachesPart().getCoachesInfoIconElement().isEnabled());
        Assertions.assertTrue(dashboardPage.coachesPart().getCoachesNewFrontlineTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.coachesPart().getCoachesNewFrontlineValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.coachesPart().getCoachesAllFrontlineTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.coachesPart().getCoachesAllFrontlineValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.coachesPart().getCoachesNewGeneration0TitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.coachesPart().getCoachesNewGeneration0ValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.coachesPart().getCoachesAllGeneration0TitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.coachesPart().getCoachesAllGeneration0ValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.coachesPart().getCoachesNewOrganizationTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.coachesPart().getCoachesNewOrganizationValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.coachesPart().getCoachesAllOrganizationTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.coachesPart().getCoachesAllOrganizationValueElement()) >= 0);
        logger.info("Coaches elements is verified");
        //6
        logger.info("Verify teams overview elements");
        Assertions.assertTrue(dashboardPage.teamsOverviewPart().getTeamsOverviewTitleElement().isDisplayed());
        Assertions.assertTrue(dashboardPage.teamsOverviewPart().getTeamsOverviewInfoIconElement().isEnabled());
        Assertions.assertTrue(dashboardPage.teamsOverviewPart().getTeamsOverviewSeniorCoachTeamsTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.teamsOverviewPart().getTeamsOverviewSeniorCoachTeamsValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.teamsOverviewPart().getTeamsOverviewExecutiveDirectorTeamsTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.teamsOverviewPart().getTeamsOverviewExecutiveDirectorTeamsValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.teamsOverviewPart().getTeamsOverviewFIBCTeamsTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.teamsOverviewPart().getTeamsOverviewFIBCTeamsValueElement()) >= 0);
        Assertions.assertTrue(dashboardPage.teamsOverviewPart().getTeamsOverviewFIBLTeamsTitleElement().isDisplayed());
        Assertions.assertTrue(WebElementHelper.getIntFromWebElementText(dashboardPage.teamsOverviewPart().getTeamsOverviewFIBLTeamsValueElement()) >= 0);
        logger.info("Teams overview elements is verified");
    }
}
