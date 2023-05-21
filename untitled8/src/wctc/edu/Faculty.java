package wctc.edu;
//Has no activities
public class Faculty extends Person{

    public Faculty(String name, String email) {
        super(name, email);
    }

    @Override
    public String getGetDetailLine() {
        return "Faculty" + this.getName() + " " + this.getEmail();
    }
}
