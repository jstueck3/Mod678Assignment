package wctc.edu;

import java.util.List;

public class UI {

    private static UI ui;

    private IOStrategy ioStrategy;

    private UI(IOStrategy ioStrategy) {
        this.ioStrategy = ioStrategy;
    };

    public static UI getInstance(IOStrategy ioStrategy) {
        if (ui == null) {
            ui = new UI(ioStrategy);
        }
        return ui;
    }

    public char getMenuSelection() {

        ioStrategy.outputLine("1. add person");
        ioStrategy.outputLine("2. add activities");
        ioStrategy.outputLine("3. report");
        ioStrategy.outputLine("4. exit");
        return ioStrategy.inputCharacter();


    }

    public char getActivityTypeMEnu() {

        ioStrategy.outputLine("1. Fundraiser");
        ioStrategy.outputLine("2. Recruiting");
        ioStrategy.outputLine("3. Fun");
        ioStrategy.outputLine("4. Leadership");

        return ioStrategy.inputCharacter();


    }

    public String getName() {
        ioStrategy.outputLine("Please enter your name: ");
        return ioStrategy.inputString();
    }

    public String getEmail() {
        ioStrategy.outputLine("Please enter your email: ");
        return ioStrategy.inputString();
    }

    public PersonType getPersonType() {
        ioStrategy.outputLine("(F)aculty or (M)ember: ");
        switch (ioStrategy.inputCharacter()) {
            //case 'F' -> {return PersonType.FACULTY;}
            case 'M' -> {return PersonType.MEMBER;}
            default -> {return PersonType.MEMBER;}

        }
    }
    public void runReport(List<Person> roster) {
        for (Person p : roster) {
            ioStrategy.outputLine(p.getGetDetailLine());
        }
    }
    public void listMembers(List<Person> roster) {
        for (int i = 0; i < roster.size(); i++) {
            if (roster.get(i) instanceof Member member) {
                ioStrategy.outputLine((i+1) + ". " + member);
            }
        }
    }

    public int getMemberSelection(List<Person> roster) {
        listMembers(roster);
        return Character.getNumericValue(ioStrategy.inputCharacter()) -1;

    }
}
