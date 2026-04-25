//Створіть клас Team, який містить масив об'єктів Student.
//Додайте метод для додавання студента в команду.
//Додайте метод для виводу списку студентів.
//Створіть команду, додайте студентів, виведіть список.

package java_hw_44;

public class Student {
    private String name;
    private int age;
    private int grade;

    public Student(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    public String fullInfo() {
        return "Name: " + name +
                " Age: " + age +
                " Grade: " + grade;
    }
}

