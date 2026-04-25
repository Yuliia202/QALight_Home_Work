//Завдання:
//Створіть клас Student з полями: ім'я, прізвище, вік.
//Додайте конструктор, гетери/сетери.
//Додайте метод, який повертає повне ім'я студента.
//Створіть у main масив з 5 студентів, виведіть їх повніімена.


package java_hw_41;

public class Student {
    public static void main(String[] args) {

        StudentConstructor firstStudent = new StudentConstructor("Yuliia", "Palchyk", 28);
        StudentConstructor secondStudent = new StudentConstructor("Olya", "Somova", 18);
        StudentConstructor thirdStudent = new StudentConstructor("Andrii", "Andriychuk", 56);
        StudentConstructor fourStudent = new StudentConstructor("Volodymyr", "Kovalchuk", 34);
        StudentConstructor fiveStudent = new StudentConstructor("Sofia", "Chernenko", 37);
        StudentConstructor[] students = {firstStudent, secondStudent, thirdStudent, fourStudent, fiveStudent};
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].getFullName());
        }
    }
}
