package wctc.edu;

public class Person {
private String name;
private String email;
private String getDetailLine;

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public String getGetDetailLine() {
        return getDetailLine;
    }

    public void setGetDetailLine(String getDetailLine) {
        this.getDetailLine = getDetailLine;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Decafe";
    }
}
