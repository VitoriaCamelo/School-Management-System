import java.util.ArrayList;
import java.util.List;
/**
    "School Management System" - "Students, Teachers, fees"
    - functions:
        keep track of students total fees
        fees already paid
        teachers salary
    - school
        teachers, students,
        total money earned,
        total money spent (teachers salary)
*/
public class Main {
  public static void main(String[] args) {
    Teacher ana = new Teacher(1, "Ana", 7000);
    Teacher talita = new Teacher(2, "Talita", 7500);
    Teacher jose = new Teacher(3, "Jose", 7000);
    List<Teacher> teachers = new ArrayList<>();
    teachers.add(ana);
    teachers.add(talita);
    teachers.add(jose);
    
    Student carla = new Student(1, "Carla", 7);
    Student lisa = new Student(2, "Lisa", 8);
   Student luis = new Student(3, "Luis", 7);
    List<Student> students = new ArrayList<>();
    students.add(carla);
    students.add(lisa);
    students.add(luis);

    School ci = new School(teachers, students);   
    lisa.updateFeesPaid(5000);
    System.out.println("Ci has earned: "+ci.getTotalMoneyEarned());
    talita.receiveSalary(talita.getSalary());
    System.out.println("Ci now has: "+ci.getTotalMoneyEarned());
  }
}
