package tests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pages.*;
import java.net.MalformedURLException;

public class AppTests extends BaseTest{
    @Test
    public void mobileTest() throws MalformedURLException {
        //1
        logger.info("Fill the form with email and password");
        LoginPage loginPage = new LoginPage();
        loginPage.fillEmail();
        loginPage.fillPassword();
        loginPage.submitLoginButton();
        //2
        GreetingPage greetingPage = new GreetingPage();
        logger.info("Assert that greeting contains Good");
        Assertions.assertTrue(greetingPage.getGreetingMessage().contains("Good"));
        RankPage rankPage = new RankPage();
        logger.info("Assert that rank progress card is enabled");
        Assertions.assertTrue(rankPage.getRankProgressCardElement().isEnabled());
        CardPage cardPage = new CardPage();
        logger.info("Assert that rank FQV card is enabled");
        Assertions.assertTrue(cardPage.getFQVCardElement().isEnabled());
        cardPage.scrollToGOVCard();
        logger.info("Assert that rank G0V card is enabled");
        Assertions.assertTrue(cardPage.getG0VCardElement().isEnabled());
        cardPage.scrollToTGVCard();
        logger.info("Assert that rank TGV card is enabled");
        Assertions.assertTrue(cardPage.getTGVCardElement().isEnabled());
        cardPage.scrollToFirstCard();
        CoachesPage coachesPage = new CoachesPage();
        logger.info("Assert that rank coaches sector is enabled");
        Assertions.assertTrue(coachesPage.getCoachesSectionElement().isEnabled());
        LogoPage logoPage = new LogoPage();
        logoPage.scrollToLogo();
        TeamsOverviewPage teamsOverviewPage = new TeamsOverviewPage();
        logger.info("Assert that rank teams overview sector is enabled");
        Assertions.assertTrue(teamsOverviewPage.getTeamsOverviewSectionElement().isEnabled());
        logger.info("Assert that logo is enabled");
        Assertions.assertTrue(logoPage.getLogoElement().isEnabled());
        //3
        logger.info("Verify rank progress card");
        rankPage.scrollToRank();
        Assertions.assertEquals("YOUR NEXT RANK", rankPage.getRankTitleElement().getText());
        Assertions.assertEquals("You're 95% of the way to Integrated Executive Director", rankPage.getRankDescriptionElement().getText());
        Assertions.assertTrue(rankPage.getRankIconElement().isEnabled());
        Assertions.assertTrue(rankPage.getRankSeeProgressAndPerformanceElement().isEnabled());
        Assertions.assertTrue(rankPage.getRankProgressBarElement().isEnabled());
        logger.info("Rank progress cars is verified");
        //4
        //FQV-card
        logger.info("Verify FQV card");
        Assertions.assertEquals("Frontline Qualifying Volume", cardPage.getCardTitleElement().getText());
        Assertions.assertTrue( Integer.parseInt(cardPage.getCardMainValueElement().getText().replaceAll("[^0-9]+", ""))>=0);
        Assertions.assertTrue(cardPage.getCardInfoIconElement().isEnabled());
        Assertions.assertEquals("Projected This Month", cardPage.getCardProjectedThisMonthTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(cardPage.getCardProjectedThisMonthValueElement().getText().replaceAll("[^0-9]+", ""))>=0);
        Assertions.assertEquals("Same Time Last Month", cardPage.getCardSameTimeLastMonthTitleElement().getText());
        Assertions.assertEquals("Coming soon", cardPage.getCardSameTimeLastMonthValueElement().getText());
        Assertions.assertEquals("Last Month (October) Total", cardPage.getCardLastMonthTotalTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(cardPage.getCardLastMonthTotalValueElement().getText().replaceAll("[^0-9]+", ""))>=0);
        logger.info("FQV card is verified");
        //G0V-card
        logger.info("Scroll to G0V card");
        cardPage.scrollToGOVCard();
        logger.info("Verify G0V card");
        Assertions.assertEquals( "Generation 0 Volume", cardPage.getCardTitleElement().getText());
        Assertions.assertTrue( Integer.parseInt(cardPage.getCardMainValueElement().getText().replaceAll("[^0-9]+", ""))>=0);
        Assertions.assertTrue(cardPage.getCardInfoIconElement().isEnabled());
        Assertions.assertEquals("Projected This Month", cardPage.getCardProjectedThisMonthTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(cardPage.getCardProjectedThisMonthValueElement().getText().replaceAll("[^0-9]+", ""))>=0);
        Assertions.assertEquals("Same Time Last Month", cardPage.getCardSameTimeLastMonthTitleElement().getText());
        Assertions.assertEquals("Coming soon", cardPage.getCardSameTimeLastMonthValueElement().getText());
        Assertions.assertEquals("Last Month (October) Total", cardPage.getCardLastMonthTotalTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(cardPage.getCardLastMonthTotalValueElement().getText().replaceAll("[^0-9]+", ""))>=0);
        logger.info("G0V card is verified");
        //TGV-card
        logger.info("Scroll to TGV card");
        cardPage.scrollToTGVCard();
        logger.info("Verify TGV card");
        Assertions.assertEquals( "Total Generation Volume", cardPage.getCardTitleElement().getText());
        Assertions.assertTrue( Integer.parseInt(cardPage.getCardMainValueElement().getText().replaceAll("[^0-9]+", ""))>=0);
        Assertions.assertTrue(cardPage.getCardInfoIconElement().isEnabled());
        Assertions.assertEquals("Projected This Month", cardPage.getCardProjectedThisMonthTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(cardPage.getCardProjectedThisMonthValueElement().getText().replaceAll("[^0-9]+", ""))>=0);
        Assertions.assertEquals("Same Time Last Month", cardPage.getCardSameTimeLastMonthTitleElement().getText());
        Assertions.assertEquals("Coming soon", cardPage.getCardSameTimeLastMonthValueElement().getText());
        Assertions.assertEquals("Last Month (October) Total", cardPage.getCardLastMonthTotalTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(cardPage.getCardLastMonthTotalValueElement().getText().replaceAll("[^0-9]+", ""))>=0);
        logger.info("TGV card is verified");
        //5
        logger.info("Scroll to coaches sector");
        coachesPage.scrollToCoachesNewOrganizationValue();
        logger.info("Verify coaches elements");
        Assertions.assertEquals("Coaches", coachesPage.getCoachesTitleElement().getText());
        Assertions.assertTrue(coachesPage.getCoachesInfoIconElement().isEnabled());
        Assertions.assertEquals("New Frontline Coaches", coachesPage.getCoachesNewFrontlineTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(coachesPage.getCoachesNewFrontlineValueElement().getText())>=0);
        Assertions.assertEquals("All Frontline Coaches", coachesPage.getCoachesAllFrontlineTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(coachesPage.getCoachesAllFrontlineValueElement().getText())>=0);
        Assertions.assertEquals("New Generation 0 Coaches", coachesPage.getCoachesNewGeneration0TitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(coachesPage.getCoachesNewGeneration0ValueElement().getText())>=0);
        Assertions.assertEquals("All Generation 0 Coaches", coachesPage.getCoachesAllGeneration0TitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(coachesPage.getCoachesAllGeneration0ValueElement().getText())>=0);
        Assertions.assertEquals("New Organization Coaches", coachesPage.getCoachesNewOrganizationTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(coachesPage.getCoachesNewOrganizationValueElement().getText())>=0);
        Assertions.assertEquals("All Organization Coaches", coachesPage.getCoachesAllOrganizationTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(coachesPage.getCoachesAllOrganizationValueElement().getText())>=0);
        logger.info("Coaches elements is verified");
        //6
        logger.info("Verify teams overview elements");
        Assertions.assertEquals("Teams Overview", teamsOverviewPage.getTeamsOverviewTitleElement().getText());
        Assertions.assertTrue(teamsOverviewPage.getTeamsOverviewInfoIconElement().isEnabled());
        Assertions.assertEquals("Senior Coach Teams", teamsOverviewPage.getTeamsOverviewSeniorCoachTeamsTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(teamsOverviewPage.getTeamsOverviewSeniorCoachTeamsValueElement().getText())>=0);
        Assertions.assertEquals("Executive Director Teams", teamsOverviewPage.getTeamsOverviewExecutiveDirectorTeamsTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(teamsOverviewPage.getTeamsOverviewExecutiveDirectorTeamsValueElement().getText())>=0);
        Assertions.assertEquals("FIBC Teams", teamsOverviewPage.getTeamsOverviewFIBCTeamsTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(teamsOverviewPage.getTeamsOverviewFIBCTeamsValueElement().getText())>=0);
        Assertions.assertEquals("FIBL Teams", teamsOverviewPage.getTeamsOverviewFIBLTeamsTitleElement().getText());
        Assertions.assertTrue(Integer.parseInt(teamsOverviewPage.getTeamsOverviewFIBLTeamsValueElement().getText())>=0);
        logger.info("Teams overview elements is verified");
    }
}
