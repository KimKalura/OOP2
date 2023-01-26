package School;
public class Teacher extends Person {
    private String department;
    private String subject;

    public Teacher(String firstName, String lastName, String department, String subject) {
        super(firstName, lastName);
        this.department = department;
        this.subject = subject;
    }
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I am " + this.getFirstName() + " " + this.getLastName() + " from the " + this.department + " Department " + "and I will teach you " + this.subject +"." + "! שָׁלוֹם");
    }
}
