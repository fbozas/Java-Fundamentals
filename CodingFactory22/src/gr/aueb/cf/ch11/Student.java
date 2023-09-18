package gr.aueb.cf.ch11;

import java.util.Scanner;
/*
*   Definition of a simple Student class
*   POJO (Plain Old Java Object)
*   Student Java Bean
*/

public class Student {
    private static int studentCount;
    static  Scanner in = new Scanner(System.in);

    static {
        int num = in.nextInt();
        studentCount = 0;
    }

    private int id;
    private String firstName;
    private String lastName;

    public  Student(){
        studentCount++;
    }

    // Overloaded constructor
    public  Student(int id, String firstName, String lastName){
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        studentCount++;
    }

    public static int getStudentCount(){
        return studentCount;
    }

    public int getId(){
        return id;
    }
    public void setId(int id){
        this.id = id;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public static int getStudentsCount(){
        return studentCount;
    }
}
