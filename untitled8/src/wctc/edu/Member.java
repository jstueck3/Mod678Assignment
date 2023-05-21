package wctc.edu;
import java.util.ArrayList;
import java.util.List;
public class Member extends Person{

    private List<Activities> activities;

    public Member(String name, String email) {
        super(name, email);

        this.activities = new ArrayList<>();
    }

    @Override
    public String getGetDetailLine() {
        String line = "Member: " +this.getName() + " " + this.getEmail();

        for (Activities a : activities) {
            line += "\n" + a.getActivityLine();
        }
        return line;
    }


    public void addActivity(char answer) {

        switch (answer) {
            case '1' -> activities.add(new Fund());
            case '2' -> activities.add(new Recruiting());
            case '3' -> activities.add(new Fun());
            case '4' -> activities.add(new Leadership());

        }
    }

}

