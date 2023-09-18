package gr.aueb.cf.ch11;

public class Main {
    public static void main(String[] args) {
        Student alice = new Student();
        Student bob = new Student(2, "Bob", "D.");

        System.out.println(Student.getStudentsCount());

        alice.setId(1);
        alice.setFirstName("Alice");
        alice.setLastName("Wonderland");

        bob.setId(3);

        // Get
        System.out.println("Id: " + alice.getId());
        System.out.println("Firstname: " + alice.getFirstName());
        System.out.println("Lastname: " + alice.getLastName());

        System.out.println("Bob Id: " + bob.getId());
        System.out.println("Bob Firstname: " + bob.getFirstName());
        System.out.println("Bob Lastname: " + bob.getLastName());
    }
}
