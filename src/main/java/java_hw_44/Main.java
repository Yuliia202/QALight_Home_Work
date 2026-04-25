//Створіть клас Team, який містить масив об'єктів Student.
//Додайте метод для додавання студента в команду.
//Додайте метод для виводу списку студентів.
//Створіть команду, додайте студентів, виведіть список.

package java_hw_44;

public class Main {
    public static void main(String[] args) {

        Team team = new Team();

        Student s1 = new Student("Yulia", 28, 100);
        Student s2 = new Student("Anna", 22, 85);
        Student s3 = new Student("Oleg", 30, 70);

        team.addStudent(s1);
        team.addStudent(s2);
        team.addStudent(s3);

        team.printStudents();
    }
}
