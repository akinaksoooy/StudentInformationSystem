public class Main {
    public static void main(String[] args) {
        Teacher t1 = new Teacher("Heredot", "999", "HST");
        Teacher t2 = new Teacher("Graham Bell", "555", "PHY");
        Teacher t3 = new Teacher("Maria Curie", "333","CHE");

        Course history = new Course("History", "101", "HST");
        history.addTeacher(t1);

        Course physics = new Course("Physics", "101", "PHY");
        physics.addTeacher(t2);

        Course chemistry = new Course("Chemistry", "101", "CHE");
        chemistry.addTeacher(t3);

        Student s1 = new Student("Harry Potter", "123", "4", history, physics, chemistry);
        s1.addBulkExamNote(40,60,75,100,80,20);
        s1.isPass();

       Student s2 = new Student("Gandalf the Grey", "654", "6", history,physics,chemistry);
       s2.addBulkExamNote(90,40,30,20,100,100);
       s2.isPass();
    }
}