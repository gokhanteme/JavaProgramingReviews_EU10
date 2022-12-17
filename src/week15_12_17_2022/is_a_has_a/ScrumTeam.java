package week15_12_17_2022.is_a_has_a;

public class ScrumTeam {
    //Scrum Team has a tester
    Tester tester;
    // Scrum Team has a developer
    Developer developer;

    public ScrumTeam(Tester tester, Developer developer) {
        this.tester = tester;
        this.developer = developer;
    }
}
