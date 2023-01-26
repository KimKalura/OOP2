package School;
public class Main {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Moshe", "Sarang", "Judaism", "Hebrew");
        teacher1.introduce();
        Student student1 = new Student("Ariella", "Solomon", "Jewish Literature");
        student1.introduce();
    }
}
