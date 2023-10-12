package learnerlab;

class Instructors extends People<Instructor> {
    private static final Instructors INSTANCE = new Instructors();

    private Instructors() {
        // Populate INSTANCE with Instructor representations
        // ...

        // For example:
        this.add(new Instructor(101, "Instructor1"));
        this.add(new Instructor(102, "Instructor2"));
        // ...
    }

    public static Instructors getInstance() {
        return INSTANCE;
    }
}