package neptun;

import java.util.Set;

public class Subject {

    private String name;
    private String code;
    private Set<Student> students;
    private Set<Lecturer> lecturers;
    private SubjectType type;

    public String getName() {
        return name;
    }

    public String getCode() {
        return code;
    }

    public Set<Student> getStudents() {
        return students;
    }

    public Set<Lecturer> getLecturers() {
        return lecturers;
    }

    public SubjectType getType() {
        return type;
    }

    public void addNewStudent(Student student){
        this.students.add(student);
    }
}
