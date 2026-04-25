package java_hw_44;

public class Team {

    private Student[] students;
    private int count;

    public Team() {
        students = new Student[10];
        count = 0;
    }

    public void addStudent(Student student) {
        students[count] = student;
        count++;
    }

    public void printStudents() {
        for (int i = 0; i < count; i++) {
            System.out.println(students[i].fullInfo());
        }
    }
}
