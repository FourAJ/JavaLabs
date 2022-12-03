import Student.Student;
import Student.University;

import java.util.List;


public class ClassMethods {
    public static void main(String[] args) {
        University university = new University();
        university.addStudent(new Student(
            "Andrew", "Teas", "Sergeevich",
            "03.11.2000", "Saint-P", "8-999-999-99-99",
            "I&ComputerIngeneering", 4, 4942)
        );
        university.addStudent(new Student(
            "Lena", "Suffer", "Andreevna",
            "18.06.2006", "Saint-P", "8-999-999-99-99",
            "School", 1, 1001
        ));
        university.addStudent(new Student(
            "Stepan", "Stepa1337", "Viktorovich",
            "01.08.2005", "Saint-P", "8-999-999-99-99",
            "School", 1, 1001
        ));
        university.addStudent(new Student(
            "Alex", "Morfixx", "Sergeevich",
            "22.08.1998", "London", "8-999-999-99-99",
            "I&ComputerIngeneering", 4, 9999
        ));

        System.out.println("\n---///-------/// СПИСОК ВСЕХ СТУДЕНТОВ ///------///---");
        List<Student> studentslist = university.getUniversityList();
        for (Student student: studentslist){
            System.out.println(student);
        }

        String Faculty = "School";
        System.out.format("\n---///-------/// СПИСОК СТУДЕНТОВ ФАКУЛЬТЕТА {{ %s }} ///------///---\n", Faculty);
        List<Student> studentsFaculty = university.getSortStudentsFaculty(Faculty);
        for (Student student : studentsFaculty) {
            System.out.println(student);
        }

        Integer Year = 1999;
        System.out.format("\n---///-------/// СПИСОК СТУДЕНТОВ РОДИВШИХСЯ ПОСЛЕ {{ %s }} ///------///---\n", Year);
        List<Student> studentsYears = university.getSortStudentsYear(Year);
        for (Student student : studentsYears) {
            System.out.println(student);
        }

        Integer Group = 4942;
        System.out.format("\n---///-------/// СПИСОК СТУДЕНТОВ ГРУППЫ {{ %s }} ///------///---\n", Group);
        List<Student> studentsGroup = university.getStudentsGroup(Group);
        for (Student student : studentsGroup) {
            System.out.println(student);
        }

        System.out.println("\n---///-------/// СПИСОК СТУДЕНТОВ КАЖДОГО ФАКУЛЬТЕТА И КУРСА ///------///---");
        System.out.println("В РАЗРАБОТКЕ...");
    }
}



//                    ---///-------/// СПИСОК ВСЕХ СТУДЕНТОВ ///------///---
//                    UUID: 10001 Name: Andrew Surname: Teas Patronymic: Sergeevich Birthday: 03.11.2000 Address: Saint-P Phone: 8-999-999-99-99 Faculty: I&ComputerIngeneering Course: 4 Group: 4942
//                    UUID: 10002 Name: Lena Surname: Suffer Patronymic: Andreevna Birthday: 18.06.2006 Address: Saint-P Phone: 8-999-999-99-99 Faculty: School Course: 1 Group: 1001
//                    UUID: 10003 Name: Stepan Surname: Stepa1337 Patronymic: Viktorovich Birthday: 01.08.2005 Address: Saint-P Phone: 8-999-999-99-99 Faculty: School Course: 1 Group: 1001
//                    UUID: 10004 Name: Alex Surname: Morfixx Patronymic: Sergeevich Birthday: 22.08.1998 Address: London Phone: 8-999-999-99-99 Faculty: I&ComputerIngeneering Course: 4 Group: 9999
//
//                    ---///-------/// СПИСОК СТУДЕНТОВ ФАКУЛЬТЕТА {{ School }} ///------///---
//                    UUID: 10002 Name: Lena Surname: Suffer Patronymic: Andreevna Birthday: 18.06.2006 Address: Saint-P Phone: 8-999-999-99-99 Faculty: School Course: 1 Group: 1001
//                    UUID: 10003 Name: Stepan Surname: Stepa1337 Patronymic: Viktorovich Birthday: 01.08.2005 Address: Saint-P Phone: 8-999-999-99-99 Faculty: School Course: 1 Group: 1001
//
//                    ---///-------/// СПИСОК СТУДЕНТОВ РОДИВШИХСЯ ПОСЛЕ {{ 1999 }} ///------///---
//                    UUID: 10001 Name: Andrew Surname: Teas Patronymic: Sergeevich Birthday: 03.11.2000 Address: Saint-P Phone: 8-999-999-99-99 Faculty: I&ComputerIngeneering Course: 4 Group: 4942
//                    UUID: 10002 Name: Lena Surname: Suffer Patronymic: Andreevna Birthday: 18.06.2006 Address: Saint-P Phone: 8-999-999-99-99 Faculty: School Course: 1 Group: 1001
//                    UUID: 10003 Name: Stepan Surname: Stepa1337 Patronymic: Viktorovich Birthday: 01.08.2005 Address: Saint-P Phone: 8-999-999-99-99 Faculty: School Course: 1 Group: 1001
//
//                    ---///-------/// СПИСОК СТУДЕНТОВ ГРУППЫ {{ 4942 }} ///------///---
//                    UUID: 10001 Name: Andrew Surname: Teas Patronymic: Sergeevich Birthday: 03.11.2000 Address: Saint-P Phone: 8-999-999-99-99 Faculty: I&ComputerIngeneering Course: 4 Group: 4942
//
//                    ---///-------/// СПИСОК СТУДЕНТОВ КАЖДОГО ФАКУЛЬТЕТА И КУРСА ///------///---
//                    В РАЗРАБОТКЕ...