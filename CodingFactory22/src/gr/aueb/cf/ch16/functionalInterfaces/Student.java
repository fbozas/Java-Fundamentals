package gr.aueb.cf.ch16.functionalInterfaces;

public class Student {
    private int id;
    private String firstname;
    private String lastname;

    public Student(){}
    public Student(int id, String firstname, String lastname){
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void printStudent(){
        System.out.println(this);
    }

    public static void printStaticStudent(Student student){
        System.out.println("Student's full name");
    }
}
