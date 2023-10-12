package learnerlab;

import java.util.Spliterator;
import java.util.function.Consumer;

class Students extends People<Student> {
    private static final Students INSTANCE = new Students();

    private Students() {

        this.add(new Student(1, "Student1"));
        this.add(new Student(2, "Student2"));

    }

    public static Students getInstance() {
        return INSTANCE;
    }

    @Override
    public void forEach(Consumer<? super Student> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Student> spliterator() {
        return super.spliterator();
    }
}