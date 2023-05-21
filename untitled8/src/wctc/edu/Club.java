package wctc.edu;

import java.util.ArrayList;
import java.util.List;

public class Club {
    //Instance needs to be static
    private static Club club;

    private List<Person> roster;

    private UI ui;

    private Club(UI ui) {
        this.roster = new ArrayList<>();
        this.ui = ui;
    }

    public static Club getInstance(UI ui) {
        if (club == null) {
            club = new Club(ui);
        }
        return club;
    }

    public List<Person> getRoster() {
        return null;
    }

    public void addPerson() {
        PersonType personTypeChoice = ui.getPersonType();
        String name = ui.getName();
        String email = ui.getEmail();
        roster.add(PersonFactory.getPerson(name, email, personTypeChoice));
    }

    public void produceReport() {
        ui.runReport(roster);
    }

    public void addActivity(){
       int answer = ui.getMemberSelection(roster);
        ((Member)roster.get(answer)).addActivity(ui.getActivityTypeMEnu());
    }
}
