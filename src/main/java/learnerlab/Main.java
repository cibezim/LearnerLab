package learnerlab;
public class Main {

    public static void main(String[] args) {
        // Part 1.0 - Test Person
        Person person = new Person(1234, "Denzel Washington");
        System.out.println("Person ID: " + person.getId());
        System.out.println("Person Name: " + person.getName());

        // Part 3.0 - Test Student
        Student student = new Student(1301, "Michael B Jordan");
        student.learn(5.0);
        System.out.println("Student ID: " + student.getId());
        System.out.println("Student Name: " + student.getName());
        System.out.println("Student Total Study Time: " + student.getTotalStudyTime());

        // Part 5.0 - Test Instructor
        Instructor instructor = new Instructor(2014, "Kobe Bryant");
        instructor.teach(student, 3.0);
        System.out.println("Instructor ID: " + instructor.getId());
        System.out.println("Instructor Name: " + instructor.getName());
        System.out.println("Student Total Study Time after Teaching: " + student.getTotalStudyTime());

        // Part 7.1 - Test Students Singleton
        Students studentsSingleton = Students.getInstance();
        for (Student studentFromSingleton : studentsSingleton) {
            System.out.println("Student in Singleton - ID: " + studentFromSingleton.getId() +
                    ", Name: " + studentFromSingleton.getName());
        }

        // Part 8.0 - Test Instructors Singleton
        Instructors instructorsSingleton = Instructors.getInstance();
        for (Instructor instructorFromSingleton : instructorsSingleton) {
            System.out.println("Instructor in Singleton - ID: " + instructorFromSingleton.getId() +
                    ", Name: " + instructorFromSingleton.getName());
        }

        // Part 9.1 - Test ZipCodeWilmington
        ZipCodeWilmington zipCodeWilmington = new ZipCodeWilmington(studentsSingleton, instructorsSingleton);
        zipCodeWilmington.hostLecture(instructor, 4.0);
        System.out.println("Student Total Study Time after Hosting Lecture: " + student.getTotalStudyTime());
    }
}
