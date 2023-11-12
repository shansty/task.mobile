package pages;

import pages.parts.*;
import java.io.IOException;

public class DashboardPage extends BasePage{
    public DashboardPage() throws IOException {
    }
    public RankPart rankPart() throws IOException {
        return new RankPart();
    }
    public CardPart cardPart() throws IOException {
        return new CardPart();
    }
    public CoachesPart coachesPart() throws IOException {
        return new CoachesPart();
    }
    public GreetingPart greetingPart() throws IOException {
        return new GreetingPart();
    }
    public LogoPart logoPart() throws IOException {
        return new LogoPart();
    }
    public TeamsOverviewPart teamsOverviewPart() throws IOException {
        return new TeamsOverviewPart();
    }
}
