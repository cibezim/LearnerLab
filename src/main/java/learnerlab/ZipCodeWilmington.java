package learnerlab;

import java.util.ArrayList;

class ZipCodeWilmington {
    private Students students;
    private Instructors instructors;

    public ZipCodeWilmington(Students students, Instructors instructors) {
        this.students = students;
        this.instructors = instructors;
    }

    public void hostLecture(Teacher teacher, double numberOfHours) {
        teacher.lecture(new ArrayList<>(students), numberOfHours);
    }

    public void hostLecture(long instructorId, double numberOfHours) {
        Instructor instructor = instructors.findById(instructorId);
        if (instructor != null) teacher.lecture(new ArrayList<>(students), numberOfHours);
    }


    public void getStudyMap() {

    }
}
