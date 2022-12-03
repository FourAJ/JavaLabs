package Student;

import java.util.ArrayList;

public class Student {
    {
        uuidGen++;
    }
    static Integer uuidGen = 10000;
    final Integer uuid = uuidGen;
    final String name;
    final String surname;
    final String patronymic;
    final String birthday;
    final String address;
    final String phone;
    final String faculty;
    final Integer course;
    final Integer group;

    public Student(String name, String surname, String patronymic, String birthday, String address, String phone, String faculty, Integer course, Integer group) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.birthday = birthday;
        this.address = address;
        this.phone = phone;
        this.faculty = faculty;
        this.course = course;
        this.group = group;
    }

    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }

    public String getPatronymic() {
        return this.patronymic;
    }

    public String getBirthday() {
        return this.birthday;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhone() {
        return this.phone;
    }

    public String getFaculty() {
        return this.faculty;
    }

    public Integer getCourse() {
        return this.course;
    }

    public Integer getGroup() {
        return this.group;
    }

    public String toString() {
        return String.format("UUID: %d Name: %s Surname: %s Patronymic: %s Birthday: %s Address: %s Phone: %s Faculty: %s Course: %s Group: %s",
                uuid, name, surname, patronymic, birthday, address, phone, faculty, course, group);
    }
}