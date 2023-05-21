package wctc.edu;
public class Main {
    public static void main(String[] args) {
        IOStrategy ioStrategy;
        char answer = 'C';
        switch (answer) {
            case 'C': ioStrategy = new ConsoleIOStrategy();break;
            default: ioStrategy = new ConsoleIOStrategy();
        }
        UI ui = UI.getInstance(ioStrategy);
        Club club = Club.getInstance(ui);
        answer = ' ';
        do {
            answer = ui.getMenuSelection();
            switch (answer) {
                case '1' -> {club.addPerson();}
                case '2' -> {club.addActivity();}
                case '3' -> {club.produceReport();}
            }
        }while (answer != '4');

    }
}
