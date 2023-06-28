
import java.util.List;

public class School {
    private List<Teacher> teachers;
    private List<Student> students;
    private static int totalMoneyEarned;
    private static int totalMoneySpent;

    public School(List<Teacher> teachers, List<Student> students){
        this.teachers = teachers;
        this.students = students;
        totalMoneyEarned = 0;
        totalMoneySpent = 0;
    }

     /** get methods*/
    public List<Teacher> getTeachers() {
        return teachers;
    }
    public List<Student> getStudents() {
        return students;
    }
    public int getTotalMoneySpent() {
        return totalMoneySpent;
    }
    public int getTotalMoneyEarned() {
        return totalMoneyEarned;
    }

    /**
     * set methods
     * - to alter lists of teachers and students is possible
     *   by adding new objects
     * - if a student pays a fee -> money is earned
     *   if a school pays the salary of a teacher -> less money earned, more money spent
     */
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }
    public void addStudent(Student student) {
        students.add(student);
    }
    public static void updateTotalMoneyEarned(int moneyEarned) {
        totalMoneyEarned += moneyEarned;
    }
    public static void updateTotalMoneySpent(int moneySpent) {
        totalMoneyEarned -= moneySpent;
        totalMoneySpent += moneySpent;
    }
}
