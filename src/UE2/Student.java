package UE2;

import java.util.ArrayList;

public class Student extends Person {
    private int matNumber;
    private int semester;
    private ArrayList<String> courses = new ArrayList<>();

    public Student(String firstName, String lastName, int age, int matNumber, int semester) {
        super(firstName, lastName, age); // Call the constructor of the Person class
        this.matNumber = matNumber;
        this.semester = semester;
    }

    public int getMatNumber() {
        return matNumber;
    }

    public int getSemester() {
        return semester;
    }

    public void addCourse(String course) {
        courses.add(course);
    }
    public ArrayList<String> getCourses() {
        return courses;
    }

    public void printCourses() {
        System.out.println("Courses for student " + matNumber + ":");
        for (String course : courses) {
            System.out.println(course);
        }
    }

    @Override
    public String getInfo(){
        return super.getInfo() + " Matriculation Number: " + matNumber + ", Semester: " + semester;
    }


    
}
