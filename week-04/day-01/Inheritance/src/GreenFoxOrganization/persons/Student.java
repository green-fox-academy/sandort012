package GreenFoxOrganization.persons;

public class Student extends Person {
  private String previousOrganization;
  private int skippedDays;

  public Student(String name, int age, String gender, String previousOrganization) {
    super(name, age, gender);
    this.previousOrganization = previousOrganization;
    this.skippedDays = 0;
  }

  public Student() {
    super("Jane Doe", 30, "female");
    previousOrganization = "The School of Life";
    skippedDays = 0;
  }

  public void getGoal() {
    System.out.println("Be a junior software developer.");
  }

  public void introduce() {
    System.out.println(
        "Hi, I'm " + name + ", a " + age + " year old " + gender + " from " + previousOrganization +
            " who skipped " + skippedDays + " days from the course already.");
  }

  public void skipDays(int numberOfDays) {
    skippedDays += numberOfDays;
  }
}
