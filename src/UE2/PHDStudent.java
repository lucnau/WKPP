package UE2;

public class PHDStudent extends Student {
    
    
    private String dissTopic;

    @Override
    public String getInfo() {
        return super.getInfo() + " Dissertation Topic: " + dissTopic;
    }


    public PHDStudent(String firstName, String lastName, int age, int matNumber, int semester, String dissTopic) {
        super(firstName, lastName, age, matNumber, semester);
        this.dissTopic = dissTopic;
    }


   public static void main(String[] args) {
        
    Person p = new Person("Alice", "Anders", 34);

    System.out.println(p.getInfo());

    Student s = new Student("Bob", "Bücher", 22, 456789, 3);
    s.addCourse("Weiterführende Konzepte der Programmierung");
    s.addCourse("Mathematik für Studierende der Informatik");

    s.printCourses();

    System.out.println(s.getInfo());

    PHDStudent phd = new PHDStudent("Charlie", "Clever", 28, 987654, 6, "AI Ethics");
    System.out.println(phd.getInfo());

    Person[] people = new Person[3];
    people[0] = p;
    people[1] = s;
    people[2] = phd;
    for (Person person : people) {
        System.out.println(person.getInfo());
    }

    System.out.println("All information: ");
    System.out.println(phd.printInforForAll(people));

   }


   public String printInforForAll(Person[] people) {
        StringBuilder sb = new StringBuilder();
        for (Person person : people) {
            sb.append(person.getInfo()).append("\n");
        }
        return sb.toString();
    }

}
