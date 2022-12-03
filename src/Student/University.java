package Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class University {
    public ArrayList<Student> studentsList = new ArrayList<>();

    public void addStudent(Student student) {
        studentsList.add(student);
    }

    public List<Student> getUniversityList() {
        return new ArrayList<>(studentsList);
    }

    public ArrayList<Student> getSortStudentsFaculty(String faculty) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : this.studentsList) {
            if (Objects.equals(student.getFaculty(), faculty)) {
                result.add(student);
            }
        }
        return new ArrayList<>(result);
    }


    public ArrayList<Student> getSortStudentsYear(Integer year) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : this.studentsList) {
            if (getYear(student.getBirthday()) > year) {
                result.add(student);
            }
        }
        return new ArrayList<>(result);
    }

    private Integer getYear(String birthday) {
        String[] words = birthday.split("\\.");
        return Integer.valueOf(words[2]);
    }

    public ArrayList<Student> getStudentsGroup(Integer group) {
        ArrayList<Student> result = new ArrayList<>();
        for (Student student : this.studentsList) {
            if (student.group.equals(group)) {
                result.add(student);
            }
        }
        return new ArrayList<>(result);
    }

    //
    //  Вывести список студентов для каждого факультета и курса
    //

}